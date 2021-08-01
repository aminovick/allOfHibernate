package com.hibernate4all.tutorial.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.hibernate4all.tutorial.domain.Movie;

@Repository
public class MovieRepository {

	@PersistenceContext
	EntityManager entityManager;

	@Transactional
	public void persist(Movie movie) {
		entityManager.persist(movie);
	}

	public Movie find(Long id) {
		return entityManager.find(Movie.class, id);
	}

	public List<Movie> getAll() {
		return entityManager.createQuery("from Movie", Movie.class).getResultList();
	}

	@Transactional
	public Movie merge(Movie movie) {
		return entityManager.merge(movie);
	}

	@Transactional
	public void remove(Long l) {
		Movie movie = entityManager.find(Movie.class, l);
		entityManager.remove(movie);
	}

	public Movie getReference(Long l) {
		return entityManager.getReference(Movie.class, l);
	}
}
