package uz.shuhratbozorov.appclickupsystem.repository;

import uz.shuhratbozorov.appclickupsystem.entity.SpaceView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "/spaceView",collectionResourceRel = "list")
public interface SpaceViewRepository extends JpaRepository<SpaceView, Long> {
    List<SpaceView> findAllBySpaceId(Long space_id);
}
