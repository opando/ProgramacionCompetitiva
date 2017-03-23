package tree.binary;


public class TestBST {
	// BST  -> binary search tree
	// son estructuras de datos , que sirven para modelar arboles en programacion
	//arboles y teoria de grafos es basico para empezar con machine learnig que es 
	// el tema sobre el que quiero que se base mi tesis
	
	

	public static void main(String[] args) {
		
		TreeBinary treeBinary= new TreeBinary();
		
		Nodo raiz = new Nodo(5,null);
		
		
		
		treeBinary.insertar(raiz);
		treeBinary.insertar(new Nodo(7,null));
		treeBinary.insertar(new Nodo(1,null));
		treeBinary.insertar(new Nodo(2,null));
		treeBinary.insertar(new Nodo(6,null));
		treeBinary.insertar(new Nodo(8,null));
		treeBinary.insertar(new Nodo(9,null));
		
		//System.out.println(treeBinary.n.izq.valor);
		
		treeBinary.busquedaEnOrden(treeBinary.raiz);
		
		
		
	}

}
