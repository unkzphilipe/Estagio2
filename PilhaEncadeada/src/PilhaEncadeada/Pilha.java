package PilhaEncadeada;

public class Pilha {
	Elemento topo;
	int cont = 0;
	
	public boolean isEmpty(){
		if(topo == null){
			return true;
		}
		return false;
	}
	
	public void push(String valor){		
		Elemento novo = new Elemento();		
		novo.dado = valor;
		
		if(isEmpty()){		
			topo = novo;
			cont++;
		}else{
			novo.prox = topo;
			topo = novo;
			cont++;
		}
	}
	
	public String pop(){
		if(isEmpty()){
			return null;
		}		
		String dado = topo.dado;
		topo = topo.prox;
		cont--;
		return dado;		
	}
	
	public String getTopo(){
		if(isEmpty()){
			return null;
		}
		return topo.dado;		
	}
	
	public int getTamanho(){
		return cont;
	}
	
}
