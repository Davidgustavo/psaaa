package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class SituacaoUsuarioDAO extends BasicDAO<String, SituacaoUsuario> implements Serializable {

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
  public SituacaoUsuarioDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de SituacaoUsuario utilizando os identificadores
   * 
   * @param idSituacao
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String idSituacao){
      Query query = this.entityManager.createQuery("DELETE FROM SituacaoUsuario entity WHERE entity.idSituacao = :idSituacao");
      query.setParameter("idSituacao", idSituacao);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de SituacaoUsuario utilizando os identificadores
   * 
   * @param idSituacao
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public SituacaoUsuario findById(java.lang.String idSituacao){
      TypedQuery<SituacaoUsuario> query = this.entityManager.createQuery("SELECT entity FROM SituacaoUsuario entity WHERE entity.idSituacao = :idSituacao", SituacaoUsuario.class);
      query.setParameter("idSituacao", idSituacao);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<UsuarioSistema> findUsuarioSistema(java.lang.String idSituacao, int limit, int offset) {
      TypedQuery<UsuarioSistema> query = this.entityManager.createQuery("SELECT entity FROM UsuarioSistema entity WHERE entity.situacaoUsuario.idSituacao = :idSituacao", UsuarioSistema.class);
      query.setParameter("idSituacao", idSituacao);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
}