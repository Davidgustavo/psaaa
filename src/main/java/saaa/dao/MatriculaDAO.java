package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class MatriculaDAO extends BasicDAO<String, Matricula> implements Serializable {

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
  public MatriculaDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de Matricula utilizando os identificadores
   * 
   * @param idGMatricula
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String idGMatricula){
      Query query = this.entityManager.createQuery("DELETE FROM Matricula entity WHERE entity.idGMatricula = :idGMatricula");
      query.setParameter("idGMatricula", idGMatricula);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de Matricula utilizando os identificadores
   * 
   * @param idGMatricula
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public Matricula findById(java.lang.String idGMatricula){
      TypedQuery<Matricula> query = this.entityManager.createQuery("SELECT entity FROM Matricula entity WHERE entity.idGMatricula = :idGMatricula", Matricula.class);
      query.setParameter("idGMatricula", idGMatricula);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<Ocorrencia> findOcorrencia(java.lang.String idGMatricula, int limit, int offset) {
      TypedQuery<Ocorrencia> query = this.entityManager.createQuery("SELECT entity FROM Ocorrencia entity WHERE entity.matricula.idGMatricula = :idGMatricula", Ocorrencia.class);
      query.setParameter("idGMatricula", idGMatricula);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<PresencaAluno> findPresencaAluno(java.lang.String idGMatricula, int limit, int offset) {
      TypedQuery<PresencaAluno> query = this.entityManager.createQuery("SELECT entity FROM PresencaAluno entity WHERE entity.matricula.idGMatricula = :idGMatricula", PresencaAluno.class);
      query.setParameter("idGMatricula", idGMatricula);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
}