package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela causa_nao_aproveitamento
 * @generated
 */
@Entity
@Table(name = "\"causa_nao_aproveitamento\"")
@NamedQueries({
  
})
@XmlRootElement
public class CausaNaoAproveitamento implements Serializable {

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
  private java.lang.Integer idCausaNaoAproveitamento;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="Id_Avaliacao", referencedColumnName = "id_avaliacao_aula", insertable=true, updatable=true)
  private AvaliacaoAula avaliacao;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="Id_Tipo_nao_aproveitamento", referencedColumnName = "id_tipo_nao_aproveitamento", insertable=true, updatable=true)
  private TipoNaoproveitamento tipoNaoAproveitamento;
  
  /**
  * @generated
  */
  @Column(name = "Descricao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String descricao;

	/**
	 * Construtor
	 * @generated
	 */
	public CausaNaoAproveitamento(){
	}

  /**
   * Obtém idCausaNaoAproveitamento
   * 
   * return idCausaNaoAproveitamento
   * @generated
   */
  public java.lang.Integer getIdCausaNaoAproveitamento(){
    return this.idCausaNaoAproveitamento;
  }
  
  /**
   * Define idCausaNaoAproveitamento
   * @param idCausaNaoAproveitamento idCausaNaoAproveitamento
   * @generated
   */
  public CausaNaoAproveitamento setIdCausaNaoAproveitamento(java.lang.Integer idCausaNaoAproveitamento){
    this.idCausaNaoAproveitamento = idCausaNaoAproveitamento;
    return this;
  }
  
  /**
   * Obtém avaliacao
   * 
   * return avaliacao
   * @generated
   */
  public AvaliacaoAula getAvaliacao(){
    return this.avaliacao;
  }
  
  /**
   * Define avaliacao
   * @param avaliacao avaliacao
   * @generated
   */
  public CausaNaoAproveitamento setAvaliacao(AvaliacaoAula avaliacao){
    this.avaliacao = avaliacao;
    return this;
  }
  
  /**
   * Obtém tipoNaoAproveitamento
   * 
   * return tipoNaoAproveitamento
   * @generated
   */
  public TipoNaoproveitamento getTipoNaoAproveitamento(){
    return this.tipoNaoAproveitamento;
  }
  
  /**
   * Define tipoNaoAproveitamento
   * @param tipoNaoAproveitamento tipoNaoAproveitamento
   * @generated
   */
  public CausaNaoAproveitamento setTipoNaoAproveitamento(TipoNaoproveitamento tipoNaoAproveitamento){
    this.tipoNaoAproveitamento = tipoNaoAproveitamento;
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
  public CausaNaoAproveitamento setDescricao(java.lang.String descricao){
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
    CausaNaoAproveitamento object = (CausaNaoAproveitamento)obj;
    if (idCausaNaoAproveitamento != null ? !idCausaNaoAproveitamento.equals(object.idCausaNaoAproveitamento) : object.idCausaNaoAproveitamento != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idCausaNaoAproveitamento == null) ? 0 : idCausaNaoAproveitamento.hashCode());
    return result;
  }

}