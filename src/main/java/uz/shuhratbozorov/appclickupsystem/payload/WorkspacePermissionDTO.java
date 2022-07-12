package uz.shuhratbozorov.appclickupsystem.payload;

import uz.shuhratbozorov.appclickupsystem.entity.enums.WorkspacePermissionName;
import uz.shuhratbozorov.appclickupsystem.entity.enums.WorkspaceRoleName;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
public class WorkspacePermissionDTO {
    @NotNull
    private UUID workspaceRoleId;

    @NotNull
    private WorkspacePermissionName permission;

}
