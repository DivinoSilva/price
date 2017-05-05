package br.com.price.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.price.model.Usuario;


@Repository
@Transactional
public class UsuarioDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void incluir(Usuario usuario){
		manager.persist(usuario);	
		
	}

	public List <Usuario> listar() {
		return manager.createQuery("select u from Usuario u", Usuario.class).getResultList();
	}

}
