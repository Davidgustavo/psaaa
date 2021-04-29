package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class OcorrenciaDAO extends BasicDAO<String, Ocorrencia> implements Serializable {

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
  public OcorrenciaDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de Ocorrencia utilizando os identificadores
   * 
   * @param idGOcorrencia
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String idGOcorrencia){
      Query query = this.entityManager.createQuery("DELETE FROM Ocorrencia entity WHERE entity.idGOcorrencia = :idGOcorrencia");
      query.setParameter("idGOcorrencia", idGOcorrencia);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de Ocorrencia utilizando os identificadores
   * 
   * @param idGOcorrencia
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public Ocorrencia findById(java.lang.String idGOcorrencia){
      TypedQuery<Ocorrencia> query = this.entityManager.createQuery("SELECT entity FROM Ocorrencia entity WHERE entity.idGOcorrencia = :idGOcorrencia", Ocorrencia.class);
      query.setParameter("idGOcorrencia", idGOcorrencia);
      return query.getSingleResult();	
  }

}