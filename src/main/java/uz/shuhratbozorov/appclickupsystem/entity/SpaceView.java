package uz.shuhratbozorov.appclickupsystem.entity;

import uz.shuhratbozorov.appclickupsystem.entity.template.AbsLongEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SpaceView extends AbsLongEntity {
    @ManyToOne(optional = false)
    private Space space;

    @ManyToOne(optional = false)
    private View view;
}
