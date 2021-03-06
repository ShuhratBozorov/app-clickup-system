package uz.shuhratbozorov.appclickupsystem.repository;

import uz.shuhratbozorov.appclickupsystem.entity.SpaceUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(path = "/spaceUser", collectionResourceRel = "list")
public interface SpaceUserRepository extends JpaRepository<SpaceUser, UUID> {
    SpaceUser findBySpaceIdAndMemberId(Long space_id, UUID member_id);
    boolean existsBySpaceIdAndMemberId(Long space_id, UUID member_id);
}
