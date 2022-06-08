package tn.Dari.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.Dari.entities.VisitType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
@Getter
@Setter @AllArgsConstructor @NoArgsConstructor
public class RqReserve {
    private Long idUser;
    private Date date;
    private String time;
    private String purpose;
    private String Message;

    private String visitType;
    private Long idAnn;
}
