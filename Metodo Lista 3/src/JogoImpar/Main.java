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
	number = Integer.parseInt( JOptionPane.showInputDialog("Digite um n�mero entre 1-50"));
	if (number > impar) { JOptionPane.showMessageDialog(null, "O n�mero digitado � maior do que o sorteado."); count++; }
	else if (number < impar) { JOptionPane.showMessageDialog(null, "O n�mero digitado � menor do que o sorteado."); count++;}
	else if (number == impar) { JOptionPane.showMessageDialog(null, "Parab�ns voc� acertou o n�mero sorteado. Voc� tentou "+count+" vezes at� acertar."); done =true; }
	
		} while (done != true);
}
}
