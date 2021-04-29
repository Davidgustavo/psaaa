package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class BaremaAvaliacaoDAO extends BasicDAO<String, BaremaAvaliacao> implements Serializable {

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
  public BaremaAvaliacaoDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de BaremaAvaliacao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String id){
      Query query = this.entityManager.createQuery("DELETE FROM BaremaAvaliacao entity WHERE entity.id = :id");
      query.setParameter("id", id);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de BaremaAvaliacao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public BaremaAvaliacao findById(java.lang.String id){
      TypedQuery<BaremaAvaliacao> query = this.entityManager.createQuery("SELECT entity FROM BaremaAvaliacao entity WHERE entity.id = :id", BaremaAvaliacao.class);
      query.setParameter("id", id);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<DisciplinaxBarema> findDisciplinaxBarema(java.lang.String id, int limit, int offset) {
      TypedQuery<DisciplinaxBarema> query = this.entityManager.createQuery("SELECT entity FROM DisciplinaxBarema entity WHERE entity.idGBaremaAvaliacao.id = :id", DisciplinaxBarema.class);
      query.setParameter("id", id);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<ItemBarema> findItemBarema(java.lang.String id, int limit, int offset) {
      TypedQuery<ItemBarema> query = this.entityManager.createQuery("SELECT entity FROM ItemBarema entity WHERE entity.idGBaremaAvaliacao.id = :id", ItemBarema.class);
      query.setParameter("id", id);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * ManyToOne Relation
   * @generated
   */
  public List<Disciplina> listDisciplina(java.lang.String id, int limit, int offset) {
      TypedQuery<Disciplina> query = this.entityManager.createQuery("SELECT entity.idDisciplina FROM DisciplinaxBarema entity WHERE entity.idGBaremaAvaliacao.id = :id", Disciplina.class);
      query.setParameter("id", id);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  public int deleteDisciplina(java.lang.String instanceId, java.lang.String relationIdDisciplina) {
    Query query = this.entityManager.createQuery("DELETE FROM DisciplinaxBarema entity WHERE entity.idGBaremaAvaliacao.id = :instanceId AND entity.idDisciplina.idDisciplina = :relationIdDisciplina");
    query.setParameter("instanceId", instanceId);
    query.setParameter("relationIdDisciplina", relationIdDisciplina);
    return query.executeUpdate();	  
  }
  
  /**
   * ManyToOne Relation
   * @generated
   */
  public List<CriterioAvaliacao> listCriterioAvaliacao(java.lang.String id, int limit, int offset) {
      TypedQuery<CriterioAvaliacao> query = this.entityManager.createQuery("SELECT entity.idGCriterioAvaliacao FROM ItemBarema entity WHERE entity.idGBaremaAvaliacao.id = :id", CriterioAvaliacao.class);
      query.setParameter("id", id);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  public int deleteCriterioAvaliacao(java.lang.String instanceId, java.lang.String relationId) {
    Query query = this.entityManager.createQuery("DELETE FROM ItemBarema entity WHERE entity.idGBaremaAvaliacao.id = :instanceId AND entity.idGCriterioAvaliacao.id = :relationId");
    query.setParameter("instanceId", instanceId);
    query.setParameter("relationId", relationId);
    return query.executeUpdate();	  
  }
  
}