package com.generation.jun02.ejercicio.modelo;

public class Administrativos extends Trabajador {

    //declaracion de variables
    private String tipoAdministrador;
    private String areaACargo;

    //constructores

    public Administrativos() {
    }

    public Administrativos(String tipoAdministrador, String areaACargo) {
        this.tipoAdministrador = tipoAdministrador;
        this.areaACargo = areaACargo;
    }
    //getters y setters


    public String getTipoAdministrador() {
        return tipoAdministrador;
    }

    public void setTipoAdministrador(String tipoAdministrador) {
        this.tipoAdministrador = tipoAdministrador;
    }

    public String getAreaACargo() {
        return areaACargo;
    }

    public void setAreaACargo(String areaACargo) {
        this.areaACargo = areaACargo;
    }
    //metodo toString


    @Override
    public String toString() {
        return "Administrativos{" +
                "tipoAdministrador='" + tipoAdministrador + '\'' +
                ", areaACargo='" + areaACargo + '\'' +
                '}';
    }

    public void trabajoEscritorio(boolean si, boolean areaProfe, boolean areAlumno){
        //analisis de situacion economica alumno, manejo de recursos, estado profesores, postulaciones a concursos municipales, rondas en el colegio, pausa activa.
        if(si && areaProfe && !areAlumno){
            System.out.println("Las tareas asignadas de este administrativo encargado de los profesores son: \n 1.Contabilizar horas trabajadas");
        } else if (si && areAlumno && !areaProfe) {
            System.out.println("Las tareas asignadas de este administrativo encargado de los Alumons son: \n 1.Revision de estado economico de los estudiantes");

        }else if(si && !areAlumno && !areaProfe){
            System.out.println("Las tareas asignadas de este administrativo son: \n 1.Hacer postulaciones a concursos municipales");
        }
        else {
            System.out.println("error en ingreso de datos, o el administrativo abarca muchas horas de trabajo");
        }
    }
}
