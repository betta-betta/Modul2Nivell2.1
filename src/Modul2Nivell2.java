import javax.swing.JOptionPane;

public class Modul2Nivell2 {

	public static void main(String[] args) {
	
		
		String num=JOptionPane.showInputDialog("Introdueix un n�mero");
		int numero = Integer.parseInt(num);
		for (int i=1;i<=numero;i++) {
			System.out.println("");
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				
			}
		}
		
		
	}

}
