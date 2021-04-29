package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class SubdisciplinaDAO extends BasicDAO<String, Subdisciplina> implements Serializable {

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
  public SubdisciplinaDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de Subdisciplina utilizando os identificadores
   * 
   * @param idGSubdisciplina
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String idGSubdisciplina){
      Query query = this.entityManager.createQuery("DELETE FROM Subdisciplina entity WHERE entity.idGSubdisciplina = :idGSubdisciplina");
      query.setParameter("idGSubdisciplina", idGSubdisciplina);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de Subdisciplina utilizando os identificadores
   * 
   * @param idGSubdisciplina
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public Subdisciplina findById(java.lang.String idGSubdisciplina){
      TypedQuery<Subdisciplina> query = this.entityManager.createQuery("SELECT entity FROM Subdisciplina entity WHERE entity.idGSubdisciplina = :idGSubdisciplina", Subdisciplina.class);
      query.setParameter("idGSubdisciplina", idGSubdisciplina);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<PlanoDidatPedagT> findPlanoDidatPedagT(java.lang.String idGSubdisciplina, int limit, int offset) {
      TypedQuery<PlanoDidatPedagT> query = this.entityManager.createQuery("SELECT entity FROM PlanoDidatPedagT entity WHERE entity.subdisciplina.idGSubdisciplina = :idGSubdisciplina", PlanoDidatPedagT.class);
      query.setParameter("idGSubdisciplina", idGSubdisciplina);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * ManyToOne Relation
   * @generated
   */
  public List<Turma> listTurma(java.lang.String idGSubdisciplina, int limit, int offset) {
      TypedQuery<Turma> query = this.entityManager.createQuery("SELECT entity.turma FROM PlanoDidatPedagT entity WHERE entity.subdisciplina.idGSubdisciplina = :idGSubdisciplina", Turma.class);
      query.setParameter("idGSubdisciplina", idGSubdisciplina);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  public int deleteTurma(java.lang.String instanceIdGSubdisciplina, java.lang.String relationIdGTurma) {
    Query query = this.entityManager.createQuery("DELETE FROM PlanoDidatPedagT entity WHERE entity.subdisciplina.idGSubdisciplina = :instanceIdGSubdisciplina AND entity.turma.idGTurma = :relationIdGTurma");
    query.setParameter("instanceIdGSubdisciplina", instanceIdGSubdisciplina);
    query.setParameter("relationIdGTurma", relationIdGTurma);
    return query.executeUpdate();	  
  }
  
}