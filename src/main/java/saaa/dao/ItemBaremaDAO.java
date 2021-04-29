package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class ItemBaremaDAO extends BasicDAO<String, ItemBarema> implements Serializable {

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
  public ItemBaremaDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de ItemBarema utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String id){
      Query query = this.entityManager.createQuery("DELETE FROM ItemBarema entity WHERE entity.id = :id");
      query.setParameter("id", id);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de ItemBarema utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public ItemBarema findById(java.lang.String id){
      TypedQuery<ItemBarema> query = this.entityManager.createQuery("SELECT entity FROM ItemBarema entity WHERE entity.id = :id", ItemBarema.class);
      query.setParameter("id", id);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<ItemAvaliacaoAluno> findItemAvaliacaoAluno(java.lang.String id, int limit, int offset) {
      TypedQuery<ItemAvaliacaoAluno> query = this.entityManager.createQuery("SELECT entity FROM ItemAvaliacaoAluno entity WHERE entity.idGItemBarema.id = :id", ItemAvaliacaoAluno.class);
      query.setParameter("id", id);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * ManyToOne Relation
   * @generated
   */
  public List<AvaliacaoAluno> listAvaliacaoAluno(java.lang.String id, int limit, int offset) {
      TypedQuery<AvaliacaoAluno> query = this.entityManager.createQuery("SELECT entity.idGAvaliacaoAluno FROM ItemAvaliacaoAluno entity WHERE entity.idGItemBarema.id = :id", AvaliacaoAluno.class);
      query.setParameter("id", id);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  public int deleteAvaliacaoAluno(java.lang.String instanceId, java.lang.String relationId) {
    Query query = this.entityManager.createQuery("DELETE FROM ItemAvaliacaoAluno entity WHERE entity.idGItemBarema.id = :instanceId AND entity.idGAvaliacaoAluno.id = :relationId");
    query.setParameter("instanceId", instanceId);
    query.setParameter("relationId", relationId);
    return query.executeUpdate();	  
  }
  
}