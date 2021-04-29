package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela avaliacao_aula
 * @generated
 */
@Entity
@Table(name = "\"avaliacao_aula\"")
@NamedQueries({
  
})
@XmlRootElement
public class AvaliacaoAula implements Serializable {

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
  private java.lang.Integer idAvaliacaoAula;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_avaliacao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dataAvaliacao;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="Id_presenca_aluno", referencedColumnName = "id_g_presenca_aluno", insertable=true, updatable=true)
  private PresencaAluno presencaAluno;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="Id_qualificacao", referencedColumnName = "id_qualificacao", insertable=true, updatable=true)
  private Qualificacao qualificacao;
  
  /**
  * @generated
  */
  @Column(name = "Aproveitamento_pleno", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Boolean aproveitamentoPleno;

	/**
	 * Construtor
	 * @generated
	 */
	public AvaliacaoAula(){
	}

  /**
   * Obtém idAvaliacaoAula
   * 
   * return idAvaliacaoAula
   * @generated
   */
  public java.lang.Integer getIdAvaliacaoAula(){
    return this.idAvaliacaoAula;
  }
  
  /**
   * Define idAvaliacaoAula
   * @param idAvaliacaoAula idAvaliacaoAula
   * @generated
   */
  public AvaliacaoAula setIdAvaliacaoAula(java.lang.Integer idAvaliacaoAula){
    this.idAvaliacaoAula = idAvaliacaoAula;
    return this;
  }
  
  /**
   * Obtém dataAvaliacao
   * 
   * return dataAvaliacao
   * @generated
   */
  public java.util.Date getDataAvaliacao(){
    return this.dataAvaliacao;
  }
  
  /**
   * Define dataAvaliacao
   * @param dataAvaliacao dataAvaliacao
   * @generated
   */
  public AvaliacaoAula setDataAvaliacao(java.util.Date dataAvaliacao){
    this.dataAvaliacao = dataAvaliacao;
    return this;
  }
  
  /**
   * Obtém presencaAluno
   * 
   * return presencaAluno
   * @generated
   */
  public PresencaAluno getPresencaAluno(){
    return this.presencaAluno;
  }
  
  /**
   * Define presencaAluno
   * @param presencaAluno presencaAluno
   * @generated
   */
  public AvaliacaoAula setPresencaAluno(PresencaAluno presencaAluno){
    this.presencaAluno = presencaAluno;
    return this;
  }
  
  /**
   * Obtém qualificacao
   * 
   * return qualificacao
   * @generated
   */
  public Qualificacao getQualificacao(){
    return this.qualificacao;
  }
  
  /**
   * Define qualificacao
   * @param qualificacao qualificacao
   * @generated
   */
  public AvaliacaoAula setQualificacao(Qualificacao qualificacao){
    this.qualificacao = qualificacao;
    return this;
  }
  
  /**
   * Obtém aproveitamentoPleno
   * 
   * return aproveitamentoPleno
   * @generated
   */
  public java.lang.Boolean getAproveitamentoPleno(){
    return this.aproveitamentoPleno;
  }
  
  /**
   * Define aproveitamentoPleno
   * @param aproveitamentoPleno aproveitamentoPleno
   * @generated
   */
  public AvaliacaoAula setAproveitamentoPleno(java.lang.Boolean aproveitamentoPleno){
    this.aproveitamentoPleno = aproveitamentoPleno;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    AvaliacaoAula object = (AvaliacaoAula)obj;
    if (idAvaliacaoAula != null ? !idAvaliacaoAula.equals(object.idAvaliacaoAula) : object.idAvaliacaoAula != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idAvaliacaoAula == null) ? 0 : idAvaliacaoAula.hashCode());
    return result;
  }

}