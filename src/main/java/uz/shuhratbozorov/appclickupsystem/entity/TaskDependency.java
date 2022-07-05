package uz.shuhratbozorov.appclickupsystem.entity;

import uz.shuhratbozorov.appclickupsystem.entity.enums.DependencyType;
import uz.shuhratbozorov.appclickupsystem.entity.template.AbsLongEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TaskDependency extends AbsLongEntity {
    @ManyToOne
    private Task task;

    @ManyToOne
    private Task dependencyTask;

    @Enumerated(EnumType.STRING)
    private DependencyType dependencyType;
}
