package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela presenca_aluno
 * @generated
 */
@Entity
@Table(name = "\"presenca_aluno\"")
@NamedQueries({
  
})
@XmlRootElement
public class PresencaAluno implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_g_chamada", referencedColumnName = "id_g_chamada", insertable=true, updatable=true)
  private Chamada chamada;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_hora_registro", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  private java.util.Date dataHoraRegistro;
  
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
  @Id
  private java.lang.String idGPresencaAluno = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @Column(name = "latitude_registro", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double latitudeRegistro;
  
  /**
  * @generated
  */
  @Column(name = "longitude_registro", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double longitudeRegistro;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_g_matricula", referencedColumnName = "id_g_matricula", insertable=true, updatable=true)
  private Matricula matricula;
  
  /**
  * @generated
  */
  @Column(name = "motivo_invalidacao", nullable = true, unique = false, length=500, insertable=true, updatable=true)
  private java.lang.String motivoInvalidacao;
  
  /**
  * @generated
  */
  @Column(name = "presenca_valida", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  private java.lang.String presencaValida;
  
  /**
  * @generated
  */
  @Column(name = "altitude_registro", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double altitudeRegistro;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_hora_automatica", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dataHoraAutomatica;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_hora_manual", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dataHoraManual;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_hora_invalidacao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dataHoraInvalidacao;

	/**
	 * Construtor
	 * @generated
	 */
	public PresencaAluno(){
	}

  /**
   * Obtém chamada
   * 
   * return chamada
   * @generated
   */
  public Chamada getChamada(){
    return this.chamada;
  }
  
  /**
   * Define chamada
   * @param chamada chamada
   * @generated
   */
  public PresencaAluno setChamada(Chamada chamada){
    this.chamada = chamada;
    return this;
  }
  
  /**
   * Obtém dataHoraRegistro
   * 
   * return dataHoraRegistro
   * @generated
   */
  public java.util.Date getDataHoraRegistro(){
    return this.dataHoraRegistro;
  }
  
  /**
   * Define dataHoraRegistro
   * @param dataHoraRegistro dataHoraRegistro
   * @generated
   */
  public PresencaAluno setDataHoraRegistro(java.util.Date dataHoraRegistro){
    this.dataHoraRegistro = dataHoraRegistro;
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
  public PresencaAluno setDocente(Docente docente){
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
  public PresencaAluno setDocente2(Docente docente2){
    this.docente2 = docente2;
    return this;
  }
  
  /**
   * Obtém idGPresencaAluno
   * 
   * return idGPresencaAluno
   * @generated
   */
  public java.lang.String getIdGPresencaAluno(){
    return this.idGPresencaAluno;
  }
  
  /**
   * Define idGPresencaAluno
   * @param idGPresencaAluno idGPresencaAluno
   * @generated
   */
  public PresencaAluno setIdGPresencaAluno(java.lang.String idGPresencaAluno){
    this.idGPresencaAluno = idGPresencaAluno;
    return this;
  }
  
  /**
   * Obtém latitudeRegistro
   * 
   * return latitudeRegistro
   * @generated
   */
  public java.lang.Double getLatitudeRegistro(){
    return this.latitudeRegistro;
  }
  
  /**
   * Define latitudeRegistro
   * @param latitudeRegistro latitudeRegistro
   * @generated
   */
  public PresencaAluno setLatitudeRegistro(java.lang.Double latitudeRegistro){
    this.latitudeRegistro = latitudeRegistro;
    return this;
  }
  
  /**
   * Obtém longitudeRegistro
   * 
   * return longitudeRegistro
   * @generated
   */
  public java.lang.Double getLongitudeRegistro(){
    return this.longitudeRegistro;
  }
  
  /**
   * Define longitudeRegistro
   * @param longitudeRegistro longitudeRegistro
   * @generated
   */
  public PresencaAluno setLongitudeRegistro(java.lang.Double longitudeRegistro){
    this.longitudeRegistro = longitudeRegistro;
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
  public PresencaAluno setMatricula(Matricula matricula){
    this.matricula = matricula;
    return this;
  }
  
  /**
   * Obtém motivoInvalidacao
   * 
   * return motivoInvalidacao
   * @generated
   */
  public java.lang.String getMotivoInvalidacao(){
    return this.motivoInvalidacao;
  }
  
  /**
   * Define motivoInvalidacao
   * @param motivoInvalidacao motivoInvalidacao
   * @generated
   */
  public PresencaAluno setMotivoInvalidacao(java.lang.String motivoInvalidacao){
    this.motivoInvalidacao = motivoInvalidacao;
    return this;
  }
  
  /**
   * Obtém presencaValida
   * 
   * return presencaValida
   * @generated
   */
  public java.lang.String getPresencaValida(){
    return this.presencaValida;
  }
  
  /**
   * Define presencaValida
   * @param presencaValida presencaValida
   * @generated
   */
  public PresencaAluno setPresencaValida(java.lang.String presencaValida){
    this.presencaValida = presencaValida;
    return this;
  }
  
  /**
   * Obtém altitudeRegistro
   * 
   * return altitudeRegistro
   * @generated
   */
  public java.lang.Double getAltitudeRegistro(){
    return this.altitudeRegistro;
  }
  
  /**
   * Define altitudeRegistro
   * @param altitudeRegistro altitudeRegistro
   * @generated
   */
  public PresencaAluno setAltitudeRegistro(java.lang.Double altitudeRegistro){
    this.altitudeRegistro = altitudeRegistro;
    return this;
  }
  
  /**
   * Obtém dataHoraAutomatica
   * 
   * return dataHoraAutomatica
   * @generated
   */
  public java.util.Date getDataHoraAutomatica(){
    return this.dataHoraAutomatica;
  }
  
  /**
   * Define dataHoraAutomatica
   * @param dataHoraAutomatica dataHoraAutomatica
   * @generated
   */
  public PresencaAluno setDataHoraAutomatica(java.util.Date dataHoraAutomatica){
    this.dataHoraAutomatica = dataHoraAutomatica;
    return this;
  }
  
  /**
   * Obtém dataHoraManual
   * 
   * return dataHoraManual
   * @generated
   */
  public java.util.Date getDataHoraManual(){
    return this.dataHoraManual;
  }
  
  /**
   * Define dataHoraManual
   * @param dataHoraManual dataHoraManual
   * @generated
   */
  public PresencaAluno setDataHoraManual(java.util.Date dataHoraManual){
    this.dataHoraManual = dataHoraManual;
    return this;
  }
  
  /**
   * Obtém dataHoraInvalidacao
   * 
   * return dataHoraInvalidacao
   * @generated
   */
  public java.util.Date getDataHoraInvalidacao(){
    return this.dataHoraInvalidacao;
  }
  
  /**
   * Define dataHoraInvalidacao
   * @param dataHoraInvalidacao dataHoraInvalidacao
   * @generated
   */
  public PresencaAluno setDataHoraInvalidacao(java.util.Date dataHoraInvalidacao){
    this.dataHoraInvalidacao = dataHoraInvalidacao;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    PresencaAluno object = (PresencaAluno)obj;
    if (idGPresencaAluno != null ? !idGPresencaAluno.equals(object.idGPresencaAluno) : object.idGPresencaAluno != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idGPresencaAluno == null) ? 0 : idGPresencaAluno.hashCode());
    return result;
  }

}