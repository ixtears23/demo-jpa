package junseok.snr.demojpa.admincode.repository;

import junseok.snr.demojpa.admincode.entity.AdminCode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AdminCodeJpaRepository {

    @PersistenceContext
    private EntityManager em;

    public AdminCode save(AdminCode adminCode) {
        em.persist(adminCode);
        return adminCode;
    }

    public AdminCode find(Integer id) {
        return em.find(AdminCode.class, id);
    }

}
