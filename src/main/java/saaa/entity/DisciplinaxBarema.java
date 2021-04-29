package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela disciplina_x_barema
 * @generated
 */
@Entity
@Table(name = "\"disciplina_x_barema\"")
@NamedQueries({
  
})
@XmlRootElement
public class DisciplinaxBarema implements Serializable {

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
  @JoinColumn(name="id_disciplina", referencedColumnName = "id_disciplina", insertable=true, updatable=true)
  private Disciplina idDisciplina;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_g_barema_avaliacao", referencedColumnName = "id_g_barema_avaliacao", insertable=true, updatable=true)
  private BaremaAvaliacao idGBaremaAvaliacao;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_hora_inclusao", nullable = false, unique = false, insertable=true, updatable=true)
  private java.util.Date dataHoraInclusao = Calendar.getInstance().getTime();
  
  /**
  * @generated
  */
  @Column(name = "nome_responsavel_inclusao", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  private java.lang.String nomeRespInclusao;

	/**
	 * Construtor
	 * @generated
	 */
	public DisciplinaxBarema(){
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
  public DisciplinaxBarema setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém idDisciplina
   * 
   * return idDisciplina
   * @generated
   */
  public Disciplina getIdDisciplina(){
    return this.idDisciplina;
  }
  
  /**
   * Define idDisciplina
   * @param idDisciplina idDisciplina
   * @generated
   */
  public DisciplinaxBarema setIdDisciplina(Disciplina idDisciplina){
    this.idDisciplina = idDisciplina;
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
  public DisciplinaxBarema setIdGBaremaAvaliacao(BaremaAvaliacao idGBaremaAvaliacao){
    this.idGBaremaAvaliacao = idGBaremaAvaliacao;
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
  public DisciplinaxBarema setDataHoraInclusao(java.util.Date dataHoraInclusao){
    this.dataHoraInclusao = dataHoraInclusao;
    return this;
  }
  
  /**
   * Obtém nomeRespInclusao
   * 
   * return nomeRespInclusao
   * @generated
   */
  public java.lang.String getNomeRespInclusao(){
    return this.nomeRespInclusao;
  }
  
  /**
   * Define nomeRespInclusao
   * @param nomeRespInclusao nomeRespInclusao
   * @generated
   */
  public DisciplinaxBarema setNomeRespInclusao(java.lang.String nomeRespInclusao){
    this.nomeRespInclusao = nomeRespInclusao;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    DisciplinaxBarema object = (DisciplinaxBarema)obj;
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