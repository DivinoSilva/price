package br.com.price.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.price.model.Endereco;

@Repository
@Transactional
public class EnderecoDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void incluir(Endereco endereco){
		manager.persist(endereco);	
	}

}
