import { Component } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {Servicio} from "../services/servicio";
import {cuerpoAdicionartarea, cuerpoUser} from "../../models/Persona";

@Component({
  selector: 'app-adicionar-tarea',
  templateUrl: './adicionar-tarea.component.html',
  styleUrls: ['./adicionar-tarea.component.css']
})
export class AdicionarTareaComponent {
  AdicionarTarea: FormGroup;
  mostrarErrores : boolean = false;
  identidad:any;


  constructor(private router: Router, private fb: FormBuilder, private servi: Servicio, private route: ActivatedRoute) {


    this.AdicionarTarea = this.fb.group({
      nombre:['',[Validators.required]],
      descripcion: ['',[Validators.required]],
      fechaInicio: ['',[Validators.required]],
      fechaFin: ['',[Validators.required]],
      estadoTarea: ['',[Validators.required]],
    })
  }

volver() {
  this.route.params.subscribe(params => {
    this.identidad = params['identidad'];
  });
  this.router.navigate(['/tareas/', this.identidad])
}


  guardar() {
    this.mostrarErrores = true;
    this.route.params.subscribe(params => {
      this.identidad = params['identidad'];
    });
    console.log(this.AdicionarTarea)
    if (this.AdicionarTarea.valid) {

      const formValues = this.AdicionarTarea.value;
      let request: cuerpoAdicionartarea = {

        nombre: formValues.nombre,
        descripcion: formValues.descripcion,
        fechaInicio: formValues.fechaInicio,
        fechaFin: formValues.fechaFin,
        estadoTarea: formValues.estadoTarea,
        identidad: this.identidad
      };

      this.servi.adicionarTarea(request).subscribe({
        next: (response) => {
          alert("registro Exitoso");
          this.volver();
        },
        error: (error) => {
          console.error('Error en el registro:', error);
        }
      });
    }
  }

}
