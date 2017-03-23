package tree.binary;

public class TreeBinary {
	
	public Nodo raiz;
		
	public TreeBinary(){}
	/*
	public TreeBinary(int key, Object valor){
		this.n = new Nodo(key, valor);
	}*/
		/*
	public void insertar(Nodo nuevo){
		if(n == null){
			n = nuevo;
			return;
		}
		insertar(nuevo,n);
	}
	*/
	public void insertar(Nodo nuevo){
			
		if(raiz==null){
			raiz = nuevo;
			return;
		}
		
		Nodo padre = raiz; 
				
		while(padre!=null){
			
			nuevo.p = padre;
			
			if( nuevo.key >= padre.key){
				
				padre = padre.izq;
				
			}else{
				
				padre = padre.der;
				
			}
			
		}
		
		if(nuevo.key >= nuevo.p.key){
			nuevo.p.izq = nuevo;
			
		}else{
			nuevo.p.der = nuevo;
		}
		
			
		
	}
	
	public void busquedaEnOrden(Nodo raiz){
		
		if(raiz!=null){
			busquedaEnOrden(raiz.der);	
			System.out.println(raiz.key);
			busquedaEnOrden(raiz.izq);
		}
		
		
		
	}
	

}
