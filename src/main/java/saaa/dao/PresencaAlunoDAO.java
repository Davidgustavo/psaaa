package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class PresencaAlunoDAO extends BasicDAO<String, PresencaAluno> implements Serializable {

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
  public PresencaAlunoDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de PresencaAluno utilizando os identificadores
   * 
   * @param idGPresencaAluno
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String idGPresencaAluno){
      Query query = this.entityManager.createQuery("DELETE FROM PresencaAluno entity WHERE entity.idGPresencaAluno = :idGPresencaAluno");
      query.setParameter("idGPresencaAluno", idGPresencaAluno);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de PresencaAluno utilizando os identificadores
   * 
   * @param idGPresencaAluno
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public PresencaAluno findById(java.lang.String idGPresencaAluno){
      TypedQuery<PresencaAluno> query = this.entityManager.createQuery("SELECT entity FROM PresencaAluno entity WHERE entity.idGPresencaAluno = :idGPresencaAluno", PresencaAluno.class);
      query.setParameter("idGPresencaAluno", idGPresencaAluno);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<AvaliacaoAluno> findAvaliacaoAluno(java.lang.String idGPresencaAluno, int limit, int offset) {
      TypedQuery<AvaliacaoAluno> query = this.entityManager.createQuery("SELECT entity FROM AvaliacaoAluno entity WHERE entity.presencaAluno.idGPresencaAluno = :idGPresencaAluno", AvaliacaoAluno.class);
      query.setParameter("idGPresencaAluno", idGPresencaAluno);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<AvaliacaoAula> findAvaliacaoAula(java.lang.String idGPresencaAluno, int limit, int offset) {
      TypedQuery<AvaliacaoAula> query = this.entityManager.createQuery("SELECT entity FROM AvaliacaoAula entity WHERE entity.presencaAluno.idGPresencaAluno = :idGPresencaAluno", AvaliacaoAula.class);
      query.setParameter("idGPresencaAluno", idGPresencaAluno);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * ManyToOne Relation
   * @generated
   */
  public List<Qualificacao> listQualificacao(java.lang.String idGPresencaAluno, int limit, int offset) {
      TypedQuery<Qualificacao> query = this.entityManager.createQuery("SELECT entity.qualificacao FROM AvaliacaoAula entity WHERE entity.presencaAluno.idGPresencaAluno = :idGPresencaAluno", Qualificacao.class);
      query.setParameter("idGPresencaAluno", idGPresencaAluno);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  public int deleteQualificacao(java.lang.String instanceIdGPresencaAluno, java.lang.Integer relationIdQualificacao) {
    Query query = this.entityManager.createQuery("DELETE FROM AvaliacaoAula entity WHERE entity.presencaAluno.idGPresencaAluno = :instanceIdGPresencaAluno AND entity.qualificacao.idQualificacao = :relationIdQualificacao");
    query.setParameter("instanceIdGPresencaAluno", instanceIdGPresencaAluno);
    query.setParameter("relationIdQualificacao", relationIdQualificacao);
    return query.executeUpdate();	  
  }
  
}