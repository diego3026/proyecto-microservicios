package edu.unimagdalena.academico.service;

import edu.unimagdalena.academico.data.Usuario;

import java.util.List;
import java.util.Optional;

public interface Service<E> {
    E crear(E usuario);
    void eliminar(Long id);
    E actualizar(Long id, E entity);
    List<E> findAll();
    Optional<E> findById(Long id);
}
