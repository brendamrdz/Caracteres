public class Caracteres {
    public static void main(String[] args) throws Exception {
       Caracteres caracteres = new Caracteres();
       caracteres.texto("jamaica",'a');

    }

 public void texto(String palabra, char letra){
        int temp = 0;
        for(int i = 0; i<=palabra.length()-1;i++){
            char porLetra = palabra.charAt(i);
            if(porLetra == 'a'){
                temp = temp + 1;
            }
        }
        System.out.println("El Caracter " + letra + " aparece " + temp);
    }
  
}
