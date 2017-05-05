package br.com.price.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.price.model.Cidade;


@Repository
@Transactional
public class CidadeDao {

	

	
	@PersistenceContext
	private EntityManager manager;
	
	public void incluir(Cidade cidade){
		manager.persist(cidade);	
		
	}




}
