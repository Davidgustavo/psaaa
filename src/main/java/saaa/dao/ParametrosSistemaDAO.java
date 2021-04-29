package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class ParametrosSistemaDAO extends BasicDAO<String, ParametrosSistema> implements Serializable {

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
  public ParametrosSistemaDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de ParametrosSistema utilizando os identificadores
   * 
   * @param idParametros
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.Integer idParametros){
      Query query = this.entityManager.createQuery("DELETE FROM ParametrosSistema entity WHERE entity.idParametros = :idParametros");
      query.setParameter("idParametros", idParametros);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de ParametrosSistema utilizando os identificadores
   * 
   * @param idParametros
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public ParametrosSistema findById(java.lang.Integer idParametros){
      TypedQuery<ParametrosSistema> query = this.entityManager.createQuery("SELECT entity FROM ParametrosSistema entity WHERE entity.idParametros = :idParametros", ParametrosSistema.class);
      query.setParameter("idParametros", idParametros);
      return query.getSingleResult();	
  }

}