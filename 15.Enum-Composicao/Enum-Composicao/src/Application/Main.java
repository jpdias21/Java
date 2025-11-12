package Application;

import entities.ClienteData;
import entities.enums.StatusPedido;

public class Main {
    public static void main(String[] args) {
        ClienteData clienteData = new ClienteData("Joao", "Pedro", "joao@gmail.com", StatusPedido.ENTREGUE);

        System.out.println(clienteData);
        System.out.println(StatusPedido.ENTREGUE.getStatus());
    }
}