package br.com.devsuperior.dsmovie.services;

import br.com.devsuperior.dsmovie.dto.MovieDTO;
import br.com.devsuperior.dsmovie.entities.Movie;
import br.com.devsuperior.dsmovie.repositories.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class MovieService
{
    @Autowired
    private MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable)
    {
        Page<Movie> result = movieRepository.findAll(pageable);
        Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
        return page;
    }
    @Transactional(readOnly = true)
    public MovieDTO findById(Long id)
    {
        Movie result = movieRepository.findById(id).get();
        MovieDTO movieDTO = new MovieDTO(result);
        return movieDTO;
    }
}
