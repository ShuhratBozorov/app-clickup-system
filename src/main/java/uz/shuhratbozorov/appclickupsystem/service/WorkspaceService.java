package uz.shuhratbozorov.appclickupsystem.service;

import uz.shuhratbozorov.appclickupsystem.entity.User;
import uz.shuhratbozorov.appclickupsystem.payload.ApiResponse;
import uz.shuhratbozorov.appclickupsystem.payload.MemberDTO;
import uz.shuhratbozorov.appclickupsystem.payload.WorkspaceDTO;
import uz.shuhratbozorov.appclickupsystem.payload.WorkspaceRoleDTO;

import java.util.UUID;


public interface WorkspaceService {

    ApiResponse addWorkspace(WorkspaceDTO workspaceDTO, User user);

    ApiResponse editWorkspace(Long id, WorkspaceDTO workspaceDTO,User user);

    ApiResponse changeOwnerWorkspace(Long id, UUID ownerId, User user);

    ApiResponse deleteWorkspace(Long id);

    ApiResponse addOrEditOrRemoveWorkspace(Long id, MemberDTO memberDTO,User user);

    ApiResponse joinToWorkspace(Long id, User user);

    ApiResponse getMembersAndGuests(Long id,User user);

    ApiResponse getMyWorkspaces(User user);

    ApiResponse addRole(WorkspaceRoleDTO workspaceRoleDTO,User user);

    ApiResponse addOrRemovePermissionToRole(WorkspaceRoleDTO workspaceRoleDTO,User user);
}
