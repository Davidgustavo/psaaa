package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela unidade_fisica
 * @generated
 */
@Entity
@Table(name = "\"unidade_fisica\"")
@NamedQueries({
  
})
@XmlRootElement
public class UnidadeFisica implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  private java.lang.String idUnidFisica;
  
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
	 * Construtor
	 * @generated
	 */
	public UnidadeFisica(){
	}

  /**
   * Obtém idUnidFisica
   * 
   * return idUnidFisica
   * @generated
   */
  public java.lang.String getIdUnidFisica(){
    return this.idUnidFisica;
  }
  
  /**
   * Define idUnidFisica
   * @param idUnidFisica idUnidFisica
   * @generated
   */
  public UnidadeFisica setIdUnidFisica(java.lang.String idUnidFisica){
    this.idUnidFisica = idUnidFisica;
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
  public UnidadeFisica setNomeAbrev(java.lang.String nomeAbrev){
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
  public UnidadeFisica setNomeCompl(java.lang.String nomeCompl){
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
    UnidadeFisica object = (UnidadeFisica)obj;
    if (idUnidFisica != null ? !idUnidFisica.equals(object.idUnidFisica) : object.idUnidFisica != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idUnidFisica == null) ? 0 : idUnidFisica.hashCode());
    return result;
  }

}