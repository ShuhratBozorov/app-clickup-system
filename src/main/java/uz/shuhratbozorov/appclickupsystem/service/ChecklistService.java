package uz.shuhratbozorov.appclickupsystem.service;

import uz.shuhratbozorov.appclickupsystem.entity.User;
import uz.shuhratbozorov.appclickupsystem.payload.ApiResponse;
import uz.shuhratbozorov.appclickupsystem.payload.CheckListDTO;
import uz.shuhratbozorov.appclickupsystem.payload.CheckListItemDTO;

public interface ChecklistService {
    ApiResponse addOrEditChecklist(CheckListDTO checkListDTO,Long wId, User user);
    ApiResponse deleteChecklist(Long chId, User user);
    ApiResponse addOrEditChecklistItem(CheckListItemDTO checkListItemDTO,Long wId, User user);
    ApiResponse deleteChecklistItem(Long chId, User user);


}
