import { Component } from '@angular/core';
import {Router} from "@angular/router";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Servicio} from "../services/servicio";
import {cuerpoUser, loginDto} from "../../models/Persona";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  IniciarForm: FormGroup;



  constructor(private router: Router, private fb: FormBuilder, private servicio : Servicio) {

    this.IniciarForm = this.fb.group({
      identidad:['',[Validators.required]],
      contrasena:['',[Validators.required]]
    })
  }

  registrar() {
    this.router.navigate(['/registrar']);
  }

  tareas(){
    this.router.navigate(['/tareas/', ])
  }

  login() {
    if (this.IniciarForm.valid) {

      const formvalues = this.IniciarForm.value;
    let request :loginDto=
    {
      identidad: formvalues.identidad,
      contrasena: formvalues.contrasena
    }

    this.servicio.login(request).subscribe(
      (response: boolean) => {
        if (response) {
          // El login fue exitoso
          console.log(response);
          alert("login exitoso")
          this.router.navigate(['/tareas/',formvalues.identidad])
          } else {
          alert("Por favor indique un numero de identidad y contraseña valida")

        }
      },
      (error) => {
        // Manejo de errores
        console.error('Error en la solicitud de login:', error);
        alert("Por favor indique un numero de identidad y contraseña valida ")

      }
    );
  }
}

}
