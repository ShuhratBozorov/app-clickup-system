package uz.shuhratbozorov.appclickupsystem.repository;

import uz.shuhratbozorov.appclickupsystem.entity.TimeTracked;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/timeTracked", collectionResourceRel = "list")
public interface TimeTrackedRepository extends JpaRepository<TimeTracked, Long> {
}
