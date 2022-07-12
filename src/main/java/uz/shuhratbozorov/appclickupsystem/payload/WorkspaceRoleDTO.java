package uz.shuhratbozorov.appclickupsystem.payload;

import uz.shuhratbozorov.appclickupsystem.entity.enums.OperationType;
import uz.shuhratbozorov.appclickupsystem.entity.enums.WorkspacePermissionName;
import uz.shuhratbozorov.appclickupsystem.entity.enums.WorkspaceRoleName;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
public class WorkspaceRoleDTO {
    private UUID id;

    @NotNull
    private Long workspaceId;

    @NotNull
    private String name;

    private WorkspaceRoleName extendsRole;

    private WorkspacePermissionName permissionName;

    private OperationType operationType;

}
