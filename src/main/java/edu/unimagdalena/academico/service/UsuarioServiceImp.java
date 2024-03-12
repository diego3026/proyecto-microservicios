package edu.unimagdalena.academico.service;

import edu.unimagdalena.academico.data.Usuario;
import edu.unimagdalena.academico.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

public class UsuarioServiceImp implements UsuarioService{
    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImp(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario crear(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void eliminar(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario actualizar(Long id, Usuario usuario) {
        return usuarioRepository.findById(id).map(usuarioDB -> {
            usuarioDB.setApellidos(usuario.getApellidos());
            usuarioDB.setEdad(usuario.getEdad());
            usuarioDB.setFoto(usuario.getFoto());
            usuarioDB.setEmail(usuario.getRol());
            usuarioDB.setCreado(usuario.getCreado());
            usuarioDB.setEnabled(usuario.getEnabled());
            usuarioDB.setMensajes(usuario.getMensajes());
            usuarioDB.setNombre(usuario.getNombre());
            usuarioDB.setPassword(usuario.getPassword());
            usuarioDB.setPasswordRepeat(usuario.getPasswordRepeat());
            usuarioDB.setSugerencias(usuario.getSugerencias());
            return usuarioRepository.save(usuarioDB);
        }).orElse(null);
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }
}
