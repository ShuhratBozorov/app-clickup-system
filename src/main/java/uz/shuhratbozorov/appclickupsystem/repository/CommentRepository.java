package uz.shuhratbozorov.appclickupsystem.repository;

import uz.shuhratbozorov.appclickupsystem.entity.Comment;
import uz.shuhratbozorov.appclickupsystem.entity.View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/comment", collectionResourceRel = "list")
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
