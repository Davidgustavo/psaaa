package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class TurmaDAO extends BasicDAO<String, Turma> implements Serializable {

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
  public TurmaDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de Turma utilizando os identificadores
   * 
   * @param idGTurma
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String idGTurma){
      Query query = this.entityManager.createQuery("DELETE FROM Turma entity WHERE entity.idGTurma = :idGTurma");
      query.setParameter("idGTurma", idGTurma);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de Turma utilizando os identificadores
   * 
   * @param idGTurma
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public Turma findById(java.lang.String idGTurma){
      TypedQuery<Turma> query = this.entityManager.createQuery("SELECT entity FROM Turma entity WHERE entity.idGTurma = :idGTurma", Turma.class);
      query.setParameter("idGTurma", idGTurma);
      return query.getSingleResult();	
  }

  /**
   * OneToMany Relation
   * @generated
   */
  public List<Agenda> findAgenda(java.lang.String idGTurma, int limit, int offset) {
      TypedQuery<Agenda> query = this.entityManager.createQuery("SELECT entity FROM Agenda entity WHERE entity.turma.idGTurma = :idGTurma", Agenda.class);
      query.setParameter("idGTurma", idGTurma);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<Matricula> findMatricula(java.lang.String idGTurma, int limit, int offset) {
      TypedQuery<Matricula> query = this.entityManager.createQuery("SELECT entity FROM Matricula entity WHERE entity.turma.idGTurma = :idGTurma", Matricula.class);
      query.setParameter("idGTurma", idGTurma);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<Ocorrencia> findOcorrencia(java.lang.String idGTurma, int limit, int offset) {
      TypedQuery<Ocorrencia> query = this.entityManager.createQuery("SELECT entity FROM Ocorrencia entity WHERE entity.turma.idGTurma = :idGTurma", Ocorrencia.class);
      query.setParameter("idGTurma", idGTurma);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * OneToMany Relation
   * @generated
   */
  public List<PlanoDidatPedagT> findPlanoDidatPedagT(java.lang.String idGTurma, int limit, int offset) {
      TypedQuery<PlanoDidatPedagT> query = this.entityManager.createQuery("SELECT entity FROM PlanoDidatPedagT entity WHERE entity.turma.idGTurma = :idGTurma", PlanoDidatPedagT.class);
      query.setParameter("idGTurma", idGTurma);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }
  
  /**
   * ManyToOne Relation
   * @generated
   */
  public List<Aluno> listAluno(java.lang.String idGTurma, int limit, int offset) {
      TypedQuery<Aluno> query = this.entityManager.createQuery("SELECT entity.aluno FROM Matricula entity WHERE entity.turma.idGTurma = :idGTurma", Aluno.class);
      query.setParameter("idGTurma", idGTurma);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  public int deleteAluno(java.lang.String instanceIdGTurma, java.lang.String relationIdAluno) {
    Query query = this.entityManager.createQuery("DELETE FROM Matricula entity WHERE entity.turma.idGTurma = :instanceIdGTurma AND entity.aluno.idAluno = :relationIdAluno");
    query.setParameter("instanceIdGTurma", instanceIdGTurma);
    query.setParameter("relationIdAluno", relationIdAluno);
    return query.executeUpdate();	  
  }
  
  /**
   * ManyToOne Relation
   * @generated
   */
  public List<Subdisciplina> listSubdisciplina(java.lang.String idGTurma, int limit, int offset) {
      TypedQuery<Subdisciplina> query = this.entityManager.createQuery("SELECT entity.subdisciplina FROM PlanoDidatPedagT entity WHERE entity.turma.idGTurma = :idGTurma", Subdisciplina.class);
      query.setParameter("idGTurma", idGTurma);
      return query.setFirstResult(offset).setMaxResults(limit).getResultList();	  
  }

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  public int deleteSubdisciplina(java.lang.String instanceIdGTurma, java.lang.String relationIdGSubdisciplina) {
    Query query = this.entityManager.createQuery("DELETE FROM PlanoDidatPedagT entity WHERE entity.turma.idGTurma = :instanceIdGTurma AND entity.subdisciplina.idGSubdisciplina = :relationIdGSubdisciplina");
    query.setParameter("instanceIdGTurma", instanceIdGTurma);
    query.setParameter("relationIdGSubdisciplina", relationIdGSubdisciplina);
    return query.executeUpdate();	  
  }
  
}