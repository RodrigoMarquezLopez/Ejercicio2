public class Ejercicio2
{
    public int Suma(String numero){
        int suma=0;
        while(numero.length()>1){
          suma=0;
            for(int i=0;i<numero.length();i++){
            suma=suma+(Integer.parseInt(String.valueOf(numero.charAt(i))));
          }
          numero=(String.valueOf(suma));
         } 
        return suma;
     } 
}
