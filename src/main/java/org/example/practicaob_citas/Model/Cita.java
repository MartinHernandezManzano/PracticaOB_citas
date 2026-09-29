package org.example.practicaob_citas.Model;

public class Cita {

    private String especialidadMedica;
    private String tipoCita;
    private String fechaCita;
    private String servicioAdicional;
    private String DNI;
    private String nombre;

    public Cita() {
    }

    public Cita(String nombre, String especialidadMedica, String tipoCita, String fechaCita, String servicioAdicional, String DNI) {
        this.nombre = nombre;
        this.especialidadMedica = especialidadMedica;
        this.tipoCita = tipoCita;
        this.fechaCita = fechaCita;
        this.servicioAdicional = servicioAdicional;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidadMedica() {
        return especialidadMedica;
    }

    public void setEspecialidadMedica(String especialidadMedica) {
        this.especialidadMedica = especialidadMedica;
    }

    public String getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getServicioAdicional() {
        return servicioAdicional;
    }

    public void setServicioAdicional(String servicioAdicional) {
        this.servicioAdicional = servicioAdicional;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
