package JogoImpar;



import javax.swing.JOptionPane;

public class Main {
public static void main(String[] args) {
	int number=0;
	int impar =0;
	int count = 0;
	boolean isImpar = false;
	boolean done = false;
		do {
		int x =  (int) Math.round(Math.random()*50+1);
		if (x % 2 != 0) {
			impar =x;
			System.out.println(impar);
			isImpar = true;
		
		}
		} while (isImpar != true);
		do {
	number = Integer.parseInt( JOptionPane.showInputDialog("Digite um número entre 1-50"));
	if (number > impar) { JOptionPane.showMessageDialog(null, "O número digitado é maior do que o sorteado."); count++; }
	else if (number < impar) { JOptionPane.showMessageDialog(null, "O número digitado é menor do que o sorteado."); count++;}
	else if (number == impar) { JOptionPane.showMessageDialog(null, "Parabéns você acertou o número sorteado. Você tentou "+count+" vezes até acertar."); done =true; }
	
		} while (done != true);
}
}
