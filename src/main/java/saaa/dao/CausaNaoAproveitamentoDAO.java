package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class CausaNaoAproveitamentoDAO extends BasicDAO<String, CausaNaoAproveitamento> implements Serializable {

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
  public CausaNaoAproveitamentoDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de CausaNaoAproveitamento utilizando os identificadores
   * 
   * @param idCausaNaoAproveitamento
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.Integer idCausaNaoAproveitamento){
      Query query = this.entityManager.createQuery("DELETE FROM CausaNaoAproveitamento entity WHERE entity.idCausaNaoAproveitamento = :idCausaNaoAproveitamento");
      query.setParameter("idCausaNaoAproveitamento", idCausaNaoAproveitamento);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de CausaNaoAproveitamento utilizando os identificadores
   * 
   * @param idCausaNaoAproveitamento
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public CausaNaoAproveitamento findById(java.lang.Integer idCausaNaoAproveitamento){
      TypedQuery<CausaNaoAproveitamento> query = this.entityManager.createQuery("SELECT entity FROM CausaNaoAproveitamento entity WHERE entity.idCausaNaoAproveitamento = :idCausaNaoAproveitamento", CausaNaoAproveitamento.class);
      query.setParameter("idCausaNaoAproveitamento", idCausaNaoAproveitamento);
      return query.getSingleResult();	
  }

}