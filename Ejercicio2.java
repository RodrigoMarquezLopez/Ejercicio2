public class Ejercicio2
{
    //Metodo que realizara la operacion tiene un String como parametro
    public int Suma(String numero){
        // Declaramos el valor de la variable que guardara la suma de los digitos
        int suma=0;
        //Ciclo que se ejecutara mientras "numero" tenga mas de un digito
        while(numero.length()>1){
          //La variable suma resetea a a cero cada vez que se realiza la suma de los digitos de los cuales se compone numero
          suma=0;
          //Ciclo que se encarga de sumar los digitos que conforman a "numero"  
          for(int i=0;i<numero.length();i++){
            suma=suma+(Integer.parseInt(String.valueOf(numero.charAt(i))));
          }
          //Reasignacion de numero al nuevo valor, el cual contiene mas de un digito
          numero=(String.valueOf(suma));
         } 
        return suma;
     } 
}
