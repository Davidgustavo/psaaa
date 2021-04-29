package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class DependenciaDAO extends BasicDAO<String, Dependencia> implements Serializable {

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
  public DependenciaDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de Dependencia utilizando os identificadores
   * 
   * @param idGDependencia
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String idGDependencia){
      Query query = this.entityManager.createQuery("DELETE FROM Dependencia entity WHERE entity.idGDependencia = :idGDependencia");
      query.setParameter("idGDependencia", idGDependencia);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de Dependencia utilizando os identificadores
   * 
   * @param idGDependencia
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public Dependencia findById(java.lang.String idGDependencia){
      TypedQuery<Dependencia> query = this.entityManager.createQuery("SELECT entity FROM Dependencia entity WHERE entity.idGDependencia = :idGDependencia", Dependencia.class);
      query.setParameter("idGDependencia", idGDependencia);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<Agenda> findAgenda(java.lang.String idGDependencia, int limit, int offset) {
      TypedQuery<Agenda> query = this.entityManager.createQuery("SELECT entity FROM Agenda entity WHERE entity.dependencia.idGDependencia = :idGDependencia", Agenda.class);
      query.setParameter("idGDependencia", idGDependencia);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<AulaMinistrada> findAulaMinistrada(java.lang.String idGDependencia, int limit, int offset) {
      TypedQuery<AulaMinistrada> query = this.entityManager.createQuery("SELECT entity FROM AulaMinistrada entity WHERE entity.dependencia.idGDependencia = :idGDependencia", AulaMinistrada.class);
      query.setParameter("idGDependencia", idGDependencia);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
}