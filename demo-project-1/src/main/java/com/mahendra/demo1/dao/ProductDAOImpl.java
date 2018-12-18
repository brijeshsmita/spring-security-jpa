package com.mahendra.demo1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.mahendra.demo1.entities.Product;

@Component
public class ProductDAOImpl implements ProductDAO {

	@PersistenceContext
	private EntityManager em;
		
	@Override
	public Product findById(Integer id) {
		Product p=	em.find(Product.class, id);	
		return p;
	}

	@Override
	public void save(Product product) {
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
