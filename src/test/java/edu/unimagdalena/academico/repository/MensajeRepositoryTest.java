package edu.unimagdalena.academico.repository;

import edu.unimagdalena.academico.AbstractIntregrationDBTest;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class MensajeRepositoryTest extends AbstractIntregrationDBTest {
    @Autowired
    private MensajeRepository mensajeRepository;

    @BeforeEach
    void setUp() {
        mensajeRepository.deleteAll();
    }
}