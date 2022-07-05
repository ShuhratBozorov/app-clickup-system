package uz.shuhratbozorov.appclickupsystem.entity;


import uz.shuhratbozorov.appclickupsystem.entity.template.AbsUUIDEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TaskHistory extends AbsUUIDEntity {
    @ManyToOne
    private Task task;

    @Column(nullable = false)
    private String changeFieldName;

    private String before;
    private String after;
    private String data;
}
