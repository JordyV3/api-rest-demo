package org.api.apirestdemo.repositories;

import org.api.apirestdemo.models.UsuarioModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);

}
