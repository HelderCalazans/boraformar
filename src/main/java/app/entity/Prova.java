package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PROVA
* @generated
*/
@Entity
@Table(name = "\"PROVA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Prova")
public class Prova implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "codProva", nullable = false, insertable=true, updatable=true)
        private java.lang.String codProva = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private User user;

    /**
    * Construtor
    * @generated
    */
    public Prova(){
    }

    /**
    * Obtém codProva
    * return codProva
    * @generated
    */
    
    public java.lang.String getCodProva(){
        return this.codProva;
    }

    /**
    * Define codProva
    * @param codProva codProva
    * @generated
    */
    public Prova setCodProva(java.lang.String codProva){
        this.codProva = codProva;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    
    public User getUser(){
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public Prova setUser(User user){
        this.user = user;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Prova object = (Prova)obj;
        if (codProva != null ? !codProva.equals(object.codProva) : object.codProva != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((codProva == null) ? 0 : codProva.hashCode());
        return result;
    }

}