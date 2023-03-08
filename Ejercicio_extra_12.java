package java_ejercicios_extras_1al10;

public class Ejercicio_extra_12 {

    public static void main(String[] args) {

        v();

    }

   	public static void v() {
		String letra = "E";
		String num = "3";
		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {

				for (int k = 0; k < 10; k++) {

					if (i == 3 ) {
						String lll = Integer.toString(k);
						String ll = Integer.toString(j);
						String l = Integer.toString(i);
						l = letra;
						
						System.out.print(l + "-" + ll + "-" + lll);

						l = num;
						
						i = Integer.parseInt(l);
						
						System.out.println("");
						continue;
					}
					if (j == 3) {

						String ll = Integer.toString(j);

						ll = letra;

						System.out.print(i + "-" + ll + "-" + k);

						ll = num;

						j = Integer.parseInt(ll);

						System.out.println("");
						continue;
					}
					if (k == 3) {
						String lll = Integer.toString(k);

						lll = letra;
						System.out.print(i + "-" + j + "-" + lll);

						lll = num;

						k = Integer.parseInt(lll);
						System.out.println("");
						continue;
					}
					System.out.print(i + "-" + j + "-" + k);
					System.out.println("");
				}

			}

		}

	}
}