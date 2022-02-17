package com.sofka.usuarioejemplocrud.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Para mejorar: 
1. Establecer validaciones por columna para denotar más coherencia de uso al momento de insertar datos
2. Sobrecarga de constructores para definir prioridad por defecto al instanciar si se hacen los registros en el main
3. Definición de prioridad por defecto
*/

@Entity
@Table(name="tblusuario")
public class UsuarioModel {
    @Id //Define que va a ser la pk de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true,nullable=false)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(unique=true,nullable=false)
    private String email;

    @Column(nullable=false)
    private Integer prioridad;


    //Getters ans setters    
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
