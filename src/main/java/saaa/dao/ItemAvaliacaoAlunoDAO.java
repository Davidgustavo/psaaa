package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class ItemAvaliacaoAlunoDAO extends BasicDAO<String, ItemAvaliacaoAluno> implements Serializable {

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
  public ItemAvaliacaoAlunoDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de ItemAvaliacaoAluno utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String id){
      Query query = this.entityManager.createQuery("DELETE FROM ItemAvaliacaoAluno entity WHERE entity.id = :id");
      query.setParameter("id", id);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de ItemAvaliacaoAluno utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public ItemAvaliacaoAluno findById(java.lang.String id){
      TypedQuery<ItemAvaliacaoAluno> query = this.entityManager.createQuery("SELECT entity FROM ItemAvaliacaoAluno entity WHERE entity.id = :id", ItemAvaliacaoAluno.class);
      query.setParameter("id", id);
      return query.getSingleResult();	
  }

}