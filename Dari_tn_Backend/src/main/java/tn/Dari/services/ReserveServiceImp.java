package tn.Dari.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.Dari.domain.ReserveToDo;
import tn.Dari.domain.RqReserve;
import tn.Dari.entities.Reserve;
import tn.Dari.repository.ReserveRepository;

@Service
@AllArgsConstructor
public class ReserveServiceImp implements ReserveService{
    private ReserveRepository reserveRepository;
    private UserServices userServices;
    private AnnouncementService announcementService;
    @Override
    public ReserveToDo add(RqReserve rqReserve)
    {
        final Reserve reserve=new Reserve();
        if (rqReserve.getIdUser() != null)
        {
            reserve.setUser(userServices.findById(rqReserve.getIdUser()).get());
        }else return null;
        if (rqReserve.getIdAnn() != null)
        {
            reserve.setAnnouncement(announcementService.findbyid(rqReserve.getIdAnn()));
        }else return null;
        reserve.setDate(rqReserve.getDate());
        reserve.setMessage(rqReserve.getMessage());
        reserve.setTime(rqReserve.getTime());

        return reserveToReserveToDo(reserveRepository.save(reserve),new ReserveToDo());
    }
    private ReserveToDo reserveToReserveToDo(final Reserve reserve , final ReserveToDo reserveToDo)
    {
        reserveToDo.setAnnonceImage(reserve.getAnnouncement().getImg());
        reserveToDo.setDate(reserve.getDate());
        reserveToDo.setTime(reserve.getTime());
        reserveToDo.setUserName(reserve.getUser().getName()+" "+reserve.getUser().getLastName());
        return reserveToDo;
    }
}
