package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela ocorrencia
 * @generated
 */
@Entity
@Table(name = "\"ocorrencia\"")
@NamedQueries({
  
})
@XmlRootElement
public class Ocorrencia implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data_hora_ocorrencia", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  private java.util.Date dataHoraOcorrencia;
  
  /**
  * @generated
  */
  @Column(name = "descricao", nullable = false, unique = false, length=2000, insertable=true, updatable=true)
  private java.lang.String descricao;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_g_diario_eletronico", referencedColumnName = "id_g_diario_eletronico", insertable=true, updatable=true)
  private DiarioEletronico diarioEletronico;
  
  /**
   * @generated
   */
  @Id
  private java.lang.String idGOcorrencia;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_g_matricula", referencedColumnName = "id_g_matricula", insertable=true, updatable=true)
  private Matricula matricula;
  
  /**
  * @generated
  */
  @Column(name = "ocorrencia_critica", nullable = false, unique = false, length=1, insertable=true, updatable=true)
  private java.lang.String ocorrenciaCritica;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_g_turma1", referencedColumnName = "id_g_turma", insertable=true, updatable=true)
  private Turma turma;

	/**
	 * Construtor
	 * @generated
	 */
	public Ocorrencia(){
	}

  /**
   * Obtém dataHoraOcorrencia
   * 
   * return dataHoraOcorrencia
   * @generated
   */
  public java.util.Date getDataHoraOcorrencia(){
    return this.dataHoraOcorrencia;
  }
  
  /**
   * Define dataHoraOcorrencia
   * @param dataHoraOcorrencia dataHoraOcorrencia
   * @generated
   */
  public Ocorrencia setDataHoraOcorrencia(java.util.Date dataHoraOcorrencia){
    this.dataHoraOcorrencia = dataHoraOcorrencia;
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
  public Ocorrencia setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }
  
  /**
   * Obtém diarioEletronico
   * 
   * return diarioEletronico
   * @generated
   */
  public DiarioEletronico getDiarioEletronico(){
    return this.diarioEletronico;
  }
  
  /**
   * Define diarioEletronico
   * @param diarioEletronico diarioEletronico
   * @generated
   */
  public Ocorrencia setDiarioEletronico(DiarioEletronico diarioEletronico){
    this.diarioEletronico = diarioEletronico;
    return this;
  }
  
  /**
   * Obtém idGOcorrencia
   * 
   * return idGOcorrencia
   * @generated
   */
  public java.lang.String getIdGOcorrencia(){
    return this.idGOcorrencia;
  }
  
  /**
   * Define idGOcorrencia
   * @param idGOcorrencia idGOcorrencia
   * @generated
   */
  public Ocorrencia setIdGOcorrencia(java.lang.String idGOcorrencia){
    this.idGOcorrencia = idGOcorrencia;
    return this;
  }
  
  /**
   * Obtém matricula
   * 
   * return matricula
   * @generated
   */
  public Matricula getMatricula(){
    return this.matricula;
  }
  
  /**
   * Define matricula
   * @param matricula matricula
   * @generated
   */
  public Ocorrencia setMatricula(Matricula matricula){
    this.matricula = matricula;
    return this;
  }
  
  /**
   * Obtém ocorrenciaCritica
   * 
   * return ocorrenciaCritica
   * @generated
   */
  public java.lang.String getOcorrenciaCritica(){
    return this.ocorrenciaCritica;
  }
  
  /**
   * Define ocorrenciaCritica
   * @param ocorrenciaCritica ocorrenciaCritica
   * @generated
   */
  public Ocorrencia setOcorrenciaCritica(java.lang.String ocorrenciaCritica){
    this.ocorrenciaCritica = ocorrenciaCritica;
    return this;
  }
  
  /**
   * Obtém turma
   * 
   * return turma
   * @generated
   */
  public Turma getTurma(){
    return this.turma;
  }
  
  /**
   * Define turma
   * @param turma turma
   * @generated
   */
  public Ocorrencia setTurma(Turma turma){
    this.turma = turma;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Ocorrencia object = (Ocorrencia)obj;
    if (idGOcorrencia != null ? !idGOcorrencia.equals(object.idGOcorrencia) : object.idGOcorrencia != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idGOcorrencia == null) ? 0 : idGOcorrencia.hashCode());
    return result;
  }

}