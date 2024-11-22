package br.com.catolica.mvc.Controller;

import br.com.catolica.mvc.Contracts.IUsuarioController;
import br.com.catolica.mvc.Enums.EnumTipoUsuario;
import br.com.catolica.mvc.Model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UsuarioController implements IUsuarioController {
    ArrayList<Usuario> bancoDados = new ArrayList<>();

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
    public List<Usuario> buscarUsuarioPorNome() {
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
