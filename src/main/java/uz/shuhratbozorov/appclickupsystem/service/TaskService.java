package uz.shuhratbozorov.appclickupsystem.service;

import uz.shuhratbozorov.appclickupsystem.entity.User;
import uz.shuhratbozorov.appclickupsystem.payload.ApiResponse;
import uz.shuhratbozorov.appclickupsystem.payload.TaskAttachmentDTO;
import uz.shuhratbozorov.appclickupsystem.payload.TaskDTO;
import uz.shuhratbozorov.appclickupsystem.payload.TaskUserDTO;

import java.util.UUID;

public interface TaskService {
    ApiResponse addOrEditTask(TaskDTO taskDTO, User user);

    ApiResponse deleteTask(UUID taskId, User user);

    ApiResponse changeStatus(Long statusId, UUID taskId, User user, Long wId);

    ApiResponse addOrDeleteTaskAttachment(TaskAttachmentDTO taskAttachmentDTO, User user);

    ApiResponse addOrDeleteTaskUser(TaskUserDTO taskUserDTO, User user);

}
