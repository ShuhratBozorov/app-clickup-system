package uz.shuhratbozorov.appclickupsystem.entity;

import lombok.EqualsAndHashCode;
import uz.shuhratbozorov.appclickupsystem.entity.template.AbsUUIDEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TaskUser extends AbsUUIDEntity {
    @ManyToOne(optional = false)
    private Task task;

    @ManyToOne(optional = false)
    private User user;
}
