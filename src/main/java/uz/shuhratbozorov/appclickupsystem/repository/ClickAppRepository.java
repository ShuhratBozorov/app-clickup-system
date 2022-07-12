package uz.shuhratbozorov.appclickupsystem.repository;

import uz.shuhratbozorov.appclickupsystem.entity.ClickApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/clickApp",collectionResourceRel = "list")
public interface ClickAppRepository extends JpaRepository<ClickApp, Long> {
}
