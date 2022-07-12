package uz.shuhratbozorov.appclickupsystem.service;

import uz.shuhratbozorov.appclickupsystem.entity.User;
import uz.shuhratbozorov.appclickupsystem.payload.ApiResponse;
import uz.shuhratbozorov.appclickupsystem.payload.SpaceDTO;

public interface SpaceService {

    ApiResponse addSpace(SpaceDTO spaceDTO, User user);

    ApiResponse deleteSpace(Long spaceId, User user);

    ApiResponse getViewsBySpaceId(Long sId, User user);


}
