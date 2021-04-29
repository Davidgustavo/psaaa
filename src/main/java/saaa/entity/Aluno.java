package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela aluno
 * @generated
 */
@Entity
@Table(name = "\"aluno\"")
@NamedQueries({
  
})
@XmlRootElement
public class Aluno implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
  * @generated
  */
  @Column(name = "candidato", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  private java.lang.String candidato;
  
  /**
  * @generated
  */
  @Column(name = "concurso", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  private java.lang.String concurso;
  
  /**
   * @generated
   */
  @Id
  private java.lang.String idAluno;
  
  /**
  * @generated
  */
  @Column(name = "nome_abrev", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  private java.lang.String nomeAbrev;
  
  /**
  * @generated
  */
  @Column(name = "nome_compl", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  private java.lang.String nomeCompl;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_pessoa", referencedColumnName = "id_pessoa", insertable=true, updatable=true)
  private Pessoa pessoa;
  
  /**
  * @generated
  */
  @Column(name = "chamada_automatica", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Boolean chamadaAutomatica = false;
  
  /**
  * @generated
  */
  @Column(name = "foto", nullable = true, unique = false, insertable=true, updatable=true)
  private byte[] foto;

	/**
	 * Construtor
	 * @generated
	 */
	public Aluno(){
	}

  /**
   * Obtém candidato
   * 
   * return candidato
   * @generated
   */
  public java.lang.String getCandidato(){
    return this.candidato;
  }
  
  /**
   * Define candidato
   * @param candidato candidato
   * @generated
   */
  public Aluno setCandidato(java.lang.String candidato){
    this.candidato = candidato;
    return this;
  }
  
  /**
   * Obtém concurso
   * 
   * return concurso
   * @generated
   */
  public java.lang.String getConcurso(){
    return this.concurso;
  }
  
  /**
   * Define concurso
   * @param concurso concurso
   * @generated
   */
  public Aluno setConcurso(java.lang.String concurso){
    this.concurso = concurso;
    return this;
  }
  
  /**
   * Obtém idAluno
   * 
   * return idAluno
   * @generated
   */
  public java.lang.String getIdAluno(){
    return this.idAluno;
  }
  
  /**
   * Define idAluno
   * @param idAluno idAluno
   * @generated
   */
  public Aluno setIdAluno(java.lang.String idAluno){
    this.idAluno = idAluno;
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
  public Aluno setNomeAbrev(java.lang.String nomeAbrev){
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
  public Aluno setNomeCompl(java.lang.String nomeCompl){
    this.nomeCompl = nomeCompl;
    return this;
  }
  
  /**
   * Obtém pessoa
   * 
   * return pessoa
   * @generated
   */
  public Pessoa getPessoa(){
    return this.pessoa;
  }
  
  /**
   * Define pessoa
   * @param pessoa pessoa
   * @generated
   */
  public Aluno setPessoa(Pessoa pessoa){
    this.pessoa = pessoa;
    return this;
  }
  
  /**
   * Obtém chamadaAutomatica
   * 
   * return chamadaAutomatica
   * @generated
   */
  public java.lang.Boolean getChamadaAutomatica(){
    return this.chamadaAutomatica;
  }
  
  /**
   * Define chamadaAutomatica
   * @param chamadaAutomatica chamadaAutomatica
   * @generated
   */
  public Aluno setChamadaAutomatica(java.lang.Boolean chamadaAutomatica){
    this.chamadaAutomatica = chamadaAutomatica;
    return this;
  }
  
  /**
   * Obtém foto
   * 
   * return foto
   * @generated
   */
  public byte[] getFoto(){
    return this.foto;
  }
  
  /**
   * Define foto
   * @param foto foto
   * @generated
   */
  public Aluno setFoto(byte[] foto){
    this.foto = foto;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Aluno object = (Aluno)obj;
    if (idAluno != null ? !idAluno.equals(object.idAluno) : object.idAluno != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idAluno == null) ? 0 : idAluno.hashCode());
    return result;
  }

}