package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela diario_eletronico
 * @generated
 */
@Entity
@Table(name = "\"diario_eletronico\"")
@NamedQueries({
  
})
@XmlRootElement
public class DiarioEletronico implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_agenda", referencedColumnName = "id_agenda", insertable=true, updatable=true)
  private Agenda agenda;
  
  /**
  * @generated
  */
  @Column(name = "conteudo_ministrado", nullable = true, unique = false, length=2000, insertable=true, updatable=true)
  private java.lang.String conteudoMinistrado;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_num_func", referencedColumnName = "id_num_func", insertable=true, updatable=true)
  private Docente docente;
  
  /**
   * @generated
   */
  @Id
  private java.lang.String idGDiarioEletronico;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_g_plandp", referencedColumnName = "id_g_plandp", insertable=true, updatable=true)
  private PlanoDidatPedagT planoDidatPedagT;

	/**
	 * Construtor
	 * @generated
	 */
	public DiarioEletronico(){
	}

  /**
   * Obtém agenda
   * 
   * return agenda
   * @generated
   */
  public Agenda getAgenda(){
    return this.agenda;
  }
  
  /**
   * Define agenda
   * @param agenda agenda
   * @generated
   */
  public DiarioEletronico setAgenda(Agenda agenda){
    this.agenda = agenda;
    return this;
  }
  
  /**
   * Obtém conteudoMinistrado
   * 
   * return conteudoMinistrado
   * @generated
   */
  public java.lang.String getConteudoMinistrado(){
    return this.conteudoMinistrado;
  }
  
  /**
   * Define conteudoMinistrado
   * @param conteudoMinistrado conteudoMinistrado
   * @generated
   */
  public DiarioEletronico setConteudoMinistrado(java.lang.String conteudoMinistrado){
    this.conteudoMinistrado = conteudoMinistrado;
    return this;
  }
  
  /**
   * Obtém docente
   * 
   * return docente
   * @generated
   */
  public Docente getDocente(){
    return this.docente;
  }
  
  /**
   * Define docente
   * @param docente docente
   * @generated
   */
  public DiarioEletronico setDocente(Docente docente){
    this.docente = docente;
    return this;
  }
  
  /**
   * Obtém idGDiarioEletronico
   * 
   * return idGDiarioEletronico
   * @generated
   */
  public java.lang.String getIdGDiarioEletronico(){
    return this.idGDiarioEletronico;
  }
  
  /**
   * Define idGDiarioEletronico
   * @param idGDiarioEletronico idGDiarioEletronico
   * @generated
   */
  public DiarioEletronico setIdGDiarioEletronico(java.lang.String idGDiarioEletronico){
    this.idGDiarioEletronico = idGDiarioEletronico;
    return this;
  }
  
  /**
   * Obtém planoDidatPedagT
   * 
   * return planoDidatPedagT
   * @generated
   */
  public PlanoDidatPedagT getPlanoDidatPedagT(){
    return this.planoDidatPedagT;
  }
  
  /**
   * Define planoDidatPedagT
   * @param planoDidatPedagT planoDidatPedagT
   * @generated
   */
  public DiarioEletronico setPlanoDidatPedagT(PlanoDidatPedagT planoDidatPedagT){
    this.planoDidatPedagT = planoDidatPedagT;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    DiarioEletronico object = (DiarioEletronico)obj;
    if (idGDiarioEletronico != null ? !idGDiarioEletronico.equals(object.idGDiarioEletronico) : object.idGDiarioEletronico != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idGDiarioEletronico == null) ? 0 : idGDiarioEletronico.hashCode());
    return result;
  }

}