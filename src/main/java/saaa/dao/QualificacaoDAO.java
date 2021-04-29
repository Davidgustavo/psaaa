package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class QualificacaoDAO extends BasicDAO<String, Qualificacao> implements Serializable {

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
  public QualificacaoDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de Qualificacao utilizando os identificadores
   * 
   * @param idQualificacao
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.Integer idQualificacao){
      Query query = this.entityManager.createQuery("DELETE FROM Qualificacao entity WHERE entity.idQualificacao = :idQualificacao");
      query.setParameter("idQualificacao", idQualificacao);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de Qualificacao utilizando os identificadores
   * 
   * @param idQualificacao
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public Qualificacao findById(java.lang.Integer idQualificacao){
      TypedQuery<Qualificacao> query = this.entityManager.createQuery("SELECT entity FROM Qualificacao entity WHERE entity.idQualificacao = :idQualificacao", Qualificacao.class);
      query.setParameter("idQualificacao", idQualificacao);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<AvaliacaoAula> findAvaliacaoAula(java.lang.Integer idQualificacao, int limit, int offset) {
      TypedQuery<AvaliacaoAula> query = this.entityManager.createQuery("SELECT entity FROM AvaliacaoAula entity WHERE entity.qualificacao.idQualificacao = :idQualificacao", AvaliacaoAula.class);
      query.setParameter("idQualificacao", idQualificacao);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * ManyToOne Relation
   * @generated
   */
  public List<PresencaAluno> listPresencaAluno(java.lang.Integer idQualificacao, int limit, int offset) {
      TypedQuery<PresencaAluno> query = this.entityManager.createQuery("SELECT entity.presencaAluno FROM AvaliacaoAula entity WHERE entity.qualificacao.idQualificacao = :idQualificacao", PresencaAluno.class);
      query.setParameter("idQualificacao", idQualificacao);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  public int deletePresencaAluno(java.lang.Integer instanceIdQualificacao, java.lang.String relationIdGPresencaAluno) {
    Query query = this.entityManager.createQuery("DELETE FROM AvaliacaoAula entity WHERE entity.qualificacao.idQualificacao = :instanceIdQualificacao AND entity.presencaAluno.idGPresencaAluno = :relationIdGPresencaAluno");
    query.setParameter("instanceIdQualificacao", instanceIdQualificacao);
    query.setParameter("relationIdGPresencaAluno", relationIdGPresencaAluno);
    return query.executeUpdate();	  
  }
  
}