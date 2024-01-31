import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LoginComponent} from "./login-routing/login.component";
import {RegistroComponent} from "./registro/registro.component";
import {TablatareasComponent} from "./tablatareas/tablatareas.component";
import {AdicionarTareaComponent} from "./adicionar-tarea/adicionar-tarea.component";
const routes: Routes = [

  {
    path: '', component: LoginComponent
  },
  {
    path:'registrar', component: RegistroComponent
  },
  {  path:'tareas/:identidad', component: TablatareasComponent
  },
  {
    path:'adicionartarea/:identidad', component: AdicionarTareaComponent
  }


];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LoginRoutingRoutingModule { }
