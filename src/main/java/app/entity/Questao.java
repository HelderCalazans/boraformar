package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela QUESTAO
* @generated
*/
@Entity
@Table(name = "\"QUESTAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Questao")
public class Questao implements Serializable {

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
    @Column(name = "descricao", nullable = true, unique = false, length=5000, insertable=true, updatable=true)
        
        private java.lang.String descricao;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_assuntoDisciplina", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private AssuntoDisciplina assuntoDisciplina;

    /**
    * @generated
    */
    @Column(name = "resposta1", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String resposta1;

    /**
    * @generated
    */
    @Column(name = "resposta2", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String resposta2;

    /**
    * @generated
    */
    @Column(name = "resposta3", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String resposta3;

    /**
    * @generated
    */
    @Column(name = "resposta4", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String resposta4;

    /**
    * @generated
    */
    @Column(name = "respostaCorreta", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String respostaCorreta;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_nivelQuestao", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private NivelQuestao nivelQuestao;

    /**
    * Construtor
    * @generated
    */
    public Questao(){
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
    public Questao setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém descricao
    * return descricao
    * @generated
    */
    
    public java.lang.String getDescricao(){
        return this.descricao;
    }

    /**
    * Define descricao
    * @param descricao descricao
    * @generated
    */
    public Questao setDescricao(java.lang.String descricao){
        this.descricao = descricao;
        return this;
    }
    /**
    * Obtém assuntoDisciplina
    * return assuntoDisciplina
    * @generated
    */
    
    public AssuntoDisciplina getAssuntoDisciplina(){
        return this.assuntoDisciplina;
    }

    /**
    * Define assuntoDisciplina
    * @param assuntoDisciplina assuntoDisciplina
    * @generated
    */
    public Questao setAssuntoDisciplina(AssuntoDisciplina assuntoDisciplina){
        this.assuntoDisciplina = assuntoDisciplina;
        return this;
    }
    /**
    * Obtém resposta1
    * return resposta1
    * @generated
    */
    
    public java.lang.String getResposta1(){
        return this.resposta1;
    }

    /**
    * Define resposta1
    * @param resposta1 resposta1
    * @generated
    */
    public Questao setResposta1(java.lang.String resposta1){
        this.resposta1 = resposta1;
        return this;
    }
    /**
    * Obtém resposta2
    * return resposta2
    * @generated
    */
    
    public java.lang.String getResposta2(){
        return this.resposta2;
    }

    /**
    * Define resposta2
    * @param resposta2 resposta2
    * @generated
    */
    public Questao setResposta2(java.lang.String resposta2){
        this.resposta2 = resposta2;
        return this;
    }
    /**
    * Obtém resposta3
    * return resposta3
    * @generated
    */
    
    public java.lang.String getResposta3(){
        return this.resposta3;
    }

    /**
    * Define resposta3
    * @param resposta3 resposta3
    * @generated
    */
    public Questao setResposta3(java.lang.String resposta3){
        this.resposta3 = resposta3;
        return this;
    }
    /**
    * Obtém resposta4
    * return resposta4
    * @generated
    */
    
    public java.lang.String getResposta4(){
        return this.resposta4;
    }

    /**
    * Define resposta4
    * @param resposta4 resposta4
    * @generated
    */
    public Questao setResposta4(java.lang.String resposta4){
        this.resposta4 = resposta4;
        return this;
    }
    /**
    * Obtém respostaCorreta
    * return respostaCorreta
    * @generated
    */
    
    public java.lang.String getRespostaCorreta(){
        return this.respostaCorreta;
    }

    /**
    * Define respostaCorreta
    * @param respostaCorreta respostaCorreta
    * @generated
    */
    public Questao setRespostaCorreta(java.lang.String respostaCorreta){
        this.respostaCorreta = respostaCorreta;
        return this;
    }
    /**
    * Obtém nivelQuestao
    * return nivelQuestao
    * @generated
    */
    
    public NivelQuestao getNivelQuestao(){
        return this.nivelQuestao;
    }

    /**
    * Define nivelQuestao
    * @param nivelQuestao nivelQuestao
    * @generated
    */
    public Questao setNivelQuestao(NivelQuestao nivelQuestao){
        this.nivelQuestao = nivelQuestao;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Questao object = (Questao)obj;
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