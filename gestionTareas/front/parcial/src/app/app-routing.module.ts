import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LoginRoutingModule} from "./login/login-routing.module";

const routes: Routes = [

  {
    path: '',
  loadChildren: () => LoginRoutingModule,
},
  ]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
