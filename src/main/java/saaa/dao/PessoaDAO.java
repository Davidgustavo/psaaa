package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class PessoaDAO extends BasicDAO<String, Pessoa> implements Serializable {

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
  public PessoaDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de Pessoa utilizando os identificadores
   * 
   * @param idPessoa
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.Long idPessoa){
      Query query = this.entityManager.createQuery("DELETE FROM Pessoa entity WHERE entity.idPessoa = :idPessoa");
      query.setParameter("idPessoa", idPessoa);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de Pessoa utilizando os identificadores
   * 
   * @param idPessoa
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public Pessoa findById(java.lang.Long idPessoa){
      TypedQuery<Pessoa> query = this.entityManager.createQuery("SELECT entity FROM Pessoa entity WHERE entity.idPessoa = :idPessoa", Pessoa.class);
      query.setParameter("idPessoa", idPessoa);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<Aluno> findAluno(java.lang.Long idPessoa, int limit, int offset) {
      TypedQuery<Aluno> query = this.entityManager.createQuery("SELECT entity FROM Aluno entity WHERE entity.pessoa.idPessoa = :idPessoa", Aluno.class);
      query.setParameter("idPessoa", idPessoa);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
}