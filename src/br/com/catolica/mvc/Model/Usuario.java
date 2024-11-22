package br.com.catolica.mvc.Model;

import br.com.catolica.mvc.Enums.EnumTipoUsuario;

import java.util.UUID;

public class Usuario {
    private String id;
    private String nome;
    private String email;
    private EnumTipoUsuario tipo;
    public Usuario(String id, String nome, String email, EnumTipoUsuario tipo){
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
