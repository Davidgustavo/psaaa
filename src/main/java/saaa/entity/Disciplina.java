package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela disciplina
 * @generated
 */
@Entity
@Table(name = "\"disciplina\"")
@NamedQueries({
  
})
@XmlRootElement
public class Disciplina implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  private java.lang.String idDisciplina;
  
  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, length=200, insertable=true, updatable=true)
  private java.lang.String nome;
  
  /**
  * @generated
  */
  @Column(name = "nome_completo", nullable = true, unique = false, length=200, insertable=true, updatable=true)
  private java.lang.String nomeCompleto;

	/**
	 * Construtor
	 * @generated
	 */
	public Disciplina(){
	}

  /**
   * Obtém idDisciplina
   * 
   * return idDisciplina
   * @generated
   */
  public java.lang.String getIdDisciplina(){
    return this.idDisciplina;
  }
  
  /**
   * Define idDisciplina
   * @param idDisciplina idDisciplina
   * @generated
   */
  public Disciplina setIdDisciplina(java.lang.String idDisciplina){
    this.idDisciplina = idDisciplina;
    return this;
  }
  
  /**
   * Obtém nome
   * 
   * return nome
   * @generated
   */
  public java.lang.String getNome(){
    return this.nome;
  }
  
  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Disciplina setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * Obtém nomeCompleto
   * 
   * return nomeCompleto
   * @generated
   */
  public java.lang.String getNomeCompleto(){
    return this.nomeCompleto;
  }
  
  /**
   * Define nomeCompleto
   * @param nomeCompleto nomeCompleto
   * @generated
   */
  public Disciplina setNomeCompleto(java.lang.String nomeCompleto){
    this.nomeCompleto = nomeCompleto;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Disciplina object = (Disciplina)obj;
    if (idDisciplina != null ? !idDisciplina.equals(object.idDisciplina) : object.idDisciplina != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idDisciplina == null) ? 0 : idDisciplina.hashCode());
    return result;
  }

}