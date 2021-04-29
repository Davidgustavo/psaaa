package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class UserDAO extends BasicDAO<String, User> implements Serializable {

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
  public UserDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de User utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String id){
      Query query = this.entityManager.createQuery("DELETE FROM User entity WHERE entity.id = :id");
      query.setParameter("id", id);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de User utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public User findById(java.lang.String id){
      TypedQuery<User> query = this.entityManager.createQuery("SELECT entity FROM User entity WHERE entity.id = :id", User.class);
      query.setParameter("id", id);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<Role> findRole(java.lang.String id, int limit, int offset) {
      TypedQuery<Role> query = this.entityManager.createQuery("SELECT entity FROM Role entity WHERE entity.user.id = :id", Role.class);
      query.setParameter("id", id);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<UsuarioSistema> findUsuarioSistema(java.lang.String id, int limit, int offset) {
      TypedQuery<UsuarioSistema> query = this.entityManager.createQuery("SELECT entity FROM UsuarioSistema entity WHERE entity.user.id = :id", UsuarioSistema.class);
      query.setParameter("id", id);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
}