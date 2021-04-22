package com.example.Estado.entidad;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="usuario")
public class usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_USUARIO;
    private String NOMBRE;
    private String APELLIDO;
    private String CORREO;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ID_ESTADO")
    private Estado estado;





    /**
     * @return int return the ID_USUARIO
     */
    public int getID_USUARIO() {
        return ID_USUARIO;
    }

    /**
     * @param ID_USUARIO the ID_USUARIO to set
     */
    public void setID_USUARIO(int ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
    }

    /**
     * @return String return the NOMBRE
     */
    public String getNOMBRE() {
        return NOMBRE;
    }

    /**
     * @param NOMBRE the NOMBRE to set
     */
    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    /**
     * @return String return the APELLIDO
     */
    public String getAPELLIDO() {
        return APELLIDO;
    }

    /**
     * @param APELLIDO the APELLIDO to set
     */
    public void setAPELLIDO(String APELLIDO) {
        this.APELLIDO = APELLIDO;
    }

    /**
     * @return String return the CORREO
     */
    public String getCORREO() {
        return CORREO;
    }

    /**
     * @param CORREO the CORREO to set
     */
    public void setCORREO(String CORREO) {
        this.CORREO = CORREO;
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
