package br.com.buritiscript.buritiscriptbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.buritiscript.buritiscriptbackend.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}