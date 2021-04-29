package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela aula_ministrada
 * @generated
 */
@Entity
@Table(name = "\"aula_ministrada\"")
@NamedQueries({
  
})
@XmlRootElement
public class AulaMinistrada implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_agenda", referencedColumnName = "id_agenda", insertable=true, updatable=true)
  private Agenda agenda;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_aula", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  private java.util.Date dataAula;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_hora_abertura", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  private java.util.Date dataHoraAbertura;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_hora_encerramento", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  private java.util.Date dataHoraEncerramento;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_g_dependencia", referencedColumnName = "id_g_dependencia", insertable=true, updatable=true)
  private Dependencia dependencia;
  
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
  private java.lang.String idGAulaMinistrada = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @Column(name = "latitude_abertura", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double latitudeAbertura;
  
  /**
  * @generated
  */
  @Column(name = "latitude_encerramento", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double latitudeEncerramento;
  
  /**
  * @generated
  */
  @Column(name = "longitude_abertura", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double longitudeAbertura;
  
  /**
  * @generated
  */
  @Column(name = "longitude_encerramento", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double longitudeEncerramento;
  
  /**
  * @generated
  */
  @Column(name = "observacoes", nullable = true, unique = false, length=500, insertable=true, updatable=true)
  private java.lang.String observacoes;
  
  /**
  * @generated
  */
  @Column(name = "altitude_abertura", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double altitudeAbertura;
  
  /**
  * @generated
  */
  @Column(name = "altitude_encerramento", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double altitudeEncerramento;

	/**
	 * Construtor
	 * @generated
	 */
	public AulaMinistrada(){
	}

  /**
   * Obtém agenda
   * 
   * return agenda
   * @generated
   */
  public Agenda getAgenda(){
    return this.agenda;
  }
  
  /**
   * Define agenda
   * @param agenda agenda
   * @generated
   */
  public AulaMinistrada setAgenda(Agenda agenda){
    this.agenda = agenda;
    return this;
  }
  
  /**
   * Obtém dataAula
   * 
   * return dataAula
   * @generated
   */
  public java.util.Date getDataAula(){
    return this.dataAula;
  }
  
  /**
   * Define dataAula
   * @param dataAula dataAula
   * @generated
   */
  public AulaMinistrada setDataAula(java.util.Date dataAula){
    this.dataAula = dataAula;
    return this;
  }
  
  /**
   * Obtém dataHoraAbertura
   * 
   * return dataHoraAbertura
   * @generated
   */
  public java.util.Date getDataHoraAbertura(){
    return this.dataHoraAbertura;
  }
  
  /**
   * Define dataHoraAbertura
   * @param dataHoraAbertura dataHoraAbertura
   * @generated
   */
  public AulaMinistrada setDataHoraAbertura(java.util.Date dataHoraAbertura){
    this.dataHoraAbertura = dataHoraAbertura;
    return this;
  }
  
  /**
   * Obtém dataHoraEncerramento
   * 
   * return dataHoraEncerramento
   * @generated
   */
  public java.util.Date getDataHoraEncerramento(){
    return this.dataHoraEncerramento;
  }
  
  /**
   * Define dataHoraEncerramento
   * @param dataHoraEncerramento dataHoraEncerramento
   * @generated
   */
  public AulaMinistrada setDataHoraEncerramento(java.util.Date dataHoraEncerramento){
    this.dataHoraEncerramento = dataHoraEncerramento;
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
  public AulaMinistrada setDependencia(Dependencia dependencia){
    this.dependencia = dependencia;
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
  public AulaMinistrada setDocente(Docente docente){
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
  public AulaMinistrada setDocente2(Docente docente2){
    this.docente2 = docente2;
    return this;
  }
  
  /**
   * Obtém idGAulaMinistrada
   * 
   * return idGAulaMinistrada
   * @generated
   */
  public java.lang.String getIdGAulaMinistrada(){
    return this.idGAulaMinistrada;
  }
  
  /**
   * Define idGAulaMinistrada
   * @param idGAulaMinistrada idGAulaMinistrada
   * @generated
   */
  public AulaMinistrada setIdGAulaMinistrada(java.lang.String idGAulaMinistrada){
    this.idGAulaMinistrada = idGAulaMinistrada;
    return this;
  }
  
  /**
   * Obtém latitudeAbertura
   * 
   * return latitudeAbertura
   * @generated
   */
  public java.lang.Double getLatitudeAbertura(){
    return this.latitudeAbertura;
  }
  
  /**
   * Define latitudeAbertura
   * @param latitudeAbertura latitudeAbertura
   * @generated
   */
  public AulaMinistrada setLatitudeAbertura(java.lang.Double latitudeAbertura){
    this.latitudeAbertura = latitudeAbertura;
    return this;
  }
  
  /**
   * Obtém latitudeEncerramento
   * 
   * return latitudeEncerramento
   * @generated
   */
  public java.lang.Double getLatitudeEncerramento(){
    return this.latitudeEncerramento;
  }
  
  /**
   * Define latitudeEncerramento
   * @param latitudeEncerramento latitudeEncerramento
   * @generated
   */
  public AulaMinistrada setLatitudeEncerramento(java.lang.Double latitudeEncerramento){
    this.latitudeEncerramento = latitudeEncerramento;
    return this;
  }
  
  /**
   * Obtém longitudeAbertura
   * 
   * return longitudeAbertura
   * @generated
   */
  public java.lang.Double getLongitudeAbertura(){
    return this.longitudeAbertura;
  }
  
  /**
   * Define longitudeAbertura
   * @param longitudeAbertura longitudeAbertura
   * @generated
   */
  public AulaMinistrada setLongitudeAbertura(java.lang.Double longitudeAbertura){
    this.longitudeAbertura = longitudeAbertura;
    return this;
  }
  
  /**
   * Obtém longitudeEncerramento
   * 
   * return longitudeEncerramento
   * @generated
   */
  public java.lang.Double getLongitudeEncerramento(){
    return this.longitudeEncerramento;
  }
  
  /**
   * Define longitudeEncerramento
   * @param longitudeEncerramento longitudeEncerramento
   * @generated
   */
  public AulaMinistrada setLongitudeEncerramento(java.lang.Double longitudeEncerramento){
    this.longitudeEncerramento = longitudeEncerramento;
    return this;
  }
  
  /**
   * Obtém observacoes
   * 
   * return observacoes
   * @generated
   */
  public java.lang.String getObservacoes(){
    return this.observacoes;
  }
  
  /**
   * Define observacoes
   * @param observacoes observacoes
   * @generated
   */
  public AulaMinistrada setObservacoes(java.lang.String observacoes){
    this.observacoes = observacoes;
    return this;
  }
  
  /**
   * Obtém altitudeAbertura
   * 
   * return altitudeAbertura
   * @generated
   */
  public java.lang.Double getAltitudeAbertura(){
    return this.altitudeAbertura;
  }
  
  /**
   * Define altitudeAbertura
   * @param altitudeAbertura altitudeAbertura
   * @generated
   */
  public AulaMinistrada setAltitudeAbertura(java.lang.Double altitudeAbertura){
    this.altitudeAbertura = altitudeAbertura;
    return this;
  }
  
  /**
   * Obtém altitudeEncerramento
   * 
   * return altitudeEncerramento
   * @generated
   */
  public java.lang.Double getAltitudeEncerramento(){
    return this.altitudeEncerramento;
  }
  
  /**
   * Define altitudeEncerramento
   * @param altitudeEncerramento altitudeEncerramento
   * @generated
   */
  public AulaMinistrada setAltitudeEncerramento(java.lang.Double altitudeEncerramento){
    this.altitudeEncerramento = altitudeEncerramento;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    AulaMinistrada object = (AulaMinistrada)obj;
    if (idGAulaMinistrada != null ? !idGAulaMinistrada.equals(object.idGAulaMinistrada) : object.idGAulaMinistrada != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idGAulaMinistrada == null) ? 0 : idGAulaMinistrada.hashCode());
    return result;
  }

}