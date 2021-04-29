package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela item_barema
 * @generated
 */
@Entity
@Table(name = "\"item_barema\"")
@NamedQueries({
  
})
@XmlRootElement
public class ItemBarema implements Serializable {

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
  @ManyToOne
  @JoinColumn(name="id_g_barema_avaliacao", referencedColumnName = "id_g_barema_avaliacao", insertable=true, updatable=true)
  private BaremaAvaliacao idGBaremaAvaliacao;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_g_criterio_avaliacao", referencedColumnName = "id_g_criterio_avaliacao", insertable=true, updatable=true)
  private CriterioAvaliacao idGCriterioAvaliacao;
  
  /**
  * @generated
  */
  @Column(name = "ordem_apresentacao", nullable = false, unique = false, length=5, precision=0, insertable=true, updatable=true)
  private java.lang.Double ordemApresentacao;
  
  /**
  * @generated
  */
  @Column(name = "pontuacao_maxima", nullable = false, unique = false, length=10, precision=4, insertable=true, updatable=true)
  private java.lang.Double pontuacaoMaxima;

	/**
	 * Construtor
	 * @generated
	 */
	public ItemBarema(){
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
  public ItemBarema setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém idGBaremaAvaliacao
   * 
   * return idGBaremaAvaliacao
   * @generated
   */
  public BaremaAvaliacao getIdGBaremaAvaliacao(){
    return this.idGBaremaAvaliacao;
  }
  
  /**
   * Define idGBaremaAvaliacao
   * @param idGBaremaAvaliacao idGBaremaAvaliacao
   * @generated
   */
  public ItemBarema setIdGBaremaAvaliacao(BaremaAvaliacao idGBaremaAvaliacao){
    this.idGBaremaAvaliacao = idGBaremaAvaliacao;
    return this;
  }
  
  /**
   * Obtém idGCriterioAvaliacao
   * 
   * return idGCriterioAvaliacao
   * @generated
   */
  public CriterioAvaliacao getIdGCriterioAvaliacao(){
    return this.idGCriterioAvaliacao;
  }
  
  /**
   * Define idGCriterioAvaliacao
   * @param idGCriterioAvaliacao idGCriterioAvaliacao
   * @generated
   */
  public ItemBarema setIdGCriterioAvaliacao(CriterioAvaliacao idGCriterioAvaliacao){
    this.idGCriterioAvaliacao = idGCriterioAvaliacao;
    return this;
  }
  
  /**
   * Obtém ordemApresentacao
   * 
   * return ordemApresentacao
   * @generated
   */
  public java.lang.Double getOrdemApresentacao(){
    return this.ordemApresentacao;
  }
  
  /**
   * Define ordemApresentacao
   * @param ordemApresentacao ordemApresentacao
   * @generated
   */
  public ItemBarema setOrdemApresentacao(java.lang.Double ordemApresentacao){
    this.ordemApresentacao = ordemApresentacao;
    return this;
  }
  
  /**
   * Obtém pontuacaoMaxima
   * 
   * return pontuacaoMaxima
   * @generated
   */
  public java.lang.Double getPontuacaoMaxima(){
    return this.pontuacaoMaxima;
  }
  
  /**
   * Define pontuacaoMaxima
   * @param pontuacaoMaxima pontuacaoMaxima
   * @generated
   */
  public ItemBarema setPontuacaoMaxima(java.lang.Double pontuacaoMaxima){
    this.pontuacaoMaxima = pontuacaoMaxima;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ItemBarema object = (ItemBarema)obj;
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