package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class MensagemSistemaDAO extends BasicDAO<String, MensagemSistema> implements Serializable {

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
  public MensagemSistemaDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de MensagemSistema utilizando os identificadores
   * 
   * @param idMensagem
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.Long idMensagem){
      Query query = this.entityManager.createQuery("DELETE FROM MensagemSistema entity WHERE entity.idMensagem = :idMensagem");
      query.setParameter("idMensagem", idMensagem);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de MensagemSistema utilizando os identificadores
   * 
   * @param idMensagem
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public MensagemSistema findById(java.lang.Long idMensagem){
      TypedQuery<MensagemSistema> query = this.entityManager.createQuery("SELECT entity FROM MensagemSistema entity WHERE entity.idMensagem = :idMensagem", MensagemSistema.class);
      query.setParameter("idMensagem", idMensagem);
      return query.getSingleResult();	
  }

}