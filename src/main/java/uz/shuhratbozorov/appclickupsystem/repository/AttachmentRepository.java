package uz.shuhratbozorov.appclickupsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.shuhratbozorov.appclickupsystem.entity.Attachment;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, UUID> {
}
