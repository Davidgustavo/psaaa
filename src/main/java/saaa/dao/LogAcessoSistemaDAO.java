package saaa.dao;

import javax.persistence.*;
import saaa.entity.*;
import java.util.*;
import java.io.Serializable;

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * @generated
 */
public class LogAcessoSistemaDAO extends BasicDAO<String, LogAcessoSistema> implements Serializable {

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
  public LogAcessoSistemaDAO(EntityManager entitymanager) {
    super(entitymanager);
  }
  
  /**
   * Remove a instância de LogAcessoSistema utilizando os identificadores
   * 
   * @param idGLogAcessoSistema
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */  
  public int deleteById(java.lang.String idGLogAcessoSistema){
      Query query = this.entityManager.createQuery("DELETE FROM LogAcessoSistema entity WHERE entity.idGLogAcessoSistema = :idGLogAcessoSistema");
      query.setParameter("idGLogAcessoSistema", idGLogAcessoSistema);
      return query.executeUpdate();	
  }
  
  /**
   * Obtém a instância de LogAcessoSistema utilizando os identificadores
   * 
   * @param idGLogAcessoSistema
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */  
  public LogAcessoSistema findById(java.lang.String idGLogAcessoSistema){
      TypedQuery<LogAcessoSistema> query = this.entityManager.createQuery("SELECT entity FROM LogAcessoSistema entity WHERE entity.idGLogAcessoSistema = :idGLogAcessoSistema", LogAcessoSistema.class);
      query.setParameter("idGLogAcessoSistema", idGLogAcessoSistema);
      return query.getSingleResult();	
  }

}