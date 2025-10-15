//Código elaborado por Max Martínez
public class SinglyLinkedList {
    //Instanciamos nuestra cabecera
    private Node head;

    //Creamos nuestro método para añadir
    public void add(int data){
        //Creamos un nodo
        Node newNode = new Node(data);
        //Verificamos si la cabeza esta vacia
        if(head == null){
            //Si la lista esta vacía el nuevo nodo se convierte en la cabeza
            head = newNode;
            return;
        }
        //En caso de no estar vacía va a reccorrer todos los nodos hasta encontrar la referencia(next) en null
        //Comenzamos desde el primero
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        //Se agrega el nuevo nodo en la referencia del ultimo nodo
        current.next = new Node(data);
    }

    //Imprimir datos
    public void print(){
        //El current equivale a la cabeza
        Node current = head;
        //Mientras el current sea diferente de null imprime el dato
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("null");
    }

    //Contar Ocurrencias
    public int Ocurrencias(int data){
        int ocurrencias = 0;
        Node current = head;

        while (current!=null) {
            //Verifica si se repite un dato y aumenta las repeticiones
            if (current.data == data) {
                ocurrencias++;
            }
            current = current.next;
        }

        return ocurrencias;
    }
}
