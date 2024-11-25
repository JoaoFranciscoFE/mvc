package br.com.catolica.mvc.Contracts;

import br.com.catolica.mvc.Enums.EnumTipoUsuario;
import br.com.catolica.mvc.Model.Usuario;

import java.util.List;
import java.util.Map;

public interface IUsuarioController {
    boolean verficiarTipo(EnumTipoUsuario tipo);

    void inserirUsuario(Map<String, Object> pUser);

    List<Usuario> listarTodos();

    List<Usuario> buscarUsuarioPorNome();

    List<Usuario> buscarUsuarioPorNome(String nome);

    Usuario buscarPorEmail(String email);

    List<Usuario> buscarPorTipo(EnumTipoUsuario tipo);

    boolean removerPorId(String id);

    void atualizarDados(Map<String, Object> dados);

    boolean verificarEmail(String email);
}
