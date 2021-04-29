package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class AulaMinistradaDAO extends BasicDAO<String, AulaMinistrada> implements Serializable {

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
  public AulaMinistradaDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de AulaMinistrada utilizando os identificadores
   * 
   * @param idGAulaMinistrada
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String idGAulaMinistrada){
      Query query = this.entityManager.createQuery("DELETE FROM AulaMinistrada entity WHERE entity.idGAulaMinistrada = :idGAulaMinistrada");
      query.setParameter("idGAulaMinistrada", idGAulaMinistrada);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de AulaMinistrada utilizando os identificadores
   * 
   * @param idGAulaMinistrada
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public AulaMinistrada findById(java.lang.String idGAulaMinistrada){
      TypedQuery<AulaMinistrada> query = this.entityManager.createQuery("SELECT entity FROM AulaMinistrada entity WHERE entity.idGAulaMinistrada = :idGAulaMinistrada", AulaMinistrada.class);
      query.setParameter("idGAulaMinistrada", idGAulaMinistrada);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<Chamada> findChamada(java.lang.String idGAulaMinistrada, int limit, int offset) {
      TypedQuery<Chamada> query = this.entityManager.createQuery("SELECT entity FROM Chamada entity WHERE entity.aulaMinistrada.idGAulaMinistrada = :idGAulaMinistrada", Chamada.class);
      query.setParameter("idGAulaMinistrada", idGAulaMinistrada);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
}