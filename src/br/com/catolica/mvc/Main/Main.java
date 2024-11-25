package br.com.catolica.mvc.Main;

import br.com.catolica.mvc.Controller.UsuarioController;
import br.com.catolica.mvc.Enums.EnumTipoUsuario;
import br.com.catolica.mvc.View.UsuarioView;

import java.util.HashMap;
import java.util.Map;

public class Main {
    //V - View - (Controls the prints and the scanners of our code)
    //M - Model - (Used to represent data)
    //C - Controller - (Used to control the rules of the code)

    public static void main(String[] args) {
        UsuarioView userView = new UsuarioView();
        UsuarioController usuarioController = new UsuarioController();
        String nome = userView.inputNome();
        String email = userView.inputEmail();

        EnumTipoUsuario tipo = userView.inputTipo();

        Map<String, Object> pseudoUser = new HashMap<String, Object>();
        pseudoUser.put("nome", nome);
        pseudoUser.put("email", email);
        pseudoUser.put("tipo",tipo);

        usuarioController.inserirUsuario(pseudoUser);

        usuarioController.listarTodos();
    }
}
