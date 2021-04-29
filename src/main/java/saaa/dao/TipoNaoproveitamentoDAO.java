package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class TipoNaoproveitamentoDAO extends BasicDAO<String, TipoNaoproveitamento> implements Serializable {

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
  public TipoNaoproveitamentoDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de TipoNaoproveitamento utilizando os identificadores
   * 
   * @param idTipoNaoAproveitamento
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.Integer idTipoNaoAproveitamento){
      Query query = this.entityManager.createQuery("DELETE FROM TipoNaoproveitamento entity WHERE entity.idTipoNaoAproveitamento = :idTipoNaoAproveitamento");
      query.setParameter("idTipoNaoAproveitamento", idTipoNaoAproveitamento);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de TipoNaoproveitamento utilizando os identificadores
   * 
   * @param idTipoNaoAproveitamento
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public TipoNaoproveitamento findById(java.lang.Integer idTipoNaoAproveitamento){
      TypedQuery<TipoNaoproveitamento> query = this.entityManager.createQuery("SELECT entity FROM TipoNaoproveitamento entity WHERE entity.idTipoNaoAproveitamento = :idTipoNaoAproveitamento", TipoNaoproveitamento.class);
      query.setParameter("idTipoNaoAproveitamento", idTipoNaoAproveitamento);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<CausaNaoAproveitamento> findCausaNaoAproveitamento(java.lang.Integer idTipoNaoAproveitamento, int limit, int offset) {
      TypedQuery<CausaNaoAproveitamento> query = this.entityManager.createQuery("SELECT entity FROM CausaNaoAproveitamento entity WHERE entity.tipoNaoAproveitamento.idTipoNaoAproveitamento = :idTipoNaoAproveitamento", CausaNaoAproveitamento.class);
      query.setParameter("idTipoNaoAproveitamento", idTipoNaoAproveitamento);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * ManyToOne Relation
   * @generated
   */
  public List<AvaliacaoAula> listAvaliacaoAula(java.lang.Integer idTipoNaoAproveitamento, int limit, int offset) {
      TypedQuery<AvaliacaoAula> query = this.entityManager.createQuery("SELECT entity.avaliacao FROM CausaNaoAproveitamento entity WHERE entity.tipoNaoAproveitamento.idTipoNaoAproveitamento = :idTipoNaoAproveitamento", AvaliacaoAula.class);
      query.setParameter("idTipoNaoAproveitamento", idTipoNaoAproveitamento);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  public int deleteAvaliacaoAula(java.lang.Integer instanceIdTipoNaoAproveitamento, java.lang.Integer relationIdAvaliacaoAula) {
    Query query = this.entityManager.createQuery("DELETE FROM CausaNaoAproveitamento entity WHERE entity.tipoNaoAproveitamento.idTipoNaoAproveitamento = :instanceIdTipoNaoAproveitamento AND entity.avaliacao.idAvaliacaoAula = :relationIdAvaliacaoAula");
    query.setParameter("instanceIdTipoNaoAproveitamento", instanceIdTipoNaoAproveitamento);
    query.setParameter("relationIdAvaliacaoAula", relationIdAvaliacaoAula);
    return query.executeUpdate();	  
  }
  
}