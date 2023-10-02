package calculadora;

import javax.swing.JOptionPane;

import formulas.Operaciones;

public class Principal {

	public static void main(String[] args) {
		Operaciones op = new Operaciones();
		int r, o2 = 0, o = 0, p = 0, b = 0;
		String suma = "+";
		String resta = "-";
		String mult = "*";
		String div = "/";
		String salir = "SALIR";
		String si = "si";
		String no = "no";
		do {
			String simbolo = JOptionPane.showInputDialog(null, "+,-,*,/,SALIR", "Calculadora", JOptionPane.YES_NO_OPTION);
			if (simbolo != null) {
				simbolo = (String) simbolo;
				if (!simbolo.trim().equals("")) {
					if (simbolo.equals(suma)) {
						p = 1;
						b = 1;
					} else if (simbolo.equals(resta)) {
						p = 2;
						b = 2;
					} else if (simbolo.equals(mult)) {
						p = 3;
						b = 3;
					} else if (simbolo.equals(div)) {
						p = 4;
						b = 4;
					} else if (simbolo.equals(salir)) {
						String sino = JOptionPane.showInputDialog(null, "Estas seguro si/no ", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
						if (sino.equals(si)) {
							p = 5;
							b = 5;
						} else if (sino.equals(no)) {
							p = 0;
						}
					} else {
						JOptionPane.showMessageDialog(null, "No coloco el dato correcto o no ingreso ninguno, vuelve a ingresarlo: ", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
						String m = JOptionPane.showInputDialog(null, "QUiere volver a intentarlo? si/no", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
						if (m.equals(si)) {
							p = 0;
						} else if (m.equals(no)) {
							p = 5;
						} else {
							JOptionPane.showMessageDialog(null, "No ingreso el dato correcto o no ingreso ninguno!", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
							p = 5;
						}
					}
				} else {
					p = 6;
				}
			} else {
				p = 5;
			}

			int p1 = p;
			switch (p1) {
				case 1 :
					op.SUMA();
					p = 5;
					break;
				case 2 :
					JOptionPane.showMessageDialog(null, "RESTA", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
					String resta1 = JOptionPane.showInputDialog(null, "Ingrese el primer numero:", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
					if (resta1 != null) {
						resta1 = (String) resta1;
						if (!resta1.trim().equals("")) {
							o = Integer.parseInt(resta1);
							String resta2 = JOptionPane.showInputDialog(null, "Ingrese el segundo numero:", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
							if (resta2 != null) {
								resta2 = (String) resta2;
								if (!resta2.trim().equals("")) {
									o2 = Integer.parseInt(resta2);
								} else {
									p = 6;
								}
							} else {
								p = 5;
							}
						} else {
							p = 6;
						}
					} else {
						p = 5;
					}

					int r1p = o;
					System.out.println(r1p + ": s1p");

					int r2p = o2;
					System.out.println(r2p + ": s2p");
					if (o == 0 && o2 == 0) {
						p = 5;
					} else {
						op.RESTA(r1p, r2p);
					}
					o = 0;
					o2 = 0;
					p = 5;
					break;
				case 3 :
					JOptionPane.showMessageDialog(null, "MULTIPLICACION", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
					String mult1 = JOptionPane.showInputDialog(null, "Ingrese el primer numero:", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
					int m1 = Integer.parseInt(mult1);
					String mult2 = JOptionPane.showInputDialog(null, "Ingrese el segundo numero:", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
					int m2 = Integer.parseInt(mult2);
					op.MULT(m1, m2);
					p = 5;
					break;
				case 4 :
					JOptionPane.showMessageDialog(null, "DIVICION", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
					String div1 = JOptionPane.showInputDialog(null, "Ingrese el primer numero:", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
					int d1 = Integer.parseInt(div1);
					String div2 = JOptionPane.showInputDialog(null, "Ingrese el segundo numero:", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
					int d2 = Integer.parseInt(div2);
					op.DIV(d1, d2);
					p = 5;
					break;
				case 5 :
					b = 5;
					break;
				case 6 :
					JOptionPane.showMessageDialog(null, "No coloco el dato correcto vuelve a ingresarlo: ", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
					b = 0;
					break;
				default :
					b = 0;
			}
		} while (b < 5 && b >= 0);
		{
			JOptionPane.showMessageDialog(null, "ADIOS :)", "Calculadora", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
