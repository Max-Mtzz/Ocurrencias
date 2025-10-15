//Código elaborado por Max Martínez
public class App {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);

        list.print();
        System.out.println("El numero 1 se repite: "+list.Ocurrencias(1)+" veces.");
    }
}
