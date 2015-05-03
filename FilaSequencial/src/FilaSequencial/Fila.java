package FilaSequencial;

public class Fila {
	String[] elementos = new String[100];
	int inicio = 0;
	int fim = -1;
	int qtde = 0;
	
	
	public boolean isEmpyt(){
		return (qtde == 0);
	}
	
	public boolean isFull(){
		return (qtde == elementos.length);		
	}
	
	public boolean insert(String elemento){
		if(isFull()){
			return false;
		}
		
		qtde ++;
		fim = (fim + 1) % elementos.length;
		elementos[fim] = elemento;
		return true;
	}
}
