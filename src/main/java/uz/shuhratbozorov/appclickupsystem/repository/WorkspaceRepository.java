package uz.shuhratbozorov.appclickupsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.shuhratbozorov.appclickupsystem.entity.Workspace;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface WorkspaceRepository extends JpaRepository<Workspace, Long> {
    boolean existsByOwnerIdAndName(UUID owner_id, String name);

    List<Workspace> findAllByOwnerId(UUID owner_id);
}
