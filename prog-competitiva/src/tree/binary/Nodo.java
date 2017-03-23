package tree.binary;


public class Nodo {

	public Nodo p;
	public Nodo der;
	public Nodo izq;
	public int key;
	public Object valor;

	public Nodo(int key, Object valor) {
		this.key = key;
		this.valor = valor;
	}

}
