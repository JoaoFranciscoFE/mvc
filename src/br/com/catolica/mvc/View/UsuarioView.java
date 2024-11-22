package br.com.catolica.mvc.View;

import br.com.catolica.mvc.Enums.EnumTipoUsuario;

import java.util.Scanner;

public class UsuarioView {
    Scanner scanner = new Scanner(System.in);
    public String inputNome(){
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        scanner.close();
        return nome;
    }

    public String inputEmail(){
        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();
        scanner.close();
        return email;

    }

    public EnumTipoUsuario inputTipo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tipo usuário");
        System.out.println("[1] ADM");
        System.out.println("[2] NORMAL");

        int tipo = scanner.nextInt();

        if (tipo == 1)
            return EnumTipoUsuario.ADM;
        else if(tipo == 2)
            return EnumTipoUsuario.NORMAL;
        else
            return null;
    }


}
