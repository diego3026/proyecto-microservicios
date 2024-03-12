package edu.unimagdalena.academico.repository;

import edu.unimagdalena.academico.data.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    List<Usuario> findByNombreAndApellidos(String nombre, String apellido);
}
