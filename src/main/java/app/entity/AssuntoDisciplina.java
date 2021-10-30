package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela ASSUNTODISCIPLINA
* @generated
*/
@Entity
@Table(name = "\"ASSUNTODISCIPLINA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.AssuntoDisciplina")
public class AssuntoDisciplina implements Serializable {

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
    @Column(name = "AssuntoDisciplina", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String assuntoDisciplina;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_disciplina", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Disciplina disciplina;

    /**
    * Construtor
    * @generated
    */
    public AssuntoDisciplina(){
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
    public AssuntoDisciplina setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém assuntoDisciplina
    * return assuntoDisciplina
    * @generated
    */
    
    public java.lang.String getAssuntoDisciplina(){
        return this.assuntoDisciplina;
    }

    /**
    * Define assuntoDisciplina
    * @param assuntoDisciplina assuntoDisciplina
    * @generated
    */
    public AssuntoDisciplina setAssuntoDisciplina(java.lang.String assuntoDisciplina){
        this.assuntoDisciplina = assuntoDisciplina;
        return this;
    }
    /**
    * Obtém disciplina
    * return disciplina
    * @generated
    */
    
    public Disciplina getDisciplina(){
        return this.disciplina;
    }

    /**
    * Define disciplina
    * @param disciplina disciplina
    * @generated
    */
    public AssuntoDisciplina setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
AssuntoDisciplina object = (AssuntoDisciplina)obj;
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