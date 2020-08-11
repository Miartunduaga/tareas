public class Nodo {

public int dato;
public Nodo flecha;

public Nodo(final int d) {
    this.dato = d;
}

public Nodo(final int d, final Nodo n) {
 dato=d;
 flecha=n;
}

}