package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class RoleDAO extends BasicDAO<String, Role> implements Serializable {

	/**
	 * UID da classe, necessário na serialização 
	 * @generated
	 */
	private static final long serialVersionUID = 1L;

  /**
   * Guarda uma cópia da EntityManager na instância
   * 
   * @param entitymanager
   *          Tabela do banco
   * @generated
   */
  public RoleDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de Role utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @param user
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String id, java.lang.String user){
      Query query = this.entityManager.createQuery("DELETE FROM Role entity WHERE entity.id = :id AND entity.user = :user");
      query.setParameter("id", id);
      query.setParameter("user", user);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de Role utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @param user
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public Role findById(java.lang.String id, java.lang.String user){
      TypedQuery<Role> query = this.entityManager.createQuery("SELECT entity FROM Role entity WHERE entity.id = :id AND entity.user = :user", Role.class);
      query.setParameter("id", id);
      query.setParameter("user", user);
      return query.getSingleResult();	
  }

}