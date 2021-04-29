package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class DiarioEletronicoDAO extends BasicDAO<String, DiarioEletronico> implements Serializable {

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
  public DiarioEletronicoDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de DiarioEletronico utilizando os identificadores
   * 
   * @param idGDiarioEletronico
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String idGDiarioEletronico){
      Query query = this.entityManager.createQuery("DELETE FROM DiarioEletronico entity WHERE entity.idGDiarioEletronico = :idGDiarioEletronico");
      query.setParameter("idGDiarioEletronico", idGDiarioEletronico);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de DiarioEletronico utilizando os identificadores
   * 
   * @param idGDiarioEletronico
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public DiarioEletronico findById(java.lang.String idGDiarioEletronico){
      TypedQuery<DiarioEletronico> query = this.entityManager.createQuery("SELECT entity FROM DiarioEletronico entity WHERE entity.idGDiarioEletronico = :idGDiarioEletronico", DiarioEletronico.class);
      query.setParameter("idGDiarioEletronico", idGDiarioEletronico);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<Ocorrencia> findOcorrencia(java.lang.String idGDiarioEletronico, int limit, int offset) {
      TypedQuery<Ocorrencia> query = this.entityManager.createQuery("SELECT entity FROM Ocorrencia entity WHERE entity.diarioEletronico.idGDiarioEletronico = :idGDiarioEletronico", Ocorrencia.class);
      query.setParameter("idGDiarioEletronico", idGDiarioEletronico);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
}