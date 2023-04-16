package junseok.snr.demojpa.admincode.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter @Setter
@Entity
@Table(uniqueConstraints = @UniqueConstraint(name = "uk1_admin_code", columnNames = {"parCodeId", "codeName"}))
public class AdminCode {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP")
    private LocalDateTime regDtm;
    @Column(length = 50)
    private String codeName;
    @Column(length = 256)
    private String codeValue;
    private int parCodeId;
    @Column(length = 5)
    private int displayOrder;
}
