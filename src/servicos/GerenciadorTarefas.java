package servicos;

import modelos.Usuario;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Usuario> usuarios;

    public GerenciadorTarefas(){
        this.usuarios = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public Usuario obterUsuario(String email){
        for(Usuario usuario: usuarios){
            if(usuario.getEmail().equals(email)){
                return usuario;
            }
        }
        return null;
    }

    public void excluirUsuario(String email){
        for(Usuario usuario: usuarios){
            if(usuario.getEmail().equals(email)){
                usuarios.remove(usuario);
            }
        }
    }
}
