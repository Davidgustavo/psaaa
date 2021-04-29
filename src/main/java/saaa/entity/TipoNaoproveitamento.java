package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela tipo_nao_aproveitamento
 * @generated
 */
@Entity
@Table(name = "\"tipo_nao_aproveitamento\"")
@NamedQueries({
  
})
@XmlRootElement
public class TipoNaoproveitamento implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private java.lang.Integer idTipoNaoAproveitamento;
  
  /**
  * @generated
  */
  @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String descricao;

	/**
	 * Construtor
	 * @generated
	 */
	public TipoNaoproveitamento(){
	}

  /**
   * Obtém idTipoNaoAproveitamento
   * 
   * return idTipoNaoAproveitamento
   * @generated
   */
  public java.lang.Integer getIdTipoNaoAproveitamento(){
    return this.idTipoNaoAproveitamento;
  }
  
  /**
   * Define idTipoNaoAproveitamento
   * @param idTipoNaoAproveitamento idTipoNaoAproveitamento
   * @generated
   */
  public TipoNaoproveitamento setIdTipoNaoAproveitamento(java.lang.Integer idTipoNaoAproveitamento){
    this.idTipoNaoAproveitamento = idTipoNaoAproveitamento;
    return this;
  }
  
  /**
   * Obtém descricao
   * 
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
  public TipoNaoproveitamento setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    TipoNaoproveitamento object = (TipoNaoproveitamento)obj;
    if (idTipoNaoAproveitamento != null ? !idTipoNaoAproveitamento.equals(object.idTipoNaoAproveitamento) : object.idTipoNaoAproveitamento != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idTipoNaoAproveitamento == null) ? 0 : idTipoNaoAproveitamento.hashCode());
    return result;
  }

}