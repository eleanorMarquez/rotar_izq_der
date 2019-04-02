
/**
 *
 * @author LENOVO
 */
public class nodoDE {

    private int info;
    private nodoDE sig, ant;

    public nodoDE() {
        this.sig = null;
        this.ant = null;

    }

    public nodoDE(int x) {

        this.info = x;
        this.sig = null;
        this.ant = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public nodoDE getSig() {
        return sig;
    }

    public void setSig(nodoDE sig) {
        this.sig = sig;
    }

    public nodoDE getAnt() {
        return ant;
    }

    public void setAnt(nodoDE ant) {
        this.ant = ant;
    }

    public void insert(nodoDE n) {

        n.sig = this.sig;
        n.ant = this;
        this.sig = n;
        if (n.sig != null) {
            n.sig.ant = n;
        }
    }

    public void append(nodoDE n) {

        nodoDE aux = this;
        while (aux.sig != null) {

            aux = aux.sig;
        }
        aux.sig = n;
        n.sig = null;
        n.ant = aux;
    }

    public nodoDE removeFirst() {

        nodoDE aux = this.sig;
        if (aux == null) {
            return null;
        }
        this.sig = aux.sig;
        if (aux.sig != null) {

            aux.sig.ant = this;
        }
        aux.sig = null;
        aux.ant = null;
        return aux;
    }

    public nodoDE removeLast() {

        nodoDE aux = this;
        nodoDE aux2 = this.sig;
        if (aux2 == null) {
            return null;
        }
        while (aux2.sig != null) {

            aux = aux.sig;
            aux2 = aux2.sig;
        }
        aux.sig = aux2.sig;
        aux2.sig = null;
        aux2.ant = null;
        return aux2;
    }

    public void RotarIzq() {

        nodoDE i = this.removeFirst();
        if (i != null) {
            this.append(i);
        }

    }

    public void RotarDer() {

        nodoDE d = this.removeLast();
        if (d != null) {
            this.insert(d);
        }
    }

    public void mostrar() {
        nodoDE aux = this.sig;
        if (aux == null) {
            System.out.println("lista vacia, no hay nodos que imprimir ");
        }
        while (aux != null) {
            System.out.print("|" +aux.info+"|" +  "=>");
            aux = aux.sig;
        }
    }
}
