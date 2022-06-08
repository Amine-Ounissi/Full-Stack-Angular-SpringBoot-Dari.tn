package tn.Dari.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
public class Reserve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long  idU;
    @OneToOne()
    private User user;
    @OneToOne()
    private Announcement announcement;
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-mm-dd")
    Date date;
    String time;
    String purpose;
    String Message;
    @Enumerated(EnumType.STRING)
    private VisitType visitType;


}
