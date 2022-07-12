package uz.shuhratbozorov.appclickupsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.shuhratbozorov.appclickupsystem.entity.WorkspaceRole;

import java.util.UUID;

public interface WorkspaceRoleRepository extends JpaRepository<WorkspaceRole, UUID> {
    boolean existsByNameAndWorkSpaceId(String name, Long workSpace_id);
    WorkspaceRole findByName(String name);

}
