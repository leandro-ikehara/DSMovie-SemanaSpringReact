package br.com.devsuperior.dsmovie.controllers;

import br.com.devsuperior.dsmovie.dto.MovieDTO;
import br.com.devsuperior.dsmovie.dto.ScoreDTO;
import br.com.devsuperior.dsmovie.services.MovieService;
import br.com.devsuperior.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController
{
    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO scoreDTO)
    {
        MovieDTO movieDTO = service.saveScore(scoreDTO);
        return movieDTO;
    }
}
