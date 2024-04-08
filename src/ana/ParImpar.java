
public class ParImpar {
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		int i = 0;
		int pares = 0;
		int impares = 0;
		int nuevo;
		Result result = getResult(i, pares, impares);
		System.out.println("Has introducido " + result.i() +" números de los cuales hay " + result.pares() + " son pares y  "+ result.impares() +" son impares");
	}

	public static Result getResult(int i, int pares, int impares) {
		int nuevo;
		while(i <3) {
		nuevo =(int)(Math.random()*100); //generación de número aleatorio
				if(nuevo % 2 == 0) {
					pares++;
					System.out.println("El número "+ nuevo +" es par");
				}
				else {
					impares++;
					System.out.println("El número "+ nuevo +" es impar");
				}
				i++;
			}
		Result result = new Result(i, pares, impares);
		return result;
	}

	private record Result(int i, int pares, int impares) {
	}
}




