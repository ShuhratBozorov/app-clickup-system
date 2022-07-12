package uz.shuhratbozorov.appclickupsystem.controller;

import uz.shuhratbozorov.appclickupsystem.entity.User;
import uz.shuhratbozorov.appclickupsystem.payload.*;
import uz.shuhratbozorov.appclickupsystem.security.CurrentUser;
import uz.shuhratbozorov.appclickupsystem.service.CategoryService;
import uz.shuhratbozorov.appclickupsystem.service.WorkspaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;


    @PostMapping
    public HttpEntity<?> addOrEditCategory(@Valid @RequestBody CategoryDTO categoryDTO, @CurrentUser User user) {
        ApiResponse apiResponse = categoryService.addOrEditCategory(categoryDTO, user);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }

    @DeleteMapping("/{cId}")
    public HttpEntity<?> deleteCategory(@PathVariable Long cId, @CurrentUser User user) {
        ApiResponse apiResponse = categoryService.deleteCategory(cId, user);
        return ResponseEntity.status(apiResponse.isSuccess() ? 204 : 409).body(apiResponse);
    }

    @PostMapping("/addUser")
    public HttpEntity<?> addCategoryUser(@RequestParam Long cId, @Valid @RequestBody CategoryUserDTO categoryUserDTO, @CurrentUser User user) {
        ApiResponse apiResponse = categoryService.addCategoryUser(cId, categoryUserDTO, user);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }

    @DeleteMapping("/categoryUser/{categoryUserId}")
    public HttpEntity<?> deleteCategoryUser(@PathVariable Long categoryUserId, @CurrentUser User user) {
        ApiResponse apiResponse = categoryService.deleteCategoryUser(categoryUserId, user);
        return ResponseEntity.status(apiResponse.isSuccess() ? 204 : 409).body(apiResponse);
    }

    @GetMapping("/categoriesByUserId")
    public HttpEntity<?> getAllCategoriesByUserId(@RequestParam UUID uId, @CurrentUser User user) {
        ApiResponse apiResponse = categoryService.getAllCategoriesByUserId(uId, user);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }
}
