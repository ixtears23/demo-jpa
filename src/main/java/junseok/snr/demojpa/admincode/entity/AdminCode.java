package junseok.snr.demojpa.admincode.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter @Setter
@Entity
@Table(name = "admin_code")
public class AdminCode {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "code_id")
    private int id;
    @Column(name = "reg_dtm", nullable = false, columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP")
    private LocalDateTime regDtm;
    @Column(name = "code_name", length = 50)
    private String codeName;
    @Column(name = "code_value", length = 256)
    private String codeValue;
    @Column(name = "par_code_id")
    private int parCodeId;
    @Column(name = "display_order", length = 5)
    private int displayOrder;
}
