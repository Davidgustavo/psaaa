package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class TurnoDAO extends BasicDAO<String, Turno> implements Serializable {

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
  public TurnoDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de Turno utilizando os identificadores
   * 
   * @param idTurno
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String idTurno){
      Query query = this.entityManager.createQuery("DELETE FROM Turno entity WHERE entity.idTurno = :idTurno");
      query.setParameter("idTurno", idTurno);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de Turno utilizando os identificadores
   * 
   * @param idTurno
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public Turno findById(java.lang.String idTurno){
      TypedQuery<Turno> query = this.entityManager.createQuery("SELECT entity FROM Turno entity WHERE entity.idTurno = :idTurno", Turno.class);
      query.setParameter("idTurno", idTurno);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<Agenda> findAgenda(java.lang.String idTurno, int limit, int offset) {
      TypedQuery<Agenda> query = this.entityManager.createQuery("SELECT entity FROM Agenda entity WHERE entity.turno.idTurno = :idTurno", Agenda.class);
      query.setParameter("idTurno", idTurno);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
}