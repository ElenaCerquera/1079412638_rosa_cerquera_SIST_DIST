import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LoginRoutingRoutingModule } from './login-routing-routing.module';
import {LoginComponent} from "./login-routing/login.component";
import {RegistroComponent} from "./registro/registro.component";
import {TablatareasComponent} from "./tablatareas/tablatareas.component";
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {AdicionarTareaComponent} from "./adicionar-tarea/adicionar-tarea.component";



@NgModule({
  declarations: [
    LoginComponent,
    RegistroComponent,
    TablatareasComponent,
    AdicionarTareaComponent


  ],
  imports: [
    CommonModule,
    LoginRoutingRoutingModule,
    ReactiveFormsModule,
    FormsModule
  ]
})
export class LoginRoutingModule { }
