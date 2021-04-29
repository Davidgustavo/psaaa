package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela dependencia
 * @generated
 */
@Entity
@Table(name = "\"dependencia\"")
@NamedQueries({
  
})
@XmlRootElement
public class Dependencia implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
  * @generated
  */
  @Column(name = "dependencia", nullable = false, unique = false, length=20, insertable=true, updatable=true)
  private java.lang.String dependencia;
  
  /**
  * @generated
  */
  @Column(name = "descricao", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  private java.lang.String descricao;
  
  /**
   * @generated
   */
  @Id
  private java.lang.String idGDependencia;
  
  /**
  * @generated
  */
  @Column(name = "latitude_canto_1", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double latitudeCanto1;
  
  /**
  * @generated
  */
  @Column(name = "latitude_canto_2", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double latitudeCanto2;
  
  /**
  * @generated
  */
  @Column(name = "latitude_canto_3", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double latitudeCanto3;
  
  /**
  * @generated
  */
  @Column(name = "latitude_canto_4", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double latitudeCanto4;
  
  /**
  * @generated
  */
  @Column(name = "longitude_canto_1", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double longitudeCanto1;
  
  /**
  * @generated
  */
  @Column(name = "longitude_canto_2", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double longitudeCanto2;
  
  /**
  * @generated
  */
  @Column(name = "longitude_canto_3", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double longitudeCanto3;
  
  /**
  * @generated
  */
  @Column(name = "longitude_canto_4", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double longitudeCanto4;
  
  /**
  * @generated
  */
  @Column(name = "num_alunos", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Integer numAlunos;
  
  /**
  * @generated
  */
  @Column(name = "tipo_dependencia", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  private java.lang.String tipoDependencia;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_unid_fisica", referencedColumnName = "id_unid_fisica", insertable=true, updatable=true)
  private UnidadeFisica unidadeFisica;
  
  /**
  * @generated
  */
  @Column(name = "altitude", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double altitude;
  
  /**
  * @generated
  */
  @Column(name = "precisao_altitude", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double precisaoAltitude;
  
  /**
  * @generated
  */
  @Column(name = "precisao_latitude_longitude", nullable = true, unique = false, length=38, insertable=true, updatable=true)
  private java.lang.Double precisaoLatLong;

	/**
	 * Construtor
	 * @generated
	 */
	public Dependencia(){
	}

  /**
   * Obtém dependencia
   * 
   * return dependencia
   * @generated
   */
  public java.lang.String getDependencia(){
    return this.dependencia;
  }
  
  /**
   * Define dependencia
   * @param dependencia dependencia
   * @generated
   */
  public Dependencia setDependencia(java.lang.String dependencia){
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
  public Dependencia setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }
  
  /**
   * Obtém idGDependencia
   * 
   * return idGDependencia
   * @generated
   */
  public java.lang.String getIdGDependencia(){
    return this.idGDependencia;
  }
  
  /**
   * Define idGDependencia
   * @param idGDependencia idGDependencia
   * @generated
   */
  public Dependencia setIdGDependencia(java.lang.String idGDependencia){
    this.idGDependencia = idGDependencia;
    return this;
  }
  
  /**
   * Obtém latitudeCanto1
   * 
   * return latitudeCanto1
   * @generated
   */
  public java.lang.Double getLatitudeCanto1(){
    return this.latitudeCanto1;
  }
  
  /**
   * Define latitudeCanto1
   * @param latitudeCanto1 latitudeCanto1
   * @generated
   */
  public Dependencia setLatitudeCanto1(java.lang.Double latitudeCanto1){
    this.latitudeCanto1 = latitudeCanto1;
    return this;
  }
  
  /**
   * Obtém latitudeCanto2
   * 
   * return latitudeCanto2
   * @generated
   */
  public java.lang.Double getLatitudeCanto2(){
    return this.latitudeCanto2;
  }
  
  /**
   * Define latitudeCanto2
   * @param latitudeCanto2 latitudeCanto2
   * @generated
   */
  public Dependencia setLatitudeCanto2(java.lang.Double latitudeCanto2){
    this.latitudeCanto2 = latitudeCanto2;
    return this;
  }
  
  /**
   * Obtém latitudeCanto3
   * 
   * return latitudeCanto3
   * @generated
   */
  public java.lang.Double getLatitudeCanto3(){
    return this.latitudeCanto3;
  }
  
  /**
   * Define latitudeCanto3
   * @param latitudeCanto3 latitudeCanto3
   * @generated
   */
  public Dependencia setLatitudeCanto3(java.lang.Double latitudeCanto3){
    this.latitudeCanto3 = latitudeCanto3;
    return this;
  }
  
  /**
   * Obtém latitudeCanto4
   * 
   * return latitudeCanto4
   * @generated
   */
  public java.lang.Double getLatitudeCanto4(){
    return this.latitudeCanto4;
  }
  
  /**
   * Define latitudeCanto4
   * @param latitudeCanto4 latitudeCanto4
   * @generated
   */
  public Dependencia setLatitudeCanto4(java.lang.Double latitudeCanto4){
    this.latitudeCanto4 = latitudeCanto4;
    return this;
  }
  
  /**
   * Obtém longitudeCanto1
   * 
   * return longitudeCanto1
   * @generated
   */
  public java.lang.Double getLongitudeCanto1(){
    return this.longitudeCanto1;
  }
  
  /**
   * Define longitudeCanto1
   * @param longitudeCanto1 longitudeCanto1
   * @generated
   */
  public Dependencia setLongitudeCanto1(java.lang.Double longitudeCanto1){
    this.longitudeCanto1 = longitudeCanto1;
    return this;
  }
  
  /**
   * Obtém longitudeCanto2
   * 
   * return longitudeCanto2
   * @generated
   */
  public java.lang.Double getLongitudeCanto2(){
    return this.longitudeCanto2;
  }
  
  /**
   * Define longitudeCanto2
   * @param longitudeCanto2 longitudeCanto2
   * @generated
   */
  public Dependencia setLongitudeCanto2(java.lang.Double longitudeCanto2){
    this.longitudeCanto2 = longitudeCanto2;
    return this;
  }
  
  /**
   * Obtém longitudeCanto3
   * 
   * return longitudeCanto3
   * @generated
   */
  public java.lang.Double getLongitudeCanto3(){
    return this.longitudeCanto3;
  }
  
  /**
   * Define longitudeCanto3
   * @param longitudeCanto3 longitudeCanto3
   * @generated
   */
  public Dependencia setLongitudeCanto3(java.lang.Double longitudeCanto3){
    this.longitudeCanto3 = longitudeCanto3;
    return this;
  }
  
  /**
   * Obtém longitudeCanto4
   * 
   * return longitudeCanto4
   * @generated
   */
  public java.lang.Double getLongitudeCanto4(){
    return this.longitudeCanto4;
  }
  
  /**
   * Define longitudeCanto4
   * @param longitudeCanto4 longitudeCanto4
   * @generated
   */
  public Dependencia setLongitudeCanto4(java.lang.Double longitudeCanto4){
    this.longitudeCanto4 = longitudeCanto4;
    return this;
  }
  
  /**
   * Obtém numAlunos
   * 
   * return numAlunos
   * @generated
   */
  public java.lang.Integer getNumAlunos(){
    return this.numAlunos;
  }
  
  /**
   * Define numAlunos
   * @param numAlunos numAlunos
   * @generated
   */
  public Dependencia setNumAlunos(java.lang.Integer numAlunos){
    this.numAlunos = numAlunos;
    return this;
  }
  
  /**
   * Obtém tipoDependencia
   * 
   * return tipoDependencia
   * @generated
   */
  public java.lang.String getTipoDependencia(){
    return this.tipoDependencia;
  }
  
  /**
   * Define tipoDependencia
   * @param tipoDependencia tipoDependencia
   * @generated
   */
  public Dependencia setTipoDependencia(java.lang.String tipoDependencia){
    this.tipoDependencia = tipoDependencia;
    return this;
  }
  
  /**
   * Obtém unidadeFisica
   * 
   * return unidadeFisica
   * @generated
   */
  public UnidadeFisica getUnidadeFisica(){
    return this.unidadeFisica;
  }
  
  /**
   * Define unidadeFisica
   * @param unidadeFisica unidadeFisica
   * @generated
   */
  public Dependencia setUnidadeFisica(UnidadeFisica unidadeFisica){
    this.unidadeFisica = unidadeFisica;
    return this;
  }
  
  /**
   * Obtém altitude
   * 
   * return altitude
   * @generated
   */
  public java.lang.Double getAltitude(){
    return this.altitude;
  }
  
  /**
   * Define altitude
   * @param altitude altitude
   * @generated
   */
  public Dependencia setAltitude(java.lang.Double altitude){
    this.altitude = altitude;
    return this;
  }
  
  /**
   * Obtém precisaoAltitude
   * 
   * return precisaoAltitude
   * @generated
   */
  public java.lang.Double getPrecisaoAltitude(){
    return this.precisaoAltitude;
  }
  
  /**
   * Define precisaoAltitude
   * @param precisaoAltitude precisaoAltitude
   * @generated
   */
  public Dependencia setPrecisaoAltitude(java.lang.Double precisaoAltitude){
    this.precisaoAltitude = precisaoAltitude;
    return this;
  }
  
  /**
   * Obtém precisaoLatLong
   * 
   * return precisaoLatLong
   * @generated
   */
  public java.lang.Double getPrecisaoLatLong(){
    return this.precisaoLatLong;
  }
  
  /**
   * Define precisaoLatLong
   * @param precisaoLatLong precisaoLatLong
   * @generated
   */
  public Dependencia setPrecisaoLatLong(java.lang.Double precisaoLatLong){
    this.precisaoLatLong = precisaoLatLong;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Dependencia object = (Dependencia)obj;
    if (idGDependencia != null ? !idGDependencia.equals(object.idGDependencia) : object.idGDependencia != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idGDependencia == null) ? 0 : idGDependencia.hashCode());
    return result;
  }

}