package FilaEncadeada;

public class Fila {
	Elemento inicio;
	Elemento fim;
	int qtde = 0;
	
	public boolean isEmpty(){
		return (qtde == 0);
	}
	
	public void insert(String valor){
		Elemento novo = new Elemento();
		novo.dado = valor;
		
		if(isEmpty()){
			inicio = novo;			
		}else{		
			fim.prox = novo;
		}
		
		fim = novo;
		qtde++;		
	}
	
	public String remove(){
		if(isEmpty()){
			return null;
		}
		
		if(inicio == fim){
			fim = null;
		}
		
		String dadoR = inicio.dado;
		inicio = inicio.prox;
		qtde--;
		return dadoR;
	}
	
	public int getQtde(){
		return qtde;
	}
	
}
