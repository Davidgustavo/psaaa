package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class PlanoDidatPedagTDAO extends BasicDAO<String, PlanoDidatPedagT> implements Serializable {

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
  public PlanoDidatPedagTDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de PlanoDidatPedagT utilizando os identificadores
   * 
   * @param idGPlandp
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String idGPlandp){
      Query query = this.entityManager.createQuery("DELETE FROM PlanoDidatPedagT entity WHERE entity.idGPlandp = :idGPlandp");
      query.setParameter("idGPlandp", idGPlandp);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de PlanoDidatPedagT utilizando os identificadores
   * 
   * @param idGPlandp
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public PlanoDidatPedagT findById(java.lang.String idGPlandp){
      TypedQuery<PlanoDidatPedagT> query = this.entityManager.createQuery("SELECT entity FROM PlanoDidatPedagT entity WHERE entity.idGPlandp = :idGPlandp", PlanoDidatPedagT.class);
      query.setParameter("idGPlandp", idGPlandp);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<DiarioEletronico> findDiarioEletronico(java.lang.String idGPlandp, int limit, int offset) {
      TypedQuery<DiarioEletronico> query = this.entityManager.createQuery("SELECT entity FROM DiarioEletronico entity WHERE entity.planoDidatPedagT.idGPlandp = :idGPlandp", DiarioEletronico.class);
      query.setParameter("idGPlandp", idGPlandp);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
}