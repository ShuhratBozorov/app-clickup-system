package uz.shuhratbozorov.appclickupsystem.entity;


import uz.shuhratbozorov.appclickupsystem.entity.enums.TaskPermission;
import uz.shuhratbozorov.appclickupsystem.entity.template.AbsLongEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProjectUser extends AbsLongEntity {
    @ManyToOne
    private Project project;

    @ManyToOne
    private User user;


    @Enumerated(EnumType.STRING)
    private TaskPermission taskPermission;
}
