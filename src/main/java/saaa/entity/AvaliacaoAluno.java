package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela avaliacao_aluno
 * @generated
 */
@Entity
@Table(name = "\"avaliacao_aluno\"")
@NamedQueries({
  
})
@XmlRootElement
public class AvaliacaoAluno implements Serializable {

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
  @JoinColumn(name="id_g_presenca_aluno", referencedColumnName = "id_g_presenca_aluno", insertable=true, updatable=true)
  private PresencaAluno presencaAluno;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_inclusao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dataInclusao = Calendar.getInstance().getTime();
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_avaliacao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dataAvaliacao;

	/**
	 * Construtor
	 * @generated
	 */
	public AvaliacaoAluno(){
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
  public AvaliacaoAluno setId(java.lang.String id){
    this.id = id;
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
  public AvaliacaoAluno setPresencaAluno(PresencaAluno presencaAluno){
    this.presencaAluno = presencaAluno;
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
  public AvaliacaoAluno setDataInclusao(java.util.Date dataInclusao){
    this.dataInclusao = dataInclusao;
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
  public AvaliacaoAluno setDataAvaliacao(java.util.Date dataAvaliacao){
    this.dataAvaliacao = dataAvaliacao;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    AvaliacaoAluno object = (AvaliacaoAluno)obj;
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