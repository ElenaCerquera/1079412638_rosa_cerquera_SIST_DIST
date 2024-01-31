import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup} from "@angular/forms";
import {ActivatedRoute, Router} from "@angular/router";
import {tarea, tareas} from "../../models/Persona";
import {Servicio} from "../services/servicio";

@Component({
  selector: 'app-tablatareas',
  templateUrl: './tablatareas.component.html',
  styleUrls: ['./tablatareas.component.css']
})
export class TablatareasComponent implements OnInit {
  myFormGroup: FormGroup;
  listado: any;
  identidad:any;


  constructor(private formBuilder: FormBuilder, private router: Router,private route: ActivatedRoute, private servicio: Servicio) {
    this.myFormGroup = this.formBuilder.group({
      identidad: [''],
      materia: ['']
    });
  }

  volver() {
    this.router.navigate(['']);
    this.cargarinfo();
  }

  itemsPerPage = 5;
  currentPage = 1;

  ngOnInit() {
    this.currentPage = 1;
    this.cargarinfo();
  }

  get totalPages(): number {
    return Math.ceil(this.listado.length / this.itemsPerPage);
  }

  totalPagesArray(): number[] {
    return Array.from({length: this.totalPages}, (_, i) => i + 1);
  }


  cargarinfo(): void {
console.log("holas")
    this.route.params.subscribe(params => {
      this.identidad = params['identidad'];
    });
console.log(this.identidad)

    const formValues = this.myFormGroup.value;
    let request: tareas = {
      identidad: this.identidad,
      materia: formValues.materia
    }

    this.servicio.publiclistar(request).subscribe({
      next: (dato: tarea) => {
        this.listado = dato;
        console.log(this.listado);

      },
      error: (error) => {
        console.error('Error en el registro:', error);
      }
    });
  }
  limpiar(): void {
    this.route.params.subscribe(params => {
      this.identidad = params['identidad'];
    });
    console.log(this.identidad)
    this.myFormGroup.reset({
      materia: '',
    });
    const formValues = this.myFormGroup.value;
    let request: tareas = {
      identidad: this.identidad,
      materia: ''
    }

    this.servicio.publiclistar(request).subscribe({
      next: (dato: tarea) => {
        this.listado = dato;
        console.log(this.listado);

      },
      error: (error) => {
        console.error('Error en el registro:', error);
      }
    });
  }

  adicionar(){
    this.route.params.subscribe(params => {
      this.identidad = params['identidad'];
      this.router.navigate(['/adicionartarea/', this.identidad])
    });
  }

}
