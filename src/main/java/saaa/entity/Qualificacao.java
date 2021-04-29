package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela qualificacao
 * @generated
 */
@Entity
@Table(name = "\"qualificacao\"")
@NamedQueries({
  
})
@XmlRootElement
public class Qualificacao implements Serializable {

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
  private java.lang.Integer idQualificacao;
  
  /**
  * @generated
  */
  @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String descricao;

	/**
	 * Construtor
	 * @generated
	 */
	public Qualificacao(){
	}

  /**
   * Obtém idQualificacao
   * 
   * return idQualificacao
   * @generated
   */
  public java.lang.Integer getIdQualificacao(){
    return this.idQualificacao;
  }
  
  /**
   * Define idQualificacao
   * @param idQualificacao idQualificacao
   * @generated
   */
  public Qualificacao setIdQualificacao(java.lang.Integer idQualificacao){
    this.idQualificacao = idQualificacao;
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
  public Qualificacao setDescricao(java.lang.String descricao){
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
    Qualificacao object = (Qualificacao)obj;
    if (idQualificacao != null ? !idQualificacao.equals(object.idQualificacao) : object.idQualificacao != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idQualificacao == null) ? 0 : idQualificacao.hashCode());
    return result;
  }

}