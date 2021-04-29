package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela subdisciplina
 * @generated
 */
@Entity
@Table(name = "\"subdisciplina\"")
@NamedQueries({
  
})
@XmlRootElement
public class Subdisciplina implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
  * @generated
  */
  @Column(name = "descricao", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  private java.lang.String descricao;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_disciplina", referencedColumnName = "id_disciplina", insertable=true, updatable=true)
  private Disciplina disciplina;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="id_disciplina1", referencedColumnName = "id_disciplina", insertable=true, updatable=true)
  private Disciplina disciplina2;
  
  /**
   * @generated
   */
  @Id
  private java.lang.String idGSubdisciplina;

	/**
	 * Construtor
	 * @generated
	 */
	public Subdisciplina(){
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
  public Subdisciplina setDescricao(java.lang.String descricao){
    this.descricao = descricao;
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
  public Subdisciplina setDisciplina(Disciplina disciplina){
    this.disciplina = disciplina;
    return this;
  }
  
  /**
   * Obtém disciplina2
   * 
   * return disciplina2
   * @generated
   */
  public Disciplina getDisciplina2(){
    return this.disciplina2;
  }
  
  /**
   * Define disciplina2
   * @param disciplina2 disciplina2
   * @generated
   */
  public Subdisciplina setDisciplina2(Disciplina disciplina2){
    this.disciplina2 = disciplina2;
    return this;
  }
  
  /**
   * Obtém idGSubdisciplina
   * 
   * return idGSubdisciplina
   * @generated
   */
  public java.lang.String getIdGSubdisciplina(){
    return this.idGSubdisciplina;
  }
  
  /**
   * Define idGSubdisciplina
   * @param idGSubdisciplina idGSubdisciplina
   * @generated
   */
  public Subdisciplina setIdGSubdisciplina(java.lang.String idGSubdisciplina){
    this.idGSubdisciplina = idGSubdisciplina;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Subdisciplina object = (Subdisciplina)obj;
    if (idGSubdisciplina != null ? !idGSubdisciplina.equals(object.idGSubdisciplina) : object.idGSubdisciplina != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idGSubdisciplina == null) ? 0 : idGSubdisciplina.hashCode());
    return result;
  }

}