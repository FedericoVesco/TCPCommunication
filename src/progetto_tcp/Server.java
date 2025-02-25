/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto_tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author federico
 */
public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private int porta;

    public Server(int porta) {
        this.porta = porta;
        try {
            serverSocket = new ServerSocket(porta);
            System.out.println ("Il server è in ascolto");
        } catch (IOException e) {
            System.out.println("Errore nella fase di ascolto");
        }
    }

    public Socket attendi() {
         try{
            clientSocket = serverSocket.accept();
            System.out.println("Il client si è connesso");
        }catch (IOException e) {
            System.err.println("Problema di connessione con il client");
        }
        return clientSocket;
    }

    public void scrivi(String messaggio) {

    }

    public void leggi() {

    }

    public void chiudi() {

    }

    public void termina() {

    }
}
