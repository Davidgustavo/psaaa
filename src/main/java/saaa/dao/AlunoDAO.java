package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class AlunoDAO extends BasicDAO<String, Aluno> implements Serializable {

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
  public AlunoDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de Aluno utilizando os identificadores
   * 
   * @param idAluno
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String idAluno){
      Query query = this.entityManager.createQuery("DELETE FROM Aluno entity WHERE entity.idAluno = :idAluno");
      query.setParameter("idAluno", idAluno);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de Aluno utilizando os identificadores
   * 
   * @param idAluno
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public Aluno findById(java.lang.String idAluno){
      TypedQuery<Aluno> query = this.entityManager.createQuery("SELECT entity FROM Aluno entity WHERE entity.idAluno = :idAluno", Aluno.class);
      query.setParameter("idAluno", idAluno);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<Matricula> findMatricula(java.lang.String idAluno, int limit, int offset) {
      TypedQuery<Matricula> query = this.entityManager.createQuery("SELECT entity FROM Matricula entity WHERE entity.aluno.idAluno = :idAluno", Matricula.class);
      query.setParameter("idAluno", idAluno);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<UsuarioSistema> findUsuarioSistema(java.lang.String idAluno, int limit, int offset) {
      TypedQuery<UsuarioSistema> query = this.entityManager.createQuery("SELECT entity FROM UsuarioSistema entity WHERE entity.aluno.idAluno = :idAluno", UsuarioSistema.class);
      query.setParameter("idAluno", idAluno);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * ManyToOne Relation
   * @generated
   */
  public List<Turma> listTurma(java.lang.String idAluno, int limit, int offset) {
      TypedQuery<Turma> query = this.entityManager.createQuery("SELECT entity.turma FROM Matricula entity WHERE entity.aluno.idAluno = :idAluno", Turma.class);
      query.setParameter("idAluno", idAluno);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  public int deleteTurma(java.lang.String instanceIdAluno, java.lang.String relationIdGTurma) {
    Query query = this.entityManager.createQuery("DELETE FROM Matricula entity WHERE entity.aluno.idAluno = :instanceIdAluno AND entity.turma.idGTurma = :relationIdGTurma");
    query.setParameter("instanceIdAluno", instanceIdAluno);
    query.setParameter("relationIdGTurma", relationIdGTurma);
    return query.executeUpdate();	  
  }
  
}