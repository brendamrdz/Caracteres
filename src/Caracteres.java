import java.util.Scanner;

public class Caracteres {
    public static void main(String[] args) throws Exception {
       char caracter;
       System.out.println("Ingresa una palabra:");
		Scanner sc = new Scanner(System.in);
		String palabra = sc.nextLine();
		System.out.println("Ingresa el caracter a buscar:");
		caracter = (char) System.in.read();
		texto(palabra, caracter);
		
    }

 public static void texto(String palabra, char letra){
	 
        int temp = 0;
        for(int i = 0; i<=palabra.length()-1;i++){
            char porLetra = palabra.charAt(i);
            if(porLetra == letra){
                temp = temp + 1;
            }
        }
        System.out.println("El Caracter " + letra + " aparece " + temp);
    }
  
}
