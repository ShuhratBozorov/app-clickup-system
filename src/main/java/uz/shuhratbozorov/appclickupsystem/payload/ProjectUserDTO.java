package uz.shuhratbozorov.appclickupsystem.payload;

import uz.shuhratbozorov.appclickupsystem.entity.Workspace;
import uz.shuhratbozorov.appclickupsystem.entity.enums.TaskPermission;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
public class ProjectUserDTO {
    @NotNull
    private Long projectId;

    @NotNull
    private UUID userId;

    @NotNull
    private TaskPermission taskPermission;

    @NotNull
    private Long workspaceId;


}
