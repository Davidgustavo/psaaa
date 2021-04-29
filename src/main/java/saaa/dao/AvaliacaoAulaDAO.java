package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class AvaliacaoAulaDAO extends BasicDAO<String, AvaliacaoAula> implements Serializable {

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
  public AvaliacaoAulaDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de AvaliacaoAula utilizando os identificadores
   * 
   * @param idAvaliacaoAula
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.Integer idAvaliacaoAula){
      Query query = this.entityManager.createQuery("DELETE FROM AvaliacaoAula entity WHERE entity.idAvaliacaoAula = :idAvaliacaoAula");
      query.setParameter("idAvaliacaoAula", idAvaliacaoAula);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de AvaliacaoAula utilizando os identificadores
   * 
   * @param idAvaliacaoAula
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public AvaliacaoAula findById(java.lang.Integer idAvaliacaoAula){
      TypedQuery<AvaliacaoAula> query = this.entityManager.createQuery("SELECT entity FROM AvaliacaoAula entity WHERE entity.idAvaliacaoAula = :idAvaliacaoAula", AvaliacaoAula.class);
      query.setParameter("idAvaliacaoAula", idAvaliacaoAula);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<CausaNaoAproveitamento> findCausaNaoAproveitamento(java.lang.Integer idAvaliacaoAula, int limit, int offset) {
      TypedQuery<CausaNaoAproveitamento> query = this.entityManager.createQuery("SELECT entity FROM CausaNaoAproveitamento entity WHERE entity.avaliacao.idAvaliacaoAula = :idAvaliacaoAula", CausaNaoAproveitamento.class);
      query.setParameter("idAvaliacaoAula", idAvaliacaoAula);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * ManyToOne Relation
   * @generated
   */
  public List<TipoNaoproveitamento> listTipoNaoproveitamento(java.lang.Integer idAvaliacaoAula, int limit, int offset) {
      TypedQuery<TipoNaoproveitamento> query = this.entityManager.createQuery("SELECT entity.tipoNaoAproveitamento FROM CausaNaoAproveitamento entity WHERE entity.avaliacao.idAvaliacaoAula = :idAvaliacaoAula", TipoNaoproveitamento.class);
      query.setParameter("idAvaliacaoAula", idAvaliacaoAula);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  public int deleteTipoNaoproveitamento(java.lang.Integer instanceIdAvaliacaoAula, java.lang.Integer relationIdTipoNaoAproveitamento) {
    Query query = this.entityManager.createQuery("DELETE FROM CausaNaoAproveitamento entity WHERE entity.avaliacao.idAvaliacaoAula = :instanceIdAvaliacaoAula AND entity.tipoNaoAproveitamento.idTipoNaoAproveitamento = :relationIdTipoNaoAproveitamento");
    query.setParameter("instanceIdAvaliacaoAula", instanceIdAvaliacaoAula);
    query.setParameter("relationIdTipoNaoAproveitamento", relationIdTipoNaoAproveitamento);
    return query.executeUpdate();	  
  }
  
}