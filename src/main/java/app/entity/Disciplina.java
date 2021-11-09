package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela DISCIPLINA
* @generated
*/
@Entity
@Table(name = "\"DISCIPLINA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Disciplina")
public class Disciplina implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "nomeDisciplina", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nomeDisciplina;

    /**
    * Construtor
    * @generated
    */
    public Disciplina(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Disciplina setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém nomeDisciplina
    * return nomeDisciplina
    * @generated
    */
    
    public java.lang.String getNomeDisciplina(){
        return this.nomeDisciplina;
    }

    /**
    * Define nomeDisciplina
    * @param nomeDisciplina nomeDisciplina
    * @generated
    */
    public Disciplina setNomeDisciplina(java.lang.String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Disciplina object = (Disciplina)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}