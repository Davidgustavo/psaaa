package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela turma
 * @generated
 */
@Entity
@Table(name = "\"turma\"")
@NamedQueries({
  
})
@XmlRootElement
public class Turma implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
  * @generated
  */
  @Column(name = "ano", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Short ano;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_disciplina", referencedColumnName = "id_disciplina", insertable=true, updatable=true)
  private Disciplina disciplina;
  
  /**
   * @generated
   */
  @Id
  private java.lang.String idGTurma;
  
  /**
  * @generated
  */
  @Column(name = "semestre", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Byte semestre;
  
  /**
  * @generated
  */
  @Column(name = "turma", nullable = false, unique = false, length=20, insertable=true, updatable=true)
  private java.lang.String turma;
  
  /**
  * @generated
  */
  @Column(name = "turno", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  private java.lang.String turno;
  
  /**
  * @generated
  */
  @Column(name = "qtde_alunos", nullable = true, unique = false, length=10, precision=0, insertable=true, updatable=true)
  private java.lang.Double qtdeAlunos;

	/**
	 * Construtor
	 * @generated
	 */
	public Turma(){
	}

  /**
   * Obtém ano
   * 
   * return ano
   * @generated
   */
  public java.lang.Short getAno(){
    return this.ano;
  }
  
  /**
   * Define ano
   * @param ano ano
   * @generated
   */
  public Turma setAno(java.lang.Short ano){
    this.ano = ano;
    return this;
  }
  
  /**
   * Obtém disciplina
   * 
   * return disciplina
   * @generated
   */
  public Disciplina getDisciplina(){
    return this.disciplina;
  }
  
  /**
   * Define disciplina
   * @param disciplina disciplina
   * @generated
   */
  public Turma setDisciplina(Disciplina disciplina){
    this.disciplina = disciplina;
    return this;
  }
  
  /**
   * Obtém idGTurma
   * 
   * return idGTurma
   * @generated
   */
  public java.lang.String getIdGTurma(){
    return this.idGTurma;
  }
  
  /**
   * Define idGTurma
   * @param idGTurma idGTurma
   * @generated
   */
  public Turma setIdGTurma(java.lang.String idGTurma){
    this.idGTurma = idGTurma;
    return this;
  }
  
  /**
   * Obtém semestre
   * 
   * return semestre
   * @generated
   */
  public java.lang.Byte getSemestre(){
    return this.semestre;
  }
  
  /**
   * Define semestre
   * @param semestre semestre
   * @generated
   */
  public Turma setSemestre(java.lang.Byte semestre){
    this.semestre = semestre;
    return this;
  }
  
  /**
   * Obtém turma
   * 
   * return turma
   * @generated
   */
  public java.lang.String getTurma(){
    return this.turma;
  }
  
  /**
   * Define turma
   * @param turma turma
   * @generated
   */
  public Turma setTurma(java.lang.String turma){
    this.turma = turma;
    return this;
  }
  
  /**
   * Obtém turno
   * 
   * return turno
   * @generated
   */
  public java.lang.String getTurno(){
    return this.turno;
  }
  
  /**
   * Define turno
   * @param turno turno
   * @generated
   */
  public Turma setTurno(java.lang.String turno){
    this.turno = turno;
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
  public Turma setQtdeAlunos(java.lang.Double qtdeAlunos){
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
    Turma object = (Turma)obj;
    if (idGTurma != null ? !idGTurma.equals(object.idGTurma) : object.idGTurma != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idGTurma == null) ? 0 : idGTurma.hashCode());
    return result;
  }

}