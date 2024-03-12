package edu.unimagdalena.academico.service;

import edu.unimagdalena.academico.data.Sugerencia;
import edu.unimagdalena.academico.repository.SugerenciaRepository;

import java.util.List;
import java.util.Optional;

public class SugerenciaServiceImp implements SugerenciaService {
    private SugerenciaRepository sugerenciaRepository;
    public SugerenciaServiceImp(SugerenciaRepository sugerenciaRepository) {
        this.sugerenciaRepository = sugerenciaRepository;
    }
    @Override
    public Sugerencia crear(Sugerencia sugerencia) {
        return sugerenciaRepository.save(sugerencia);
    }

    @Override
    public void eliminar(Long id) {
        sugerenciaRepository.deleteById(id);
    }

    @Override
    public Sugerencia actualizar(Long id, Sugerencia entity) {
        return null;
    }

    @Override
    public List<Sugerencia> findAll() {
        return sugerenciaRepository.findAll();
    }

    @Override
    public Optional<Sugerencia> findById(Long id) {
        return sugerenciaRepository.findById(id);
    }
}
