import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

import {Observable, throwError} from "rxjs";
import {catchError} from "rxjs/operators";
import {cuerpoAdicionartarea, cuerpoUser, loginDto, tarea, tareas} from "../../models/Persona";

@Injectable({
  providedIn: 'root'
})
export class Servicio {

  constructor(private http: HttpClient) {
  }

    // 'http://localhost:8080/api'
    publiclistar(request: tareas): Observable<tarea>{
      return this.http.post<tarea>(`http://localhost:8080/tarea/filtro`,request)

    }

  login(request: loginDto): Observable<boolean> {
    return this.http.post<boolean>(`http://localhost:8080/usuario/login`,request);

  }

  public registrar(request:cuerpoUser): Observable<any>{
      return this.http.post<any>(`http://localhost:8080/usuario/save`,request);
    }

    adicionarTarea(request: cuerpoAdicionartarea): Observable<any>{
    return this.http.post(`http://localhost:8080/tarea/guardartarea`,request);
    }

}
