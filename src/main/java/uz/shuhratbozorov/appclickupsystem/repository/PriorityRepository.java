package uz.shuhratbozorov.appclickupsystem.repository;

import uz.shuhratbozorov.appclickupsystem.entity.Comment;
import uz.shuhratbozorov.appclickupsystem.entity.Priority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/priority", collectionResourceRel = "list")
public interface PriorityRepository extends JpaRepository<Priority, Long> {
}
