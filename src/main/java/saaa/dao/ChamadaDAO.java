package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class ChamadaDAO extends BasicDAO<String, Chamada> implements Serializable {

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
  public ChamadaDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de Chamada utilizando os identificadores
   * 
   * @param idGChamada
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String idGChamada){
      Query query = this.entityManager.createQuery("DELETE FROM Chamada entity WHERE entity.idGChamada = :idGChamada");
      query.setParameter("idGChamada", idGChamada);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de Chamada utilizando os identificadores
   * 
   * @param idGChamada
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public Chamada findById(java.lang.String idGChamada){
      TypedQuery<Chamada> query = this.entityManager.createQuery("SELECT entity FROM Chamada entity WHERE entity.idGChamada = :idGChamada", Chamada.class);
      query.setParameter("idGChamada", idGChamada);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<PresencaAluno> findPresencaAluno(java.lang.String idGChamada, int limit, int offset) {
      TypedQuery<PresencaAluno> query = this.entityManager.createQuery("SELECT entity FROM PresencaAluno entity WHERE entity.chamada.idGChamada = :idGChamada", PresencaAluno.class);
      query.setParameter("idGChamada", idGChamada);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
}