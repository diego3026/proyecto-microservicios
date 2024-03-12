package edu.unimagdalena.academico.service;

import edu.unimagdalena.academico.data.Partido;
import edu.unimagdalena.academico.repository.PartidoRepository;
import jakarta.servlet.http.Part;

import java.util.List;
import java.util.Optional;

public class PartidoServiceImp implements PartidoService {
    private PartidoRepository partidoRepository;

    public PartidoServiceImp(PartidoRepository partidoRepository) {
        this.partidoRepository = partidoRepository;
    }
    @Override
    public Partido crear(Partido partido) {
        return partidoRepository.save(partido);
    }

    @Override
    public void eliminar(Long id) {
        partidoRepository.deleteById(id);
    }

    @Override
    public Partido actualizar(Long id, Partido partido) {
        return partidoRepository.findById(id).map(partidoInDB -> {
            partidoInDB.setCiudad(partido.getCiudad());
            partidoInDB.setFecha(partido.getFecha());
            partidoInDB.setComentarios(partido.getComentarios());
            partidoInDB.setDeporte(partido.getDeporte());
            partidoInDB.setCreador(partido.getCreador());
            partidoInDB.setProvincia(partido.getProvincia());
            partidoInDB.setHoraComienzo(partido.getHoraComienzo());
            partidoInDB.setHoraFinal(partido.getHoraFinal());
            partidoInDB.setParticipantes(partido.getParticipantes());
            partidoInDB.setSuplentes(partido.getSuplentes());
            partidoInDB.setUsuarios(partido.getUsuarios());
            return partidoRepository.save(partidoInDB);
        }).orElse(null);
    }

    @Override
    public List<Partido> findAll() {
        return partidoRepository.findAll();
    }

    @Override
    public Optional<Partido> findById(Long id) {
        return partidoRepository.findById(id);
    }
}
