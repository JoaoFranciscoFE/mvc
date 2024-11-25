package br.com.catolica.mvc.Model;

import br.com.catolica.mvc.Enums.EnumTipoUsuario;

import java.util.Map;
import java.util.UUID;

public class Usuario {
    private String id;
    private String nome;
    private String email;
    private EnumTipoUsuario tipo;
    public Usuario(String nome, String email ,EnumTipoUsuario tipo){
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.email = email;
        this.tipo = tipo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getId() {
        return this.id;
    }

    public EnumTipoUsuario getTipo() {
        return tipo;
    }

    public void atualizarPorMap(Map<String, Object> dados){
        this.tipo = (EnumTipoUsuario) dados.get("tipo");
        this.nome = dados.get("nome").toString();
        this.email = dados.get("email").toString();

    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
