package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class CriterioAvaliacaoDAO extends BasicDAO<String, CriterioAvaliacao> implements Serializable {

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
  public CriterioAvaliacaoDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de CriterioAvaliacao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String id){
      Query query = this.entityManager.createQuery("DELETE FROM CriterioAvaliacao entity WHERE entity.id = :id");
      query.setParameter("id", id);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de CriterioAvaliacao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public CriterioAvaliacao findById(java.lang.String id){
      TypedQuery<CriterioAvaliacao> query = this.entityManager.createQuery("SELECT entity FROM CriterioAvaliacao entity WHERE entity.id = :id", CriterioAvaliacao.class);
      query.setParameter("id", id);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<ItemBarema> findItemBarema(java.lang.String id, int limit, int offset) {
      TypedQuery<ItemBarema> query = this.entityManager.createQuery("SELECT entity FROM ItemBarema entity WHERE entity.idGCriterioAvaliacao.id = :id", ItemBarema.class);
      query.setParameter("id", id);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * ManyToOne Relation
   * @generated
   */
  public List<BaremaAvaliacao> listBaremaAvaliacao(java.lang.String id, int limit, int offset) {
      TypedQuery<BaremaAvaliacao> query = this.entityManager.createQuery("SELECT entity.idGBaremaAvaliacao FROM ItemBarema entity WHERE entity.idGCriterioAvaliacao.id = :id", BaremaAvaliacao.class);
      query.setParameter("id", id);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  public int deleteBaremaAvaliacao(java.lang.String instanceId, java.lang.String relationId) {
    Query query = this.entityManager.createQuery("DELETE FROM ItemBarema entity WHERE entity.idGCriterioAvaliacao.id = :instanceId AND entity.idGBaremaAvaliacao.id = :relationId");
    query.setParameter("instanceId", instanceId);
    query.setParameter("relationId", relationId);
    return query.executeUpdate();	  
  }
  
}