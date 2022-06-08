package tn.Dari.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.Dari.domain.ReserveToDo;
import tn.Dari.domain.RqReserve;
import tn.Dari.services.ReserveService;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
public class ReserveController {
    private ReserveService reserveService;
    @PostMapping("/add-reserve")
    public ResponseEntity <?> reserveAnnouncement(@RequestBody RqReserve rqReserve)
    {
        return new ResponseEntity<ReserveToDo>(this.reserveService.add(rqReserve), HttpStatus.OK);

    }
}
