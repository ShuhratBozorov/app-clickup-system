package uz.shuhratbozorov.appclickupsystem.service;

import uz.shuhratbozorov.appclickupsystem.entity.User;
import uz.shuhratbozorov.appclickupsystem.payload.ApiResponse;
import uz.shuhratbozorov.appclickupsystem.payload.ProjectDTO;
import uz.shuhratbozorov.appclickupsystem.payload.ProjectUserDTO;

public interface ProjectService {

    ApiResponse addProject(ProjectDTO projectDTO, User user);

    ApiResponse editProject(Long projectId, ProjectDTO projectDTO, User user);

    ApiResponse deleteProject(Long projectId, User user);

    ApiResponse addProjectUser(ProjectUserDTO projectUserDTO, User user);

    ApiResponse editProjectUser(Long projectUserId, ProjectUserDTO projectUserDTO, User user);

    ApiResponse deleteProjectUser(Long projectUserId, User user);


}
