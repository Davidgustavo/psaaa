package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class UnidadeFisicaDAO extends BasicDAO<String, UnidadeFisica> implements Serializable {

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
  public UnidadeFisicaDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de UnidadeFisica utilizando os identificadores
   * 
   * @param idUnidFisica
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String idUnidFisica){
      Query query = this.entityManager.createQuery("DELETE FROM UnidadeFisica entity WHERE entity.idUnidFisica = :idUnidFisica");
      query.setParameter("idUnidFisica", idUnidFisica);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de UnidadeFisica utilizando os identificadores
   * 
   * @param idUnidFisica
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public UnidadeFisica findById(java.lang.String idUnidFisica){
      TypedQuery<UnidadeFisica> query = this.entityManager.createQuery("SELECT entity FROM UnidadeFisica entity WHERE entity.idUnidFisica = :idUnidFisica", UnidadeFisica.class);
      query.setParameter("idUnidFisica", idUnidFisica);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<Dependencia> findDependencia(java.lang.String idUnidFisica, int limit, int offset) {
      TypedQuery<Dependencia> query = this.entityManager.createQuery("SELECT entity FROM Dependencia entity WHERE entity.unidadeFisica.idUnidFisica = :idUnidFisica", Dependencia.class);
      query.setParameter("idUnidFisica", idUnidFisica);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
}