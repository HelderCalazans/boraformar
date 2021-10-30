package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela NIVELQUESTAO
* @generated
*/
@Entity
@Table(name = "\"NIVELQUESTAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.NivelQuestao")
public class NivelQuestao implements Serializable {

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
    @Column(name = "nivel", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nivel;

    /**
    * Construtor
    * @generated
    */
    public NivelQuestao(){
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
    public NivelQuestao setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém nivel
    * return nivel
    * @generated
    */
    
    public java.lang.String getNivel(){
        return this.nivel;
    }

    /**
    * Define nivel
    * @param nivel nivel
    * @generated
    */
    public NivelQuestao setNivel(java.lang.String nivel){
        this.nivel = nivel;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
NivelQuestao object = (NivelQuestao)obj;
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