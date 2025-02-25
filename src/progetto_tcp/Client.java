/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto_tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author federico
 */
public class Client {
    private String nome;
    private String colore;
    private Socket socket;
    PrintWriter out = null;
    BufferedReader in = null;


    public Client(String nome) {
        this.nome = nome;
    }

    public Client(String nome, String colore) {
        this.nome = nome;
        this.colore = colore;
    }

    public void connetti(String nomeServer, int portaServer) {
        try {
            this.socket = new Socket(nomeServer, portaServer);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void scrivi(String messaggio) {
        out.println(messaggio);
    }

    public void leggi() {
        try {
            System.out.println("Messaggio del Server: " + in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void chiudi() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
