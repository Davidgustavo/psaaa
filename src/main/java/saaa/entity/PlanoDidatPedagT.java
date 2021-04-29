package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela plano_didat_pedag_t
 * @generated
 */
@Entity
@Table(name = "\"plano_didat_pedag_t\"")
@NamedQueries({
  
})
@XmlRootElement
public class PlanoDidatPedagT implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
  * @generated
  */
  @Column(name = "assunto_atividades", nullable = true, unique = false, length=2000, insertable=true, updatable=true)
  private java.lang.String assuntoAtividades;
  
  /**
  * @generated
  */
  @Column(name = "aula", nullable = false, unique = false, length=20, insertable=true, updatable=true)
  private java.lang.String aula;
  
  /**
  * @generated
  */
  @Column(name = "bibliografia", nullable = true, unique = false, length=2000, insertable=true, updatable=true)
  private java.lang.String bibliografia;
  
  /**
   * @generated
   */
  @Id
  private java.lang.String idGPlandp;
  
  /**
  * @generated
  */
  @Column(name = "observacoes", nullable = true, unique = false, length=2000, insertable=true, updatable=true)
  private java.lang.String observacoes;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_g_subdisciplina", referencedColumnName = "id_g_subdisciplina", insertable=true, updatable=true)
  private Subdisciplina subdisciplina;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_g_turma", referencedColumnName = "id_g_turma", insertable=true, updatable=true)
  private Turma turma;

	/**
	 * Construtor
	 * @generated
	 */
	public PlanoDidatPedagT(){
	}

  /**
   * Obtém assuntoAtividades
   * 
   * return assuntoAtividades
   * @generated
   */
  public java.lang.String getAssuntoAtividades(){
    return this.assuntoAtividades;
  }
  
  /**
   * Define assuntoAtividades
   * @param assuntoAtividades assuntoAtividades
   * @generated
   */
  public PlanoDidatPedagT setAssuntoAtividades(java.lang.String assuntoAtividades){
    this.assuntoAtividades = assuntoAtividades;
    return this;
  }
  
  /**
   * Obtém aula
   * 
   * return aula
   * @generated
   */
  public java.lang.String getAula(){
    return this.aula;
  }
  
  /**
   * Define aula
   * @param aula aula
   * @generated
   */
  public PlanoDidatPedagT setAula(java.lang.String aula){
    this.aula = aula;
    return this;
  }
  
  /**
   * Obtém bibliografia
   * 
   * return bibliografia
   * @generated
   */
  public java.lang.String getBibliografia(){
    return this.bibliografia;
  }
  
  /**
   * Define bibliografia
   * @param bibliografia bibliografia
   * @generated
   */
  public PlanoDidatPedagT setBibliografia(java.lang.String bibliografia){
    this.bibliografia = bibliografia;
    return this;
  }
  
  /**
   * Obtém idGPlandp
   * 
   * return idGPlandp
   * @generated
   */
  public java.lang.String getIdGPlandp(){
    return this.idGPlandp;
  }
  
  /**
   * Define idGPlandp
   * @param idGPlandp idGPlandp
   * @generated
   */
  public PlanoDidatPedagT setIdGPlandp(java.lang.String idGPlandp){
    this.idGPlandp = idGPlandp;
    return this;
  }
  
  /**
   * Obtém observacoes
   * 
   * return observacoes
   * @generated
   */
  public java.lang.String getObservacoes(){
    return this.observacoes;
  }
  
  /**
   * Define observacoes
   * @param observacoes observacoes
   * @generated
   */
  public PlanoDidatPedagT setObservacoes(java.lang.String observacoes){
    this.observacoes = observacoes;
    return this;
  }
  
  /**
   * Obtém subdisciplina
   * 
   * return subdisciplina
   * @generated
   */
  public Subdisciplina getSubdisciplina(){
    return this.subdisciplina;
  }
  
  /**
   * Define subdisciplina
   * @param subdisciplina subdisciplina
   * @generated
   */
  public PlanoDidatPedagT setSubdisciplina(Subdisciplina subdisciplina){
    this.subdisciplina = subdisciplina;
    return this;
  }
  
  /**
   * Obtém turma
   * 
   * return turma
   * @generated
   */
  public Turma getTurma(){
    return this.turma;
  }
  
  /**
   * Define turma
   * @param turma turma
   * @generated
   */
  public PlanoDidatPedagT setTurma(Turma turma){
    this.turma = turma;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    PlanoDidatPedagT object = (PlanoDidatPedagT)obj;
    if (idGPlandp != null ? !idGPlandp.equals(object.idGPlandp) : object.idGPlandp != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idGPlandp == null) ? 0 : idGPlandp.hashCode());
    return result;
  }

}