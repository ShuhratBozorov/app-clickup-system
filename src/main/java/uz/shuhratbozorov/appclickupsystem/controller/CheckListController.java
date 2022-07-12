package uz.shuhratbozorov.appclickupsystem.controller;

import uz.shuhratbozorov.appclickupsystem.entity.User;
import uz.shuhratbozorov.appclickupsystem.payload.ApiResponse;
import uz.shuhratbozorov.appclickupsystem.payload.CheckListDTO;
import uz.shuhratbozorov.appclickupsystem.payload.CheckListItemDTO;
import uz.shuhratbozorov.appclickupsystem.payload.StatusDTO;
import uz.shuhratbozorov.appclickupsystem.security.CurrentUser;
import uz.shuhratbozorov.appclickupsystem.service.ChecklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/checklist")
public class CheckListController {
    @Autowired
    ChecklistService checklistService;


    @PostMapping
    public HttpEntity<?> addOrEditChecklist(@Valid @RequestBody CheckListDTO checkListDTO, @RequestParam Long wId, @CurrentUser User user) {
        ApiResponse apiResponse = checklistService.addOrEditChecklist(checkListDTO, wId, user);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }

    @DeleteMapping("/{chId}")
    public HttpEntity<?> deleteChecklist(@PathVariable Long chId, @CurrentUser User user) {
        ApiResponse apiResponse = checklistService.deleteChecklist(chId, user);
        return ResponseEntity.status(apiResponse.isSuccess() ? 204 : 409).body(apiResponse);
    }


    @PostMapping
    public HttpEntity<?> addOrEditChecklistItem(@Valid @RequestBody CheckListItemDTO checkListItemDTO, @RequestParam Long wId, @CurrentUser User user) {
        ApiResponse apiResponse = checklistService.addOrEditChecklistItem(checkListItemDTO, wId, user);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }


    @DeleteMapping("/checklistItem/{chId}")
    public HttpEntity<?> deleteChecklistItem(@PathVariable Long chId, @CurrentUser User user) {
        ApiResponse apiResponse = checklistService.deleteChecklistItem(chId, user);
        return ResponseEntity.status(apiResponse.isSuccess() ? 204 : 409).body(apiResponse);
    }
}
