package junseok.snr.demojpa.admincode.repository;

import junseok.snr.demojpa.admincode.entity.AdminCode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
@Rollback(value = false)
class AdminCodeRepositoryTest {

    @Autowired AdminCodeRepository adminCodeRepository;

    @Test
    void testAdminCode() {
        final AdminCode adminCode = new AdminCode();
        adminCode.setCodeName("PASS_MODIFY_TYPE");
        adminCode.setCodeValue("이용권 주문환불 타입");
        adminCode.setRegDtm(LocalDateTime.now());

        final AdminCode savedAdminCode = adminCodeRepository.save(adminCode);
        final AdminCode findAdminCode = adminCodeRepository.findById(savedAdminCode.getId()).get();

        assertThat(findAdminCode.getId()).isEqualTo(adminCode.getId());
        assertThat(findAdminCode.getCodeName()).isEqualTo(adminCode.getCodeName());
        assertThat(findAdminCode).isEqualTo(adminCode);
    }

}