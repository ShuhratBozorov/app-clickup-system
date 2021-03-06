package uz.shuhratbozorov.appclickupsystem.repository;

import uz.shuhratbozorov.appclickupsystem.entity.CheckList;
import uz.shuhratbozorov.appclickupsystem.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CheckListRepository extends JpaRepository<CheckList, Long> {
    boolean existsByNameAndTaskId(String name, UUID task_id);
    boolean existsByNameAndTaskIdNot(String name, UUID task_id);
}
