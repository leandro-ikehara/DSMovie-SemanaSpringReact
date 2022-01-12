package br.com.devsuperior.dsmovie.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="tb_user")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;

    public User(){}

    public User(Long id, String email)
    {
        this.id = id;
        this.email = email;
    }
}
