import java.util.Scanner;
public class ProyectoFinal{
   static Scanner leer=new Scanner(System.in);
  
    public static void main(String[] args) {
      int opcionPrincipal=0;
   
        do{ 
       limpiarPantalla();
       menu_principal();
       System.out.println("Digite la opcion:");
       opcionPrincipal=leer.nextInt();
       switch (opcionPrincipal) {
        case 1:
            System.out.println("-----Iniciar sesion------");
            pausa();
            break;
        case 2:
         System.out.println("--------Registrarse-------");
         pausa();
         break;    
       }
        }while(opcionPrincipal>=1 && opcionPrincipal<3);
        System.out.println("Gracias por utilixzar el software");
    }
    public static void menu_principal(){
        System.out.println("1.Iniciar secion");
        System.out.println("2.Registarse");
        System.out.println("3.salir");
    }
  
    public static void menu_crud(){
      int op=0;
        System.out.println("1.Ingresar nuevo gasto");
        System.out.println("2.Introducir nuevo ingreso");
        System.out.println("3.Mostrar gastos");
        System.out.println("4.Mostrar ingresos");
        System.out.println("5.Ingresar egresos");
        System.out.println("6.Mostrar el saldo de la cuenta  ");
        System.out.println("7.Regresar al menu principal");
        do{
          switch (op ) {
          case 1:
            System.out.println("-----Ingresar nuevo gasto-----");
            Double  n_Gasto=leer.nextDouble();
            break;
          case 2:
              System.out.println("-----Introducir nuevo Ingreso-----");
              Double ingreso=leer.nextDouble();
              break;
          case 3:
            System.out.println("-----Mostrar gastos----");
            System.out.println();
          case 4:
            System.out.println("------Ingresar ingresos-------");
            Double egresos=leer.nextDouble();
          case 5:
            System.out.println("");
            default:
              break;
          }

        }while(op>=1 && op<7);
    }
    public static void limpiarPantalla(){
      try{
        ProcessBuilder pb=new ProcessBuilder("cmd","/c","cls");
        Process startProcess = pb.inheritIO().start();
        startProcess.waitFor();
      }catch(Exception e){
        System.out.println(e);
      }
    }
    public static void pausa() {
        leer.nextLine();
        System.out.println("\t\nPresione enter para continuar...");
        leer.nextLine();
    }
        
    }
