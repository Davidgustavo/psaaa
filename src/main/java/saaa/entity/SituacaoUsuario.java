package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela situacao_usuario
 * @generated
 */
@Entity
@Table(name = "\"situacao_usuario\"")
@NamedQueries({
  
})
@XmlRootElement
public class SituacaoUsuario implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
  * @generated
  */
  @Column(name = "descricao_situacao", nullable = false, unique = false, length=100, insertable=true, updatable=true)
  private java.lang.String descricaoSituacao;
  
  /**
   * @generated
   */
  @Id
  private java.lang.String idSituacao;

	/**
	 * Construtor
	 * @generated
	 */
	public SituacaoUsuario(){
	}

  /**
   * Obtém descricaoSituacao
   * 
   * return descricaoSituacao
   * @generated
   */
  public java.lang.String getDescricaoSituacao(){
    return this.descricaoSituacao;
  }
  
  /**
   * Define descricaoSituacao
   * @param descricaoSituacao descricaoSituacao
   * @generated
   */
  public SituacaoUsuario setDescricaoSituacao(java.lang.String descricaoSituacao){
    this.descricaoSituacao = descricaoSituacao;
    return this;
  }
  
  /**
   * Obtém idSituacao
   * 
   * return idSituacao
   * @generated
   */
  public java.lang.String getIdSituacao(){
    return this.idSituacao;
  }
  
  /**
   * Define idSituacao
   * @param idSituacao idSituacao
   * @generated
   */
  public SituacaoUsuario setIdSituacao(java.lang.String idSituacao){
    this.idSituacao = idSituacao;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    SituacaoUsuario object = (SituacaoUsuario)obj;
    if (idSituacao != null ? !idSituacao.equals(object.idSituacao) : object.idSituacao != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idSituacao == null) ? 0 : idSituacao.hashCode());
    return result;
  }

}