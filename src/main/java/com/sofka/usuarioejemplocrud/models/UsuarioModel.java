package com.sofka.usuarioejemplocrud.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

/*Para mejorar: 
1. Establecer validaciones por columna para denotar más coherencia de uso al momento de insertar datos: Done
2. Definir valores por defectos para que no se generen vacíos o postman los asuma como null.
3. Establecer restricción del correo para que tenga el '@' y un número para que luzca como un correo: Se instala la dependencia de validación
4. Clase Comparator para ordenar la consulta general de usuarios por nombre o correo
*/

@Entity
@Table(name="tblusuario")
public class UsuarioModel {
    @Id //Define que va a ser la pk de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true,nullable=false)
    private Long id;

    @Column(nullable = false)
    private String nombre="";

    @Pattern(regexp ="([A-z]+[_]+[0-9]+@)+mail.com", message="Correo debe cumplir el siguiente formato: nombre_(numero)@mail.com")
    @Column(unique=true,nullable=false)
    private String email="";

    @Column(nullable=false)
    private Integer prioridad=0;


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
