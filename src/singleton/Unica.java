/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Sr. Roosevelt
 */
public class Unica {
    private static Unica instancia;
    private String mensagem;
    
    private Unica(){
        
    }
    public static Unica getInstancia(){
        if(instancia == null){
            instancia = new Unica();
        }
        return instancia;
    }
    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "Unica{" + "mensagem=" + mensagem + '}';
    }
    
}
