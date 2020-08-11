import java.util.Scanner;

public class lista {
    protected Nodo cabeza, cola;

    public lista() {
        cabeza = null;
        cola = null;
        
    }
    public boolean vacio() {
            if (cabeza==null) {
                return true; 
            }
            return false;
    }


    public void agregarnodo(int elemento) {
        cabeza = new Nodo(elemento, cabeza);
        if (cola == null) {
            cola = cabeza;
        }
    }

    public void mostrar() {
        Nodo recorrer = cabeza;
        while (recorrer != null) {
            System.out.print("(" + recorrer.dato + ")");
            recorrer = recorrer.flecha;
        }
    }
    public void elminar(){
        Nodo temp=null;
        if (vacio()==true) {
            System.out.print("la lista esta vacia");
        } else {
            if (cabeza==cola) {
                cabeza=null;
                cola=null;
                System.out.println("Elemento eliminado, la lista esta vacia");
            } else {
                temp=cabeza;
                cabeza=cabeza.flecha;
                temp=null;
                System.out.println("elemento eliminado");
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        lista ls = new lista();
        int opc = 0, el = 0;
        while (opc != 4) {
            System.out.println("----Menu----");
            System.out.println("1.agregar un elemento al inicio de la lista \n" + "2.mostrar los datos de la lista \n"
                    + "3.eliminar un nodo\n"+"4.salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Digite el numero a ingresar");
                    el=leer.nextInt();
                    ls.agregarnodo(el);
                    break;
                case 2:
                    ls.mostrar();
                    ls.vacio();
                    System.out.println(" ");
                    break;
                case 3:
                    ls.vacio();
                    ls.elminar();
                    break;
                case 4:
                System.out.println("saliendo...");
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    break;
            }
        }
     leer.close();
    }
}
