package junseok.snr.demojpa.admincode.controller;

import junseok.snr.demojpa.admincode.entity.AdminCode;
import junseok.snr.demojpa.admincode.repository.AdminCodeJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/admin-code")
public class AdminCodeController {
    private final AdminCodeJpaRepository adminCodeJpaRepository;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    public void createAdminCode(@RequestBody AdminCode adminCode) {
        adminCodeJpaRepository.save(adminCode);
    }


    @ResponseStatus(HttpStatus.OK)
    @PatchMapping
    public void updateAdminCode(@RequestBody AdminCode adminCode) {
        adminCodeJpaRepository.save(adminCode);
    }

}
