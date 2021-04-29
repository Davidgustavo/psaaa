package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela criterio_avaliacao
 * @generated
 */
@Entity
@Table(name = "\"criterio_avaliacao\"")
@NamedQueries({
  
})
@XmlRootElement
public class CriterioAvaliacao implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @Column(name = "descricao_criterio", nullable = false, unique = false, length=100, insertable=true, updatable=true)
  private java.lang.String descricaoCriterio;

	/**
	 * Construtor
	 * @generated
	 */
	public CriterioAvaliacao(){
	}

  /**
   * Obtém id
   * 
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
  public CriterioAvaliacao setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém descricaoCriterio
   * 
   * return descricaoCriterio
   * @generated
   */
  public java.lang.String getDescricaoCriterio(){
    return this.descricaoCriterio;
  }
  
  /**
   * Define descricaoCriterio
   * @param descricaoCriterio descricaoCriterio
   * @generated
   */
  public CriterioAvaliacao setDescricaoCriterio(java.lang.String descricaoCriterio){
    this.descricaoCriterio = descricaoCriterio;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    CriterioAvaliacao object = (CriterioAvaliacao)obj;
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