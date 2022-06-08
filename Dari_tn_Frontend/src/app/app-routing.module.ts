import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AnnouncementDetailsComponent } from './announcement-details/announcement-details.component';
import { CrudAnnouncementComponent } from './crud-announcement/crud-announcement.component';
import { LoanComponent } from './loan/loan.component';
import { LoginUpComponent } from './login-up/login-up.component';
import { LoginComponent } from './login/login.component';
import { MapComponent } from './map/map.component';
import { PageComponent } from './page/page.component';
import { PaymentComponent } from './payment/payment.component';
import { ReserveComponent } from './reserve/reserve.component';
import { UpdateAnnouncementComponent } from './update-announcement/update-announcement.component';

const routes: Routes = [
   { path: 'reserve/:id', component: ReserveComponent },
  { path: 'payment', component: PaymentComponent },
  { path: 'loan', component: LoanComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: LoginUpComponent },
  { path: 'announcements', component: PageComponent },
  { path: 'map', component: MapComponent },
  { path: 'crud-announcement', component: CrudAnnouncementComponent },
  { path: 'update-announcement/:id', component: UpdateAnnouncementComponent },
  { path: 'announcement-details/:id', component: AnnouncementDetailsComponent },
  { path: '', redirectTo: 'announcements', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
