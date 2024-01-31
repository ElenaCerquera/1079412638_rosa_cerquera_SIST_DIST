export interface cuerpoUser{
id?:number,
  identidad:string,
  nombre:string,
  contrasena:string
}
export interface loginDto{
  identidad:string,
  contrasena:string
}
export interface tareas{
  identidad:string;
  materia?:string;
}

  export interface tarea{

    nombreusuario?:string,
    id?:number,
    nombre?:string,
  descripcion?:string,
    fechaInicio?:Date,
    fechaFin?:Date,
    estadoTarea?:string

}
export interface  cuerpoAdicionartarea{
   nombre: string;
   descripcion: string;
   fechaInicio: Date;
  fechaFin: Date;
   estadoTarea: string;
   identidad: string;
}

