package com.hibernate4all.tutorial.repository;

import com.hibernate4all.tutorial.domain.MovieDetails;

public interface MovieDetailsRepositoryExtended {

	void addMovieDetails(MovieDetails movieDetails, Long idMovie);

	MovieDetails getMovieDetails(Long id);
}
