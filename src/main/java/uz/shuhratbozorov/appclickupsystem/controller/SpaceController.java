package uz.shuhratbozorov.appclickupsystem.controller;

import uz.shuhratbozorov.appclickupsystem.entity.User;
import uz.shuhratbozorov.appclickupsystem.payload.ApiResponse;
import uz.shuhratbozorov.appclickupsystem.payload.SpaceDTO;
import uz.shuhratbozorov.appclickupsystem.payload.WorkspaceDTO;
import uz.shuhratbozorov.appclickupsystem.security.CurrentUser;
import uz.shuhratbozorov.appclickupsystem.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/space")
public class SpaceController {

    @Autowired
    SpaceService spaceService;


    @PostMapping
    public HttpEntity<?> addWorkspace(@Valid @RequestBody SpaceDTO spaceDTO, @CurrentUser User user) {
        ApiResponse apiResponse = spaceService.addSpace(spaceDTO, user);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }

    @DeleteMapping("/{spaceId}")
    public HttpEntity<?> deleteWorkspace(@PathVariable Long spaceId, @CurrentUser User user) {
        ApiResponse apiResponse = spaceService.deleteSpace(spaceId, user);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }

    @GetMapping("/viewsBySpaceId")
    public HttpEntity<?> getViewsBySpaceId(@RequestParam Long sId, @CurrentUser User user) {
        ApiResponse apiResponse = spaceService.getViewsBySpaceId(sId, user);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }

}
