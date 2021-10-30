package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela QUESTAODAPROVA
* @generated
*/
@Entity
@Table(name = "\"QUESTAODAPROVA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.QuestaoDaProva")
public class QuestaoDaProva implements Serializable {

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
    @ManyToOne
    @JoinColumn(name="fk_prova", nullable = true, referencedColumnName = "codProva", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Prova prova;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_questao", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Questao questao;

    /**
    * Construtor
    * @generated
    */
    public QuestaoDaProva(){
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
    public QuestaoDaProva setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém prova
    * return prova
    * @generated
    */
    
    public Prova getProva(){
        return this.prova;
    }

    /**
    * Define prova
    * @param prova prova
    * @generated
    */
    public QuestaoDaProva setProva(Prova prova){
        this.prova = prova;
        return this;
    }
    /**
    * Obtém questao
    * return questao
    * @generated
    */
    
    public Questao getQuestao(){
        return this.questao;
    }

    /**
    * Define questao
    * @param questao questao
    * @generated
    */
    public QuestaoDaProva setQuestao(Questao questao){
        this.questao = questao;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
QuestaoDaProva object = (QuestaoDaProva)obj;
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