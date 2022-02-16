package com.sofka.usuarioejemplocrud.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblusuario")
public class UsuarioModel {
    @Id //Define que va a ser la pk de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true,nullable=false)
    private Long id;

    //Para mejorar: Establecer validaciones para denotar más coherencia de uso al momento de insertar datos
    private String nombre;
    private String email;
    private Integer prioridad;


    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    


}
