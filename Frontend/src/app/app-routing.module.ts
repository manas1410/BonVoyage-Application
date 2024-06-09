import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PackagesComponent } from './packages/packages.component';
import { HomePageComponent } from './home-page/home-page.component';
import { ItenaryComponent } from './itenary/itenary.component';
import { LoginComponent } from './login/login.component';
import { AboutUsComponent } from './about-us/about-us.component';

const routes: Routes = [
  { path: 'packages/:name', component: PackagesComponent },
  { path: '', component:HomePageComponent},
  { path: 'packages/:name/itenary/:id',component:ItenaryComponent},
  { path: 'login',component: LoginComponent},
  { path: 'aboutus',component:AboutUsComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
