package com.example.Estado.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_ESTADO;
    private String DETALLE;


    
    

    /**
     * @return int return the ID_ESTADO
     */
    public int getID_ESTADO() {
        return ID_ESTADO;
    }

    /**
     * @param ID_ESTADO the ID_ESTADO to set
     */
    public void setID_ESTADO(int ID_ESTADO) {
        this.ID_ESTADO = ID_ESTADO;
    }

    /**
     * @return String return the DETALLE
     */
    public String getDETALLE() {
        return DETALLE;
    }

    /**
     * @param DETALLE the DETALLE to set
     */
    public void setDETALLE(String DETALLE) {
        this.DETALLE = DETALLE;
    }

}
