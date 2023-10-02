package formulas;

import javax.swing.JOptionPane;

public class Operaciones {
	private int r = 0;
	private int o2 = 0, o = 0;

	public void SUMA() {
		JOptionPane.showMessageDialog(null, "SUMA", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
		String suma1 = JOptionPane.showInputDialog(null, "Ingrese el primer numero:", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
		if (suma1 != null) {
			suma1 = (String) suma1;
			if (!suma1.trim().equals("")) {
				o = Integer.parseInt(suma1);
				System.out.println(o + ": s1");
				String suma2 = JOptionPane.showInputDialog(null, "Ingrese el segundo numero:", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
				if (suma2 != null) {
					suma2 = (String) suma2;
					if (!suma2.trim().equals("")) {
						o2 = Integer.parseInt(suma2);
						System.out.println(o2 + ": s2");
					} else {
					}
				} else {
				}
			} else {
			}
		} else {
		}
		int s1p = o;
		System.out.println(s1p + ": s1p");

		int s2p = o2;
		System.out.println(s2p + ": s2p");
		if (o == 0 && o2 == 0) {
		} else {
			r = o + o2;
			JOptionPane.showMessageDialog(null, "el resultado es: " + r, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
		}
		o = 0;
		o2 = 0;
	}

	public int RESTA(int n1, int n2) {
		r = n1 - n2;
		JOptionPane.showMessageDialog(null, "el resultado es: " + r, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
		return r;
	}
	public int MULT(int n1, int n2) {
		r = n1 * n2;
		JOptionPane.showMessageDialog(null, "el resultado es: " + r, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
		return r;
	}
	public double DIV(int n1, int n2) {
		r = n1 / n2;
		JOptionPane.showMessageDialog(null, "el resultado es: " + r, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
		return r;
	}
}
