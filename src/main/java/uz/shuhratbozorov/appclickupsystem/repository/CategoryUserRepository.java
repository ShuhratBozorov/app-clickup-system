package uz.shuhratbozorov.appclickupsystem.repository;

import uz.shuhratbozorov.appclickupsystem.entity.CategoryUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CategoryUserRepository extends JpaRepository<CategoryUser, Long> {
    List<CategoryUser> findAllByUserId(UUID user_id);
}
