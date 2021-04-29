package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class AgendaDAO extends BasicDAO<String, Agenda> implements Serializable {

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
  public AgendaDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de Agenda utilizando os identificadores
   * 
   * @param idAgenda
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.Long idAgenda){
      Query query = this.entityManager.createQuery("DELETE FROM Agenda entity WHERE entity.idAgenda = :idAgenda");
      query.setParameter("idAgenda", idAgenda);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de Agenda utilizando os identificadores
   * 
   * @param idAgenda
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public Agenda findById(java.lang.Long idAgenda){
      TypedQuery<Agenda> query = this.entityManager.createQuery("SELECT entity FROM Agenda entity WHERE entity.idAgenda = :idAgenda", Agenda.class);
      query.setParameter("idAgenda", idAgenda);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<AulaMinistrada> findAulaMinistrada(java.lang.Long idAgenda, int limit, int offset) {
      TypedQuery<AulaMinistrada> query = this.entityManager.createQuery("SELECT entity FROM AulaMinistrada entity WHERE entity.agenda.idAgenda = :idAgenda", AulaMinistrada.class);
      query.setParameter("idAgenda", idAgenda);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<DiarioEletronico> findDiarioEletronico(java.lang.Long idAgenda, int limit, int offset) {
      TypedQuery<DiarioEletronico> query = this.entityManager.createQuery("SELECT entity FROM DiarioEletronico entity WHERE entity.agenda.idAgenda = :idAgenda", DiarioEletronico.class);
      query.setParameter("idAgenda", idAgenda);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
}