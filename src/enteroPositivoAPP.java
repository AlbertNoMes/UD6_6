import javax.swing.JOptionPane;

public class enteroPositivoAPP {

	public static void main(String[] args) {

		// pedir numero por teclado
		String text = JOptionPane.showInputDialog("Escribe un numero");
		// BLOQUE POR SI EL CODIGO PETA, VA AL CATCH
		try {
			int number = Integer.parseInt(text);
			// controlar el num pedido es positivo
			if (number >= 0) {
				int digitos = numCifras(number);
				if (digitos == 1) {
					System.out.println("El n�mero " + text + " tiene " + digitos + " d�gito");
				} else {
					System.out.println("El n�mero " + text + " tiene " + digitos + " d�gitos");
				}

			} else {
				System.out.println("Posa n�mero positiu, cabr�");
			}
		} catch (Exception e) {
			System.out.println("No �s un n�mero v�lido");
			e.printStackTrace(); // PINTA EL ERROR
		}

	}

	public static int numCifras(int number) {
		String word = String.valueOf(number);
		int longitud = word.length();
		return longitud;
	}

}
