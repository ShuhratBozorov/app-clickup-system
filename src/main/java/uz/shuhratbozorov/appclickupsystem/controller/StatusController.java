package uz.shuhratbozorov.appclickupsystem.controller;

import uz.shuhratbozorov.appclickupsystem.entity.User;
import uz.shuhratbozorov.appclickupsystem.payload.ApiResponse;
import uz.shuhratbozorov.appclickupsystem.payload.CategoryDTO;
import uz.shuhratbozorov.appclickupsystem.payload.StatusDTO;
import uz.shuhratbozorov.appclickupsystem.security.CurrentUser;
import uz.shuhratbozorov.appclickupsystem.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/status")
public class StatusController {
    @Autowired
    StatusService statusService;


    @PostMapping
    public HttpEntity<?> addOrEditStatus(@Valid @RequestBody StatusDTO statusDTO, @CurrentUser User user) {
        ApiResponse apiResponse = statusService.addOrEditStatus(statusDTO, user);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }

    @DeleteMapping("/{sId}")
    public HttpEntity<?> deleteStatus(@PathVariable Long sId, @CurrentUser User user) {
        ApiResponse apiResponse = statusService.deleteStatus(sId, user);
        return ResponseEntity.status(apiResponse.isSuccess() ? 204 : 409).body(apiResponse);
    }

}
