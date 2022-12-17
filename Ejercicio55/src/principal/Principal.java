package principal;


public class Principal 
{
	public static void main (String [] args ) 
 {
		System.out.println("For help use : --help or -h");
		int numero;
			if (args[0].equals("--help") || args[0].equals("-h"))
				System.out.println("Help:"+"/n"+"For help: --help or -h"+"/n"+"To chose a random number add your maximum random number");
		
			
			else { 
					int n= Integer.parseInt(args[0]);
					numero = (int) (Math.random() * n) + 1;
					System.out.println("numero aleatorio: " + numero);
 }	
}
}