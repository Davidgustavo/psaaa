package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela turno
 * @generated
 */
@Entity
@Table(name = "\"turno\"")
@NamedQueries({
  
})
@XmlRootElement
public class Turno implements Serializable {

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
  @Id
  private java.lang.String idTurno;
  
  /**
  * @generated
  */
  @Column(name = "mneumonico", nullable = true, unique = false, length=2, insertable=true, updatable=true)
  private java.lang.String mneumonico;

	/**
	 * Construtor
	 * @generated
	 */
	public Turno(){
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
  public Turno setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }
  
  /**
   * Obtém idTurno
   * 
   * return idTurno
   * @generated
   */
  public java.lang.String getIdTurno(){
    return this.idTurno;
  }
  
  /**
   * Define idTurno
   * @param idTurno idTurno
   * @generated
   */
  public Turno setIdTurno(java.lang.String idTurno){
    this.idTurno = idTurno;
    return this;
  }
  
  /**
   * Obtém mneumonico
   * 
   * return mneumonico
   * @generated
   */
  public java.lang.String getMneumonico(){
    return this.mneumonico;
  }
  
  /**
   * Define mneumonico
   * @param mneumonico mneumonico
   * @generated
   */
  public Turno setMneumonico(java.lang.String mneumonico){
    this.mneumonico = mneumonico;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Turno object = (Turno)obj;
    if (idTurno != null ? !idTurno.equals(object.idTurno) : object.idTurno != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idTurno == null) ? 0 : idTurno.hashCode());
    return result;
  }

}