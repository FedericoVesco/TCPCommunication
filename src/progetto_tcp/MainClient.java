package progetto_tcp;

public class MainClient {
    public static void main (String[] args) {
        Client client = new Client("Federico");
        client.connetti("localhost", 50000);
        client.scrivi("Connessione Client Effettuata");
        client.leggi();
        client.chiudi();
    }
}
