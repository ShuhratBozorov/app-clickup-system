package uz.shuhratbozorov.appclickupsystem.entity;

import lombok.EqualsAndHashCode;
import uz.shuhratbozorov.appclickupsystem.entity.enums.WorkspacePermissionName;
import uz.shuhratbozorov.appclickupsystem.entity.template.AbsUUIDEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkspacePermission extends AbsUUIDEntity {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private WorkspaceRole workspaceRole;

    @Enumerated(EnumType.STRING)
    private WorkspacePermissionName permission;

}
