package saaa.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela ROLE
 * @generated
 */
@Entity
@Table(name = "\"ROLE\"")
@NamedQueries({
  
})
@XmlRootElement
public class Role implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  @Id
  private User user;

	/**
	 * Construtor
	 * @generated
	 */
	public Role(){
	}

  /**
   * Obtém id
   * 
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public Role setId(java.lang.String id){
    this.id = id;
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
  public Role setUser(User user){
    this.user = user;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Role object = (Role)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    if (user != null ? !user.equals(object.user) : object.user != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    result = 31 * result + ((user == null) ? 0 : user.hashCode());
    return result;
  }

}