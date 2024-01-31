import { Component } from '@angular/core';
import {Router} from "@angular/router";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Servicio} from "../services/servicio";
import {cuerpoUser} from "../../models/Persona";

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent {
  RegistroForm: FormGroup;
  mostrarErrores: boolean = false;



  constructor(private router: Router, private fb: FormBuilder, private servi: Servicio) {

    this.RegistroForm = this.fb.group({
      identidad:['',[Validators.required]],
      nombre: ['',[Validators.required]],
      contrasena: ['',[Validators.required]]
    })
  }

  iniciar() {
    this.router.navigate(['']);
  }


  guardar() {
    this.mostrarErrores = true;

    if (this.RegistroForm.valid) {

      const formValues = this.RegistroForm.value;
      let request: cuerpoUser = {
        identidad: formValues.identidad,
        nombre: formValues.nombre,
        contrasena: formValues.contrasena
      };

      this.servi.registrar(request).subscribe({
        next: (response) => {
          alert("registro Exitoso");
          this.iniciar();
        },
        error: (error) => {
          console.error('Error en el registro:', error);
        }
      });
    }
  }
}
