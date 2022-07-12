package uz.shuhratbozorov.appclickupsystem.service;

import uz.shuhratbozorov.appclickupsystem.entity.User;
import uz.shuhratbozorov.appclickupsystem.payload.ApiResponse;
import uz.shuhratbozorov.appclickupsystem.payload.CategoryDTO;
import uz.shuhratbozorov.appclickupsystem.payload.CategoryUserDTO;

import java.util.UUID;

public interface CategoryService {
    ApiResponse addOrEditCategory(CategoryDTO categoryDTO, User user);

    ApiResponse deleteCategory(Long cId, User user);

    ApiResponse addCategoryUser(Long wId, CategoryUserDTO categoryUserDTO, User user);

    ApiResponse deleteCategoryUser(Long categoryUserId, User user);

    ApiResponse getAllCategoriesByUserId(UUID uId, User user);
}
