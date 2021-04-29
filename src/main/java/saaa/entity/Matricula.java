package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela matricula
 * @generated
 */
@Entity
@Table(name = "\"matricula\"")
@NamedQueries({
  
})
@XmlRootElement
public class Matricula implements Serializable {

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
  @Id
  private java.lang.String idGMatricula;
  
  /**
  * @generated
  */
  @Column(name = "sit_matricula", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  private java.lang.String sitMatricula;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_g_turma", referencedColumnName = "id_g_turma", insertable=true, updatable=true)
  private Turma turma;

	/**
	 * Construtor
	 * @generated
	 */
	public Matricula(){
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
  public Matricula setAluno(Aluno aluno){
    this.aluno = aluno;
    return this;
  }
  
  /**
   * Obtém idGMatricula
   * 
   * return idGMatricula
   * @generated
   */
  public java.lang.String getIdGMatricula(){
    return this.idGMatricula;
  }
  
  /**
   * Define idGMatricula
   * @param idGMatricula idGMatricula
   * @generated
   */
  public Matricula setIdGMatricula(java.lang.String idGMatricula){
    this.idGMatricula = idGMatricula;
    return this;
  }
  
  /**
   * Obtém sitMatricula
   * 
   * return sitMatricula
   * @generated
   */
  public java.lang.String getSitMatricula(){
    return this.sitMatricula;
  }
  
  /**
   * Define sitMatricula
   * @param sitMatricula sitMatricula
   * @generated
   */
  public Matricula setSitMatricula(java.lang.String sitMatricula){
    this.sitMatricula = sitMatricula;
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
  public Matricula setTurma(Turma turma){
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
    Matricula object = (Matricula)obj;
    if (idGMatricula != null ? !idGMatricula.equals(object.idGMatricula) : object.idGMatricula != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idGMatricula == null) ? 0 : idGMatricula.hashCode());
    return result;
  }

}