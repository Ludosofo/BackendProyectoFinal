package com.capgemini.servicies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entities.Usuario;

@Repository
public interface IUsuarioServicies extends JpaRepository<Usuario, Long>{
}
