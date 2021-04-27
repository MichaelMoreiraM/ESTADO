package com.example.Estado.entidad;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tareas")
public class tareas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tarea;
    private String nombre;
    @JsonIgnore
    
    @OneToOne
    @JoinColumn(name="id_estado")
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false, updatable = false)
    private usuario invoice;


    




    /**
     * @return int return the id_tarea
     */
    public int getId_tarea() {
        return id_tarea;
    }

    /**
     * @param id_tarea the id_tarea to set
     */
    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Estado return the estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
