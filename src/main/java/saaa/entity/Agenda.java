package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela agenda
 * @generated
 */
@Entity
@Table(name = "\"agenda\"")
@NamedQueries({
  
})
@XmlRootElement
public class Agenda implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
  * @generated
  */
  @Column(name = "aula", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Long aula;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date data;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_g_dependencia", referencedColumnName = "id_g_dependencia", insertable=true, updatable=true)
  private Dependencia dependencia;
  
  /**
  * @generated
  */
  @Column(name = "descricao", nullable = true, unique = false, length=500, insertable=true, updatable=true)
  private java.lang.String descricao;
  
  /**
  * @generated
  */
  @Column(name = "dia_semana", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Byte diaSemana;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_num_func", referencedColumnName = "id_num_func", insertable=true, updatable=true)
  private Docente docente;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_num_func1", referencedColumnName = "id_num_func", insertable=true, updatable=true)
  private Docente docente2;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "hora_fim", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  private java.util.Date horaFim;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "hora_inicio", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  private java.util.Date horaInicio;
  
  /**
   * @generated
   */
  @Id
  private java.lang.Long idAgenda;
  
  /**
  * @generated
  */
  @Column(name = "motivo_substituicao", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  private java.lang.String motivoSubstituicao;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_g_turma", referencedColumnName = "id_g_turma", insertable=true, updatable=true)
  private Turma turma;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_turno", referencedColumnName = "id_turno", insertable=true, updatable=true)
  private Turno turno;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "horaAbertura", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date horaAbertura;
  
  /**
  * @generated
  */
  @Column(name = "qtde_alunos", nullable = true, unique = false, length=10, precision=0, insertable=true, updatable=true)
  private java.lang.Double qtdeAlunos;

	/**
	 * Construtor
	 * @generated
	 */
	public Agenda(){
	}

  /**
   * Obtém aula
   * 
   * return aula
   * @generated
   */
  public java.lang.Long getAula(){
    return this.aula;
  }
  
  /**
   * Define aula
   * @param aula aula
   * @generated
   */
  public Agenda setAula(java.lang.Long aula){
    this.aula = aula;
    return this;
  }
  
  /**
   * Obtém data
   * 
   * return data
   * @generated
   */
  public java.util.Date getData(){
    return this.data;
  }
  
  /**
   * Define data
   * @param data data
   * @generated
   */
  public Agenda setData(java.util.Date data){
    this.data = data;
    return this;
  }
  
  /**
   * Obtém dependencia
   * 
   * return dependencia
   * @generated
   */
  public Dependencia getDependencia(){
    return this.dependencia;
  }
  
  /**
   * Define dependencia
   * @param dependencia dependencia
   * @generated
   */
  public Agenda setDependencia(Dependencia dependencia){
    this.dependencia = dependencia;
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
  public Agenda setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }
  
  /**
   * Obtém diaSemana
   * 
   * return diaSemana
   * @generated
   */
  public java.lang.Byte getDiaSemana(){
    return this.diaSemana;
  }
  
  /**
   * Define diaSemana
   * @param diaSemana diaSemana
   * @generated
   */
  public Agenda setDiaSemana(java.lang.Byte diaSemana){
    this.diaSemana = diaSemana;
    return this;
  }
  
  /**
   * Obtém docente
   * 
   * return docente
   * @generated
   */
  public Docente getDocente(){
    return this.docente;
  }
  
  /**
   * Define docente
   * @param docente docente
   * @generated
   */
  public Agenda setDocente(Docente docente){
    this.docente = docente;
    return this;
  }
  
  /**
   * Obtém docente2
   * 
   * return docente2
   * @generated
   */
  public Docente getDocente2(){
    return this.docente2;
  }
  
  /**
   * Define docente2
   * @param docente2 docente2
   * @generated
   */
  public Agenda setDocente2(Docente docente2){
    this.docente2 = docente2;
    return this;
  }
  
  /**
   * Obtém horaFim
   * 
   * return horaFim
   * @generated
   */
  public java.util.Date getHoraFim(){
    return this.horaFim;
  }
  
  /**
   * Define horaFim
   * @param horaFim horaFim
   * @generated
   */
  public Agenda setHoraFim(java.util.Date horaFim){
    this.horaFim = horaFim;
    return this;
  }
  
  /**
   * Obtém horaInicio
   * 
   * return horaInicio
   * @generated
   */
  public java.util.Date getHoraInicio(){
    return this.horaInicio;
  }
  
  /**
   * Define horaInicio
   * @param horaInicio horaInicio
   * @generated
   */
  public Agenda setHoraInicio(java.util.Date horaInicio){
    this.horaInicio = horaInicio;
    return this;
  }
  
  /**
   * Obtém idAgenda
   * 
   * return idAgenda
   * @generated
   */
  public java.lang.Long getIdAgenda(){
    return this.idAgenda;
  }
  
  /**
   * Define idAgenda
   * @param idAgenda idAgenda
   * @generated
   */
  public Agenda setIdAgenda(java.lang.Long idAgenda){
    this.idAgenda = idAgenda;
    return this;
  }
  
  /**
   * Obtém motivoSubstituicao
   * 
   * return motivoSubstituicao
   * @generated
   */
  public java.lang.String getMotivoSubstituicao(){
    return this.motivoSubstituicao;
  }
  
  /**
   * Define motivoSubstituicao
   * @param motivoSubstituicao motivoSubstituicao
   * @generated
   */
  public Agenda setMotivoSubstituicao(java.lang.String motivoSubstituicao){
    this.motivoSubstituicao = motivoSubstituicao;
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
  public Agenda setTurma(Turma turma){
    this.turma = turma;
    return this;
  }
  
  /**
   * Obtém turno
   * 
   * return turno
   * @generated
   */
  public Turno getTurno(){
    return this.turno;
  }
  
  /**
   * Define turno
   * @param turno turno
   * @generated
   */
  public Agenda setTurno(Turno turno){
    this.turno = turno;
    return this;
  }
  
  /**
   * Obtém horaAbertura
   * 
   * return horaAbertura
   * @generated
   */
  public java.util.Date getHoraAbertura(){
    return this.horaAbertura;
  }
  
  /**
   * Define horaAbertura
   * @param horaAbertura horaAbertura
   * @generated
   */
  public Agenda setHoraAbertura(java.util.Date horaAbertura){
    this.horaAbertura = horaAbertura;
    return this;
  }
  
  /**
   * Obtém qtdeAlunos
   * 
   * return qtdeAlunos
   * @generated
   */
  public java.lang.Double getQtdeAlunos(){
    return this.qtdeAlunos;
  }
  
  /**
   * Define qtdeAlunos
   * @param qtdeAlunos qtdeAlunos
   * @generated
   */
  public Agenda setQtdeAlunos(java.lang.Double qtdeAlunos){
    this.qtdeAlunos = qtdeAlunos;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Agenda object = (Agenda)obj;
    if (idAgenda != null ? !idAgenda.equals(object.idAgenda) : object.idAgenda != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idAgenda == null) ? 0 : idAgenda.hashCode());
    return result;
  }

}