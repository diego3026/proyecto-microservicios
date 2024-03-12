package edu.unimagdalena.academico.repository;

import edu.unimagdalena.academico.data.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensajeRepository extends JpaRepository<Mensaje, Long> {

}
