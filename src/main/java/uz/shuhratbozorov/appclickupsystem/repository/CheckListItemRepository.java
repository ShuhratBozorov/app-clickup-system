package uz.shuhratbozorov.appclickupsystem.repository;

import uz.shuhratbozorov.appclickupsystem.entity.CheckListItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/checkListItem", collectionResourceRel = "list")
public interface CheckListItemRepository extends JpaRepository<CheckListItem, Long> {
}
