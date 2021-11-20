package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela SIMULADO
* @generated
*/
@Entity
@Table(name = "\"SIMULADO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Simulado")
public class Simulado implements Serializable {

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
    @Column(name = "CompCod", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String compCod;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_quest1", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Questao quest1;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_quest2", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Questao quest2;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_quest3", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Questao quest3;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_quest4", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Questao quest4;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_quest5", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Questao quest5;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_quest6", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Questao quest6;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_quest7", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Questao quest7;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_quest8", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Questao quest8;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_quest9", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Questao quest9;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_quest10", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Questao quest10;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private User criador;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dtCriacao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dtCriacao = Calendar.getInstance().getTime();

    /**
    * @generated
    */
    @Column(name = "acertos", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer acertos;

    /**
    * @generated
    */
    @Column(name = "resp1", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String resp1;

    /**
    * @generated
    */
    @Column(name = "resp2", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String resp2;

    /**
    * @generated
    */
    @Column(name = "resp3", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String resp3;

    /**
    * @generated
    */
    @Column(name = "resp4", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String resp4;

    /**
    * @generated
    */
    @Column(name = "resp5", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String resp5;

    /**
    * @generated
    */
    @Column(name = "resp6", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String resp6;

    /**
    * @generated
    */
    @Column(name = "resp7", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String resp7;

    /**
    * @generated
    */
    @Column(name = "resp8", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String resp8;

    /**
    * @generated
    */
    @Column(name = "resp9", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String resp9;

    /**
    * @generated
    */
    @Column(name = "resp10", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String resp10;

    /**
    * Construtor
    * @generated
    */
    public Simulado(){
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
    public Simulado setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém compCod
    * return compCod
    * @generated
    */
    
    public java.lang.String getCompCod(){
        return this.compCod;
    }

    /**
    * Define compCod
    * @param compCod compCod
    * @generated
    */
    public Simulado setCompCod(java.lang.String compCod){
        this.compCod = compCod;
        return this;
    }
    /**
    * Obtém quest1
    * return quest1
    * @generated
    */
    
    public Questao getQuest1(){
        return this.quest1;
    }

    /**
    * Define quest1
    * @param quest1 quest1
    * @generated
    */
    public Simulado setQuest1(Questao quest1){
        this.quest1 = quest1;
        return this;
    }
    /**
    * Obtém quest2
    * return quest2
    * @generated
    */
    
    public Questao getQuest2(){
        return this.quest2;
    }

    /**
    * Define quest2
    * @param quest2 quest2
    * @generated
    */
    public Simulado setQuest2(Questao quest2){
        this.quest2 = quest2;
        return this;
    }
    /**
    * Obtém quest3
    * return quest3
    * @generated
    */
    
    public Questao getQuest3(){
        return this.quest3;
    }

    /**
    * Define quest3
    * @param quest3 quest3
    * @generated
    */
    public Simulado setQuest3(Questao quest3){
        this.quest3 = quest3;
        return this;
    }
    /**
    * Obtém quest4
    * return quest4
    * @generated
    */
    
    public Questao getQuest4(){
        return this.quest4;
    }

    /**
    * Define quest4
    * @param quest4 quest4
    * @generated
    */
    public Simulado setQuest4(Questao quest4){
        this.quest4 = quest4;
        return this;
    }
    /**
    * Obtém quest5
    * return quest5
    * @generated
    */
    
    public Questao getQuest5(){
        return this.quest5;
    }

    /**
    * Define quest5
    * @param quest5 quest5
    * @generated
    */
    public Simulado setQuest5(Questao quest5){
        this.quest5 = quest5;
        return this;
    }
    /**
    * Obtém quest6
    * return quest6
    * @generated
    */
    
    public Questao getQuest6(){
        return this.quest6;
    }

    /**
    * Define quest6
    * @param quest6 quest6
    * @generated
    */
    public Simulado setQuest6(Questao quest6){
        this.quest6 = quest6;
        return this;
    }
    /**
    * Obtém quest7
    * return quest7
    * @generated
    */
    
    public Questao getQuest7(){
        return this.quest7;
    }

    /**
    * Define quest7
    * @param quest7 quest7
    * @generated
    */
    public Simulado setQuest7(Questao quest7){
        this.quest7 = quest7;
        return this;
    }
    /**
    * Obtém quest8
    * return quest8
    * @generated
    */
    
    public Questao getQuest8(){
        return this.quest8;
    }

    /**
    * Define quest8
    * @param quest8 quest8
    * @generated
    */
    public Simulado setQuest8(Questao quest8){
        this.quest8 = quest8;
        return this;
    }
    /**
    * Obtém quest9
    * return quest9
    * @generated
    */
    
    public Questao getQuest9(){
        return this.quest9;
    }

    /**
    * Define quest9
    * @param quest9 quest9
    * @generated
    */
    public Simulado setQuest9(Questao quest9){
        this.quest9 = quest9;
        return this;
    }
    /**
    * Obtém quest10
    * return quest10
    * @generated
    */
    
    public Questao getQuest10(){
        return this.quest10;
    }

    /**
    * Define quest10
    * @param quest10 quest10
    * @generated
    */
    public Simulado setQuest10(Questao quest10){
        this.quest10 = quest10;
        return this;
    }
    /**
    * Obtém criador
    * return criador
    * @generated
    */
    
    public User getCriador(){
        return this.criador;
    }

    /**
    * Define criador
    * @param criador criador
    * @generated
    */
    public Simulado setCriador(User criador){
        this.criador = criador;
        return this;
    }
    /**
    * Obtém dtCriacao
    * return dtCriacao
    * @generated
    */
    
    public java.util.Date getDtCriacao(){
        return this.dtCriacao;
    }

    /**
    * Define dtCriacao
    * @param dtCriacao dtCriacao
    * @generated
    */
    public Simulado setDtCriacao(java.util.Date dtCriacao){
        this.dtCriacao = dtCriacao;
        return this;
    }
    /**
    * Obtém acertos
    * return acertos
    * @generated
    */
    
    public java.lang.Integer getAcertos(){
        return this.acertos;
    }

    /**
    * Define acertos
    * @param acertos acertos
    * @generated
    */
    public Simulado setAcertos(java.lang.Integer acertos){
        this.acertos = acertos;
        return this;
    }
    /**
    * Obtém resp1
    * return resp1
    * @generated
    */
    
    public java.lang.String getResp1(){
        return this.resp1;
    }

    /**
    * Define resp1
    * @param resp1 resp1
    * @generated
    */
    public Simulado setResp1(java.lang.String resp1){
        this.resp1 = resp1;
        return this;
    }
    /**
    * Obtém resp2
    * return resp2
    * @generated
    */
    
    public java.lang.String getResp2(){
        return this.resp2;
    }

    /**
    * Define resp2
    * @param resp2 resp2
    * @generated
    */
    public Simulado setResp2(java.lang.String resp2){
        this.resp2 = resp2;
        return this;
    }
    /**
    * Obtém resp3
    * return resp3
    * @generated
    */
    
    public java.lang.String getResp3(){
        return this.resp3;
    }

    /**
    * Define resp3
    * @param resp3 resp3
    * @generated
    */
    public Simulado setResp3(java.lang.String resp3){
        this.resp3 = resp3;
        return this;
    }
    /**
    * Obtém resp4
    * return resp4
    * @generated
    */
    
    public java.lang.String getResp4(){
        return this.resp4;
    }

    /**
    * Define resp4
    * @param resp4 resp4
    * @generated
    */
    public Simulado setResp4(java.lang.String resp4){
        this.resp4 = resp4;
        return this;
    }
    /**
    * Obtém resp5
    * return resp5
    * @generated
    */
    
    public java.lang.String getResp5(){
        return this.resp5;
    }

    /**
    * Define resp5
    * @param resp5 resp5
    * @generated
    */
    public Simulado setResp5(java.lang.String resp5){
        this.resp5 = resp5;
        return this;
    }
    /**
    * Obtém resp6
    * return resp6
    * @generated
    */
    
    public java.lang.String getResp6(){
        return this.resp6;
    }

    /**
    * Define resp6
    * @param resp6 resp6
    * @generated
    */
    public Simulado setResp6(java.lang.String resp6){
        this.resp6 = resp6;
        return this;
    }
    /**
    * Obtém resp7
    * return resp7
    * @generated
    */
    
    public java.lang.String getResp7(){
        return this.resp7;
    }

    /**
    * Define resp7
    * @param resp7 resp7
    * @generated
    */
    public Simulado setResp7(java.lang.String resp7){
        this.resp7 = resp7;
        return this;
    }
    /**
    * Obtém resp8
    * return resp8
    * @generated
    */
    
    public java.lang.String getResp8(){
        return this.resp8;
    }

    /**
    * Define resp8
    * @param resp8 resp8
    * @generated
    */
    public Simulado setResp8(java.lang.String resp8){
        this.resp8 = resp8;
        return this;
    }
    /**
    * Obtém resp9
    * return resp9
    * @generated
    */
    
    public java.lang.String getResp9(){
        return this.resp9;
    }

    /**
    * Define resp9
    * @param resp9 resp9
    * @generated
    */
    public Simulado setResp9(java.lang.String resp9){
        this.resp9 = resp9;
        return this;
    }
    /**
    * Obtém resp10
    * return resp10
    * @generated
    */
    
    public java.lang.String getResp10(){
        return this.resp10;
    }

    /**
    * Define resp10
    * @param resp10 resp10
    * @generated
    */
    public Simulado setResp10(java.lang.String resp10){
        this.resp10 = resp10;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Simulado object = (Simulado)obj;
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