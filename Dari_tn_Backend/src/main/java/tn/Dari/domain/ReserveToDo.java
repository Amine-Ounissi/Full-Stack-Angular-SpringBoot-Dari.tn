package tn.Dari.domain;

import lombok.*;

import java.util.Date;
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class ReserveToDo {
    private Long id;
    private String UserName;
    private String AnnonceImage;
    private Date date;
    private String time;

}
