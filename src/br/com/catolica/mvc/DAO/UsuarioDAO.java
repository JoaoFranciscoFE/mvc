package br.com.catolica.mvc.DAO;

import br.com.catolica.mvc.Contracts.IUsuarioDAO;
import br.com.catolica.mvc.Enums.EnumTipoUsuario;
import br.com.catolica.mvc.Model.Usuario;

import java.util.List;
import java.util.Map;

public class UsuarioDAO implements IUsuarioDAO {
    @Override
    public boolean verficiarTipo(EnumTipoUsuario tipo) {
        return false;
    }

    @Override
    public void inserirUsuario(Map<String, Object> pUser) {
    }

    @Override
    public List<Usuario> listarTodos() {
        return List.of();
    }

    @Override
    public List<Usuario> buscarUsuarioPorNome(String nome) {
        return List.of();
    }

    @Override
    public Usuario buscarPorEmail(String email) {
        return null;
    }

    @Override
    public List<Usuario> buscarPorTipo(EnumTipoUsuario tipo) {
        return List.of();
    }

    @Override
    public boolean removerPorId(String id) {
        return false;
    }

    @Override
    public void atualizarDados(Map<String, Object> dados) {

    }

    @Override
    public boolean verificarEmail(String email) {
        return false;
    }
}
