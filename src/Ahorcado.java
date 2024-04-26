import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
       
        //Clase scanner que nos permite que el usuario escriba las letras
        Scanner scanner = new Scanner(System.in);

        //Declarar y asignar variables
        String palabraSecreta = "inteligencia";
        int intentos = 0;
        int intentosmax = 10;
        boolean isWord = false;

        //Arrays:
         char[] letrasAdivinadas = new char[palabraSecreta.length()];
        
         //estructura de control(bucle)
        for(int i=0; i<letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }
        
        //estructura de control(bucle)
        while(!isWord && intentos < intentosmax){

            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letras, por favor! ");

            //usamos la clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;

            //estructura de control(bucle)
            for(int i = 0; i < palabraSecreta.length(); i++){
                //estructura de control condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("¡Incorrecto! Te quedan " + (intentosmax-intentos) + " Intentos");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                isWord = true;
                System.out.println("Felicidades, has adivinado la palabra secreta!! " + palabraSecreta);
            }

        }
            if(!isWord){
            System.out.println("Lo sentimos  te has quedado sin intentos!! GAME OVER..");
        }

        scanner.close();
    }
}
