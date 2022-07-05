package uz.shuhratbozorov.appclickupsystem.entity;

import uz.shuhratbozorov.appclickupsystem.entity.enums.StatusType;
import uz.shuhratbozorov.appclickupsystem.entity.template.AbsLongEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Status extends AbsLongEntity {

    @Column(nullable = false)
    private String name;

    @ManyToOne(optional = false)
    private Space space;

    @ManyToOne(optional = false)
    private Project project;

    @ManyToOne(optional = false)
    private Category category;

    @Column(nullable = false)
    private String color;

    private StatusType type;


}
