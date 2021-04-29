package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela docente
 * @generated
 */
@Entity
@Table(name = "\"docente\"")
@NamedQueries({
  
})
@XmlRootElement
public class Docente implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  private java.lang.Long idNumFunc;
  
  /**
  * @generated
  */
  @Column(name = "nome_abrev", nullable = false, unique = false, length=50, insertable=true, updatable=true)
  private java.lang.String nomeAbrev;
  
  /**
  * @generated
  */
  @Column(name = "nome_compl", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  private java.lang.String nomeCompl;

	/**
	 * Construtor
	 * @generated
	 */
	public Docente(){
	}

  /**
   * Obtém idNumFunc
   * 
   * return idNumFunc
   * @generated
   */
  public java.lang.Long getIdNumFunc(){
    return this.idNumFunc;
  }
  
  /**
   * Define idNumFunc
   * @param idNumFunc idNumFunc
   * @generated
   */
  public Docente setIdNumFunc(java.lang.Long idNumFunc){
    this.idNumFunc = idNumFunc;
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
  public Docente setNomeAbrev(java.lang.String nomeAbrev){
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
  public Docente setNomeCompl(java.lang.String nomeCompl){
    this.nomeCompl = nomeCompl;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Docente object = (Docente)obj;
    if (idNumFunc != null ? !idNumFunc.equals(object.idNumFunc) : object.idNumFunc != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idNumFunc == null) ? 0 : idNumFunc.hashCode());
    return result;
  }

}