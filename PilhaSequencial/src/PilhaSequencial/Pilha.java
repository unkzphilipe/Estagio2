package PilhaSequencial;

public class Pilha {
	
	String[] elemento = new String[100];
	int top = -1;	
	
	public boolean isEmpty(){
		if(top == -1){
			return true;
		}		
		return false;
	}
	
	public boolean isFull(){
		if(elemento.length == top + 1){
			return true;
		}
		return false;
	}
	
	public boolean push(String valor){
		if(isFull()){
			return false;
		}		
		elemento[++top] = valor;
		return true;
	}
	
	public int getLength(){
		return top+1;
	}
	
	public String getTop(){
		if(isEmpty()){
			return null;
		}
		
		return elemento[top];
	}
	
	public String pop(){
		if(isEmpty()){
			return null;
		}		
		return elemento[top--];
	}
	
	public String print(){
		String c = "";
		for (int i = 0; i == top ; i++) {
			c += elemento[i] + " ";
		}
		return c;
	}
}
