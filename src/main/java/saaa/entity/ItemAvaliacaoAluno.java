package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela item_avaliacao_aluno
 * @generated
 */
@Entity
@Table(name = "\"item_avaliacao_aluno\"")
@NamedQueries({
  
})
@XmlRootElement
public class ItemAvaliacaoAluno implements Serializable {

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
  @JoinColumn(name="id_g_item_barema", referencedColumnName = "id_g_item_barema", insertable=true, updatable=true)
  private ItemBarema idGItemBarema;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_g_avaliacao_aluno", referencedColumnName = "id_g_avaliacao_aluno", insertable=true, updatable=true)
  private AvaliacaoAluno idGAvaliacaoAluno;
  
  /**
  * @generated
  */
  @Column(name = "pontuacao_percent_alcancada", nullable = true, unique = false, length=3, precision=2, insertable=true, updatable=true)
  private java.lang.Double pontuacaoPercentAlcancada;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_hora_inclusao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dataHoraInclusao;

	/**
	 * Construtor
	 * @generated
	 */
	public ItemAvaliacaoAluno(){
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
  public ItemAvaliacaoAluno setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém idGItemBarema
   * 
   * return idGItemBarema
   * @generated
   */
  public ItemBarema getIdGItemBarema(){
    return this.idGItemBarema;
  }
  
  /**
   * Define idGItemBarema
   * @param idGItemBarema idGItemBarema
   * @generated
   */
  public ItemAvaliacaoAluno setIdGItemBarema(ItemBarema idGItemBarema){
    this.idGItemBarema = idGItemBarema;
    return this;
  }
  
  /**
   * Obtém idGAvaliacaoAluno
   * 
   * return idGAvaliacaoAluno
   * @generated
   */
  public AvaliacaoAluno getIdGAvaliacaoAluno(){
    return this.idGAvaliacaoAluno;
  }
  
  /**
   * Define idGAvaliacaoAluno
   * @param idGAvaliacaoAluno idGAvaliacaoAluno
   * @generated
   */
  public ItemAvaliacaoAluno setIdGAvaliacaoAluno(AvaliacaoAluno idGAvaliacaoAluno){
    this.idGAvaliacaoAluno = idGAvaliacaoAluno;
    return this;
  }
  
  /**
   * Obtém pontuacaoPercentAlcancada
   * 
   * return pontuacaoPercentAlcancada
   * @generated
   */
  public java.lang.Double getPontuacaoPercentAlcancada(){
    return this.pontuacaoPercentAlcancada;
  }
  
  /**
   * Define pontuacaoPercentAlcancada
   * @param pontuacaoPercentAlcancada pontuacaoPercentAlcancada
   * @generated
   */
  public ItemAvaliacaoAluno setPontuacaoPercentAlcancada(java.lang.Double pontuacaoPercentAlcancada){
    this.pontuacaoPercentAlcancada = pontuacaoPercentAlcancada;
    return this;
  }
  
  /**
   * Obtém dataHoraInclusao
   * 
   * return dataHoraInclusao
   * @generated
   */
  public java.util.Date getDataHoraInclusao(){
    return this.dataHoraInclusao;
  }
  
  /**
   * Define dataHoraInclusao
   * @param dataHoraInclusao dataHoraInclusao
   * @generated
   */
  public ItemAvaliacaoAluno setDataHoraInclusao(java.util.Date dataHoraInclusao){
    this.dataHoraInclusao = dataHoraInclusao;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ItemAvaliacaoAluno object = (ItemAvaliacaoAluno)obj;
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