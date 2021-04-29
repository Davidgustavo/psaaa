package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela barema_avaliacao
 * @generated
 */
@Entity
@Table(name = "\"barema_avaliacao\"")
@NamedQueries({
  
})
@XmlRootElement
public class BaremaAvaliacao implements Serializable {

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
  @Column(name = "nome_barema", nullable = false, unique = false, length=200, insertable=true, updatable=true)
  private java.lang.String nomeBarema;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_inclusao", nullable = false, unique = false, insertable=true, updatable=true)
  private java.util.Date dataInclusao = Calendar.getInstance().getTime();
  
  /**
  * @generated
  */
  @Column(name = "descricao_aplicabilidade", nullable = true, unique = false, length=500, insertable=true, updatable=true)
  private java.lang.String descricaoAplicabilidade;
  
  /**
  * @generated
  */
  @Column(name = "responsavel_criacao", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  private java.lang.String responsavelCriacao;

	/**
	 * Construtor
	 * @generated
	 */
	public BaremaAvaliacao(){
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
  public BaremaAvaliacao setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém nomeBarema
   * 
   * return nomeBarema
   * @generated
   */
  public java.lang.String getNomeBarema(){
    return this.nomeBarema;
  }
  
  /**
   * Define nomeBarema
   * @param nomeBarema nomeBarema
   * @generated
   */
  public BaremaAvaliacao setNomeBarema(java.lang.String nomeBarema){
    this.nomeBarema = nomeBarema;
    return this;
  }
  
  /**
   * Obtém dataInclusao
   * 
   * return dataInclusao
   * @generated
   */
  public java.util.Date getDataInclusao(){
    return this.dataInclusao;
  }
  
  /**
   * Define dataInclusao
   * @param dataInclusao dataInclusao
   * @generated
   */
  public BaremaAvaliacao setDataInclusao(java.util.Date dataInclusao){
    this.dataInclusao = dataInclusao;
    return this;
  }
  
  /**
   * Obtém descricaoAplicabilidade
   * 
   * return descricaoAplicabilidade
   * @generated
   */
  public java.lang.String getDescricaoAplicabilidade(){
    return this.descricaoAplicabilidade;
  }
  
  /**
   * Define descricaoAplicabilidade
   * @param descricaoAplicabilidade descricaoAplicabilidade
   * @generated
   */
  public BaremaAvaliacao setDescricaoAplicabilidade(java.lang.String descricaoAplicabilidade){
    this.descricaoAplicabilidade = descricaoAplicabilidade;
    return this;
  }
  
  /**
   * Obtém responsavelCriacao
   * 
   * return responsavelCriacao
   * @generated
   */
  public java.lang.String getResponsavelCriacao(){
    return this.responsavelCriacao;
  }
  
  /**
   * Define responsavelCriacao
   * @param responsavelCriacao responsavelCriacao
   * @generated
   */
  public BaremaAvaliacao setResponsavelCriacao(java.lang.String responsavelCriacao){
    this.responsavelCriacao = responsavelCriacao;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    BaremaAvaliacao object = (BaremaAvaliacao)obj;
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