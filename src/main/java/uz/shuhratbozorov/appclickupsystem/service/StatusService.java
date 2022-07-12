package uz.shuhratbozorov.appclickupsystem.service;

import uz.shuhratbozorov.appclickupsystem.entity.User;
import uz.shuhratbozorov.appclickupsystem.payload.ApiResponse;
import uz.shuhratbozorov.appclickupsystem.payload.StatusDTO;

public interface StatusService {
    ApiResponse addOrEditStatus(StatusDTO statusDTO, User user);
    ApiResponse deleteStatus(Long statusId, User user);

}
