package Ejercicios;
import java.util.Scanner;

public class BancoOnline {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean encendido = true;
        double saldo= 0.00;
        double cantidadinversion;
        double beneficio;
        System.out.println("BIENVENIDO AL BANCO ONLINE, PORFAVOR SELECCIONE UNA OPCIÓN:");
      while(encendido) {
          try {
          //Menu principal inicial
          System.out.println("1. CONSULTE SU SALDO");
          System.out.println("2. INGRESAR DINERO");
          System.out.println("3. RETIRAR DINERO");
          System.out.println("4. INVERSIONES");
          System.out.println("5. SALIR");
          int eleccion = scanner.nextInt();
          switch (eleccion) {
              case 1:
                  System.out.println("Su saldo es de: " + saldo+"€");
                  break;
              case 2:
                  System.out.println("Porfavor introduca la cantidad que desea ingresar:");
                  double ingreso = scanner.nextDouble();
                  if(ingreso <= 0.50) {
                      System.out.println("No se pueden ingresar cantidades inferiores a 0,50€");
                  }
                  else {
                      saldo+=ingreso;
                      System.out.println("Dinero ingresado correctamente, el balance de su cuenta es de: "+saldo+"€");
                  }
                  break;
              case 3:
                  System.out.println("Porfavor introduca la cantidad que desea retirar:");
                  double retiro = scanner.nextDouble();
                  if(retiro > saldo) {
                      System.out.println("No se puede retirar una cantidad superior a la de su balance");
                  }
                  else {
                      saldo-=retiro;
                      System.out.println("Dinero retirado correctamente, el balance de su cuenta es de: "+saldo+"€");
                  }
                  break;
              case 4:
                  System.out.println("1. Para corto plazo");
                  System.out.println("2. Para largo plazo");
                  int eleccion2 = scanner.nextInt();
                  if(eleccion2 == 1) {
                      System.out.println("Las inversiones a corto plazo duran 1 año y obtienen un 10% de rentabilidad, ingrese la cantidad a invertir:");
                      cantidadinversion = scanner.nextDouble();
                      if(cantidadinversion > saldo) {
                          System.out.println("No se puede invertir menos dinero del que tienes en el saldo");
                      } else {
                          beneficio = cantidadinversion * 0.1;
                          System.out.println("El beneficio de esta operación a corto plazo sería de: "+beneficio+"€, ¿Quiere realizar la inversión? 1.Sí 2.No");
                          int eleccion4 = scanner.nextInt();
                          if(eleccion4 == 1) {
                              saldo+= beneficio;
                              System.out.println("Su saldo tras la inversión ha ascendido a: "+saldo+"€");
                          } else if (eleccion4== 2) {
                              System.out.println("Volviendo al menú principal, su saldo actual es de: "+saldo+"€");
                          } else{
                              System.out.println("Has elegido una opción incorrecta, volviendo al menú principal...");
                          }
                      }
                  } else if(eleccion2 == 2) {
                      System.out.println("Las inversiones a largo plazo duran 10 años y obtienen un 25% de rentabilidad, ingrese la cantidad a invertir:");
                      cantidadinversion = scanner.nextDouble();
                      if(cantidadinversion > saldo) {
                          System.out.println("No se puede invertir menos dinero del que tienes en el saldo");
                      } else {
                          beneficio = cantidadinversion * 0.25;
                          System.out.println("El beneficio de esta operación a largo plazo sería de: "+beneficio+"€, ¿Quiere realizar la inversión? 1.Sí 2.No");
                          int eleccion3 = scanner.nextInt();
                          if(eleccion3 == 1) {
                              saldo+= beneficio;
                              System.out.println("Su saldo tras la inversión ha ascendido a: "+saldo+"€");
                          } else if (eleccion3== 2) {
                              System.out.println("Volviendo al menú principal, su saldo actual es de: "+saldo+"€");
                          } else{
                              System.out.println("Has elegido una opción incorrecta, volviendo al menú principal...");
                          }
                      }

                  } else {
                      System.out.println("Has elegido una opción incorrecta, volviendo al menú principal...");
                  }
                  break;
              case 5:
                  encendido = false;
                  break;
              default:
                  System.out.println("Porfavor elige una opción correcta");

       }
          } catch (Exception e) {
              System.out.println("¡ERROR! Debes introducir un número, no letras");
              scanner.next();
          }
    }
        System.out.println("Gracias por confiar en nuestro banco online, su saldo es de: "+saldo+"€");
        scanner.close();
    }

}
