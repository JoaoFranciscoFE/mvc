package br.com.catolica.mvc.Contracts;

import br.com.catolica.mvc.Enums.EnumTipoUsuario;
import br.com.catolica.mvc.Model.Usuario;

import java.util.List;
import java.util.Map;

public interface IUsuarioController {
    boolean verficiarTipo(EnumTipoUsuario tipo);

    boolean verificarEmail(String email);
}
