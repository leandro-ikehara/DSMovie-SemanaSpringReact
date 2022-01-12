package br.com.devsuperior.dsmovie.repositories;

import br.com.devsuperior.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository <User, Long>
{
    User findByEmail(String email);
}
