package uz.shuhratbozorov.appclickupsystem.payload;

import uz.shuhratbozorov.appclickupsystem.entity.enums.StatusType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatusDTO {
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private Long spaceId;

    @NotNull
    private Long projectId;

    @NotNull
    private Long categoryId;

    private String color;

    private StatusType statusType;

    private Long workspaceId;

}
