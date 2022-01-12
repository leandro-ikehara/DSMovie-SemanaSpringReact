package br.com.devsuperior.dsmovie.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScoreDTO
{
    private Long movieId;
    private String email;
    private Double score;

    public ScoreDTO(){}
}
