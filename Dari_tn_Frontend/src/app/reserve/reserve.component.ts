import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { VisiteService } from '../services/visite.service';
import { Visite } from './visite';


@Component({
  selector: 'app-reserve',
  templateUrl: './reserve.component.html',
  styleUrls: ['./reserve.component.css']
})
export class ReserveComponent implements OnInit {


  Visite: Visite = new Visite();
  submitted = false;
  message:string;
  imgAnc: any;



  constructor(
    private visiteService: VisiteService,
    private router: Router, private route: ActivatedRoute,
    private httpClient: HttpClient /***************/
    ) { this.message="";this.imgAnc=""}

  ngOnInit(): void {

  }

  addReservation()
  {
    let rq={}
  }
    newVisite(): void {
      this.submitted = false;
      this.Visite = new Visite();
    }

    save() {
      this.Visite.idUser=localStorage.getItem('idUSer');
      this.Visite.idAnn=this.route.snapshot.params['id'];
      console.log(this.Visite)
      this.visiteService
      .addReserve(this.Visite).subscribe((data:any) => {
        console.log(data)
        this.imgAnc=data.annonceImage
        this.message=" Reserved for "+data.userName+ "at :"+ data.date+" "+data.time
        this.Visite = new Visite();
      },
      error => console.log(error));
    }

    onSubmit() {
      this.submitted = true;
      this.save();
    }
    deleteVisite(visite: object) {
      this.visiteService.deleteVisite(visite)
        .subscribe(
          data => {
            console.log(data);
            this.Visite = new Visite();
          },
          error => console.log(error));
        }
        reloadCurrentPage() {
          window.location.reload();
         }
    }


