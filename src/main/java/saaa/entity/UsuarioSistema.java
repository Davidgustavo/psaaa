package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela usuario_sistema
 * @generated
 */
@Entity
@Table(name = "\"usuario_sistema\"")
@NamedQueries({
  
})
@XmlRootElement
public class UsuarioSistema implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_aluno", referencedColumnName = "id_aluno", insertable=true, updatable=true)
  private Aluno aluno;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_hora_atualizacao", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  private java.util.Date dataHoraAtualizacao;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "data_hora_inclusao", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  private java.util.Date dataHoraInclusao;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_num_func", referencedColumnName = "id_num_func", insertable=true, updatable=true)
  private Docente docente;
  
  /**
   * @generated
   */
  @Id
  private java.lang.String idUsuario = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @Column(name = "motivo_situacao", nullable = true, unique = false, length=500, insertable=true, updatable=true)
  private java.lang.String motivoSituacao;
  
  /**
  * @generated
  */
  @Column(name = "nome_abrev", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  private java.lang.String nomeAbrev;
  
  /**
  * @generated
  */
  @Column(name = "nome_compl", nullable = true, unique = false, length=200, insertable=true, updatable=true)
  private java.lang.String nomeCompl;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_situacao", referencedColumnName = "id_situacao", insertable=true, updatable=true)
  private SituacaoUsuario situacaoUsuario;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_user", referencedColumnName = "id", insertable=true, updatable=true)
  private User user;
  
  /**
  * @generated
  */
  @Column(name = "token_firebase", nullable = true, unique = false, length=500, insertable=true, updatable=true)
  private java.lang.String tokenFirebase;

	/**
	 * Construtor
	 * @generated
	 */
	public UsuarioSistema(){
	}

  /**
   * Obtém aluno
   * 
   * return aluno
   * @generated
   */
  public Aluno getAluno(){
    return this.aluno;
  }
  
  /**
   * Define aluno
   * @param aluno aluno
   * @generated
   */
  public UsuarioSistema setAluno(Aluno aluno){
    this.aluno = aluno;
    return this;
  }
  
  /**
   * Obtém dataHoraAtualizacao
   * 
   * return dataHoraAtualizacao
   * @generated
   */
  public java.util.Date getDataHoraAtualizacao(){
    return this.dataHoraAtualizacao;
  }
  
  /**
   * Define dataHoraAtualizacao
   * @param dataHoraAtualizacao dataHoraAtualizacao
   * @generated
   */
  public UsuarioSistema setDataHoraAtualizacao(java.util.Date dataHoraAtualizacao){
    this.dataHoraAtualizacao = dataHoraAtualizacao;
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
  public UsuarioSistema setDataHoraInclusao(java.util.Date dataHoraInclusao){
    this.dataHoraInclusao = dataHoraInclusao;
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
  public UsuarioSistema setDocente(Docente docente){
    this.docente = docente;
    return this;
  }
  
  /**
   * Obtém idUsuario
   * 
   * return idUsuario
   * @generated
   */
  public java.lang.String getIdUsuario(){
    return this.idUsuario;
  }
  
  /**
   * Define idUsuario
   * @param idUsuario idUsuario
   * @generated
   */
  public UsuarioSistema setIdUsuario(java.lang.String idUsuario){
    this.idUsuario = idUsuario;
    return this;
  }
  
  /**
   * Obtém motivoSituacao
   * 
   * return motivoSituacao
   * @generated
   */
  public java.lang.String getMotivoSituacao(){
    return this.motivoSituacao;
  }
  
  /**
   * Define motivoSituacao
   * @param motivoSituacao motivoSituacao
   * @generated
   */
  public UsuarioSistema setMotivoSituacao(java.lang.String motivoSituacao){
    this.motivoSituacao = motivoSituacao;
    return this;
  }
  
  /**
   * Obtém nomeAbrev
   * 
   * return nomeAbrev
   * @generated
   */
  public java.lang.String getNomeAbrev(){
    return this.nomeAbrev;
  }
  
  /**
   * Define nomeAbrev
   * @param nomeAbrev nomeAbrev
   * @generated
   */
  public UsuarioSistema setNomeAbrev(java.lang.String nomeAbrev){
    this.nomeAbrev = nomeAbrev;
    return this;
  }
  
  /**
   * Obtém nomeCompl
   * 
   * return nomeCompl
   * @generated
   */
  public java.lang.String getNomeCompl(){
    return this.nomeCompl;
  }
  
  /**
   * Define nomeCompl
   * @param nomeCompl nomeCompl
   * @generated
   */
  public UsuarioSistema setNomeCompl(java.lang.String nomeCompl){
    this.nomeCompl = nomeCompl;
    return this;
  }
  
  /**
   * Obtém situacaoUsuario
   * 
   * return situacaoUsuario
   * @generated
   */
  public SituacaoUsuario getSituacaoUsuario(){
    return this.situacaoUsuario;
  }
  
  /**
   * Define situacaoUsuario
   * @param situacaoUsuario situacaoUsuario
   * @generated
   */
  public UsuarioSistema setSituacaoUsuario(SituacaoUsuario situacaoUsuario){
    this.situacaoUsuario = situacaoUsuario;
    return this;
  }
  
  /**
   * Obtém user
   * 
   * return user
   * @generated
   */
  public User getUser(){
    return this.user;
  }
  
  /**
   * Define user
   * @param user user
   * @generated
   */
  public UsuarioSistema setUser(User user){
    this.user = user;
    return this;
  }
  
  /**
   * Obtém tokenFirebase
   * 
   * return tokenFirebase
   * @generated
   */
  public java.lang.String getTokenFirebase(){
    return this.tokenFirebase;
  }
  
  /**
   * Define tokenFirebase
   * @param tokenFirebase tokenFirebase
   * @generated
   */
  public UsuarioSistema setTokenFirebase(java.lang.String tokenFirebase){
    this.tokenFirebase = tokenFirebase;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    UsuarioSistema object = (UsuarioSistema)obj;
    if (idUsuario != null ? !idUsuario.equals(object.idUsuario) : object.idUsuario != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
    return result;
  }

}