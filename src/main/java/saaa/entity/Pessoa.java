package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela pessoa
 * @generated
 */
@Entity
@Table(name = "\"pessoa\"")
@NamedQueries({
  
})
@XmlRootElement
public class Pessoa implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  private java.lang.Long idPessoa;
  
  /**
  * @generated
  */
  @Column(name = "nome_abrev", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  private java.lang.String nomeAbrev;
  
  /**
  * @generated
  */
  @Column(name = "nome_compl", nullable = false, unique = false, length=100, insertable=true, updatable=true)
  private java.lang.String nomeCompl;

	/**
	 * Construtor
	 * @generated
	 */
	public Pessoa(){
	}

  /**
   * Obtém idPessoa
   * 
   * return idPessoa
   * @generated
   */
  public java.lang.Long getIdPessoa(){
    return this.idPessoa;
  }
  
  /**
   * Define idPessoa
   * @param idPessoa idPessoa
   * @generated
   */
  public Pessoa setIdPessoa(java.lang.Long idPessoa){
    this.idPessoa = idPessoa;
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
  public Pessoa setNomeAbrev(java.lang.String nomeAbrev){
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
  public Pessoa setNomeCompl(java.lang.String nomeCompl){
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
    Pessoa object = (Pessoa)obj;
    if (idPessoa != null ? !idPessoa.equals(object.idPessoa) : object.idPessoa != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idPessoa == null) ? 0 : idPessoa.hashCode());
    return result;
  }

}