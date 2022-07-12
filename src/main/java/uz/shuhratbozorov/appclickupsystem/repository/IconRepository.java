package uz.shuhratbozorov.appclickupsystem.repository;

import uz.shuhratbozorov.appclickupsystem.entity.Icon;
import uz.shuhratbozorov.appclickupsystem.entity.SpaceUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(path = "/icon", collectionResourceRel = "list")
public interface IconRepository extends JpaRepository<Icon, Long> {
}
