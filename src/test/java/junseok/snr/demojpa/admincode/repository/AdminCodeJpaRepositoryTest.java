package junseok.snr.demojpa.admincode.repository;

import junseok.snr.demojpa.admincode.entity.AdminCode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@Transactional
@SpringBootTest
@Rollback(value = false)
class AdminCodeJpaRepositoryTest {

    @Autowired AdminCodeJpaRepository adminCodeJpaRepository;

    @Test
    void testAdminCode() {
        final AdminCode adminCode = new AdminCode();
        adminCode.setCodeName("PASS_MODIFY_TYPE");
        adminCode.setCodeValue("이용권 주문환불 타입");
        adminCode.setRegDtm(LocalDateTime.now());

        final AdminCode savedAdminCode = adminCodeJpaRepository.save(adminCode);
        final AdminCode findAdminCode = adminCodeJpaRepository.find(savedAdminCode.getId());

        assertThat(findAdminCode.getCodeName()).isEqualTo(adminCode.getCodeName());
    }
}