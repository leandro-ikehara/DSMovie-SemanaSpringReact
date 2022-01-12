package br.com.devsuperior.dsmovie.repositories;

import br.com.devsuperior.dsmovie.entities.Score;
import br.com.devsuperior.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ScoreRepository extends JpaRepository <Score, ScorePK> {
}
