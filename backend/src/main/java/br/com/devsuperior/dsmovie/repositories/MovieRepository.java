package br.com.devsuperior.dsmovie.repositories;

import br.com.devsuperior.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieRepository extends JpaRepository <Movie, Long> {
}
