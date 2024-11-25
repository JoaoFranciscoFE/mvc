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
        return tipo == null;
    }

    @Override
    public void inserirUsuario(Map<String, Object> pUser) {
        if (verificarEmail(pUser.get("email").toString()) && verficiarTipo((EnumTipoUsuario) pUser.get("tipo"))) {
            Usuario usuario = new Usuario(
                    pUser.get("nome").toString(),
                    pUser.get("email").toString(),
                    (EnumTipoUsuario) pUser.get("tipo")
            );
            this.bancoDados.add(usuario);
        }
    }

    @Override
    public List<Usuario> listarTodos() {
        System.out.println(this.bancoDados);
        return this.bancoDados;

    }

    @Override
    public List<Usuario> buscarUsuarioPorNome() {
        return List.of();
    }

    @Override
    public List<Usuario> buscarUsuarioPorNome(String nome) {
        ArrayList<Usuario> auxiliar = new ArrayList<>();

        for(Usuario user : this.bancoDados){
            if(user.getNome().toLowerCase().contains(nome)) {
                auxiliar.add(user);
            }
        }
        return List.of();
    }

    @Override
    public Usuario buscarPorEmail(String email) {
        for(Usuario user : this.bancoDados){
            if(user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<Usuario> buscarPorTipo(EnumTipoUsuario tipo) {
        ArrayList<Usuario> auxiliar = new ArrayList<>();

        for(Usuario user : this.bancoDados){
            if(user.getTipo().equals(tipo)) {
                auxiliar.add(user);
            }
        }
        return auxiliar;
    }

    @Override
    public boolean removerPorId(String id) {
        for (Usuario user : this.bancoDados) {
            if (user.getId().equals(id)) {
                this.bancoDados.remove(user);
            }
        }
        return false;
    }

    @Override
    public void atualizarDados(Map<String, Object> dados) {
        String emailBuscado = dados.get("email").toString();

        Usuario usuario = this.buscarPorEmail(emailBuscado);
        int posicao = this.bancoDados.indexOf(usuario);
        if (

                usuario != null
                && this.verficiarTipo((EnumTipoUsuario) dados.get("tipo"))
                && this.verificarEmail(dados.get("email").toString())
        ){

            usuario.atualizarPorMap(dados);
            this.bancoDados.set(posicao, usuario);
        } else {
            System.out.println("Não foi possivel atualizar");
        }
    }

    @Override
    public boolean verificarEmail(String email) {
        return email.contains("@");

    }
}
