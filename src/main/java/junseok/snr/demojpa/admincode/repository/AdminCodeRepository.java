package junseok.snr.demojpa.admincode.repository;

import junseok.snr.demojpa.admincode.entity.AdminCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminCodeRepository extends JpaRepository<AdminCode, Integer> {
}
