package uz.shuhratbozorov.appclickupsystem.repository;

import uz.shuhratbozorov.appclickupsystem.entity.TaskTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/taskTag", collectionResourceRel = "list")
public interface TaskTagRepository extends JpaRepository<TaskTag, Long> {
}
