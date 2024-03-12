package edu.unimagdalena.academico.service;

import edu.unimagdalena.academico.data.Mensaje;
import edu.unimagdalena.academico.repository.MensajeRepository;

import java.util.List;
import java.util.Optional;

public class MensajeServiceImp implements MensajeService {
    private MensajeRepository mensajeRepository;
    public MensajeServiceImp(MensajeRepository mensajeRepository) {
        this.mensajeRepository = mensajeRepository;
    }
    @Override
    public Mensaje crear(Mensaje usuario) {
        return mensajeRepository.save(usuario);
    }

    @Override
    public void eliminar(Long id) {
        mensajeRepository.deleteById(id);
    }

    @Override
    public Mensaje actualizar(Long id, Mensaje mensaje) {
        return mensajeRepository.findById(id).map(mensajeInDB -> {
            mensajeInDB.setContenido(mensaje.getContenido());
            mensajeInDB.setCreado(mensaje.getCreado());
            mensajeInDB.setCreador(mensaje.getCreador());
            mensajeInDB.setUsuario(mensaje.getUsuario());
            mensajeInDB.setDestinario(mensaje.getDestinario());
            return mensajeRepository.save(mensajeInDB);
        }).orElse(null);
    }

    @Override
    public List<Mensaje> findAll() {
        return mensajeRepository.findAll();
    }

    @Override
    public Optional<Mensaje> findById(Long id) {
        return mensajeRepository.findById(id);
    }
}
