package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela log_acesso_sistema
 * @generated
 */
@Entity
@Table(name = "\"log_acesso_sistema\"")
@NamedQueries({
  
})
@XmlRootElement
public class LogAcessoSistema implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_hora_acesso", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  private java.util.Date dataHoraAcesso;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_hora_logoff", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  private java.util.Date dataHoraLogoff;
  
  /**
   * @generated
   */
  @Id
  private java.lang.String idGLogAcessoSistema = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @Column(name = "motivo_logoff", nullable = true, unique = false, length=500, insertable=true, updatable=true)
  private java.lang.String motivoLogoff;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_usuario", referencedColumnName = "id_usuario", insertable=true, updatable=true)
  private UsuarioSistema usuarioSistema;

	/**
	 * Construtor
	 * @generated
	 */
	public LogAcessoSistema(){
	}

  /**
   * Obtém dataHoraAcesso
   * 
   * return dataHoraAcesso
   * @generated
   */
  public java.util.Date getDataHoraAcesso(){
    return this.dataHoraAcesso;
  }
  
  /**
   * Define dataHoraAcesso
   * @param dataHoraAcesso dataHoraAcesso
   * @generated
   */
  public LogAcessoSistema setDataHoraAcesso(java.util.Date dataHoraAcesso){
    this.dataHoraAcesso = dataHoraAcesso;
    return this;
  }
  
  /**
   * Obtém dataHoraLogoff
   * 
   * return dataHoraLogoff
   * @generated
   */
  public java.util.Date getDataHoraLogoff(){
    return this.dataHoraLogoff;
  }
  
  /**
   * Define dataHoraLogoff
   * @param dataHoraLogoff dataHoraLogoff
   * @generated
   */
  public LogAcessoSistema setDataHoraLogoff(java.util.Date dataHoraLogoff){
    this.dataHoraLogoff = dataHoraLogoff;
    return this;
  }
  
  /**
   * Obtém idGLogAcessoSistema
   * 
   * return idGLogAcessoSistema
   * @generated
   */
  public java.lang.String getIdGLogAcessoSistema(){
    return this.idGLogAcessoSistema;
  }
  
  /**
   * Define idGLogAcessoSistema
   * @param idGLogAcessoSistema idGLogAcessoSistema
   * @generated
   */
  public LogAcessoSistema setIdGLogAcessoSistema(java.lang.String idGLogAcessoSistema){
    this.idGLogAcessoSistema = idGLogAcessoSistema;
    return this;
  }
  
  /**
   * Obtém motivoLogoff
   * 
   * return motivoLogoff
   * @generated
   */
  public java.lang.String getMotivoLogoff(){
    return this.motivoLogoff;
  }
  
  /**
   * Define motivoLogoff
   * @param motivoLogoff motivoLogoff
   * @generated
   */
  public LogAcessoSistema setMotivoLogoff(java.lang.String motivoLogoff){
    this.motivoLogoff = motivoLogoff;
    return this;
  }
  
  /**
   * Obtém usuarioSistema
   * 
   * return usuarioSistema
   * @generated
   */
  public UsuarioSistema getUsuarioSistema(){
    return this.usuarioSistema;
  }
  
  /**
   * Define usuarioSistema
   * @param usuarioSistema usuarioSistema
   * @generated
   */
  public LogAcessoSistema setUsuarioSistema(UsuarioSistema usuarioSistema){
    this.usuarioSistema = usuarioSistema;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    LogAcessoSistema object = (LogAcessoSistema)obj;
    if (idGLogAcessoSistema != null ? !idGLogAcessoSistema.equals(object.idGLogAcessoSistema) : object.idGLogAcessoSistema != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idGLogAcessoSistema == null) ? 0 : idGLogAcessoSistema.hashCode());
    return result;
  }

}