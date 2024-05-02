package source;
import java.util.Scanner;
public class ProyectoFinal{
   static Scanner leer=new Scanner(System.in);
  
    public static void main(String[] args) {
      int opcionPrincipal=0;
      Scanner scanner = new Scanner(System.in);
      int num_Usuarios = 1;
      String[][] usuariosContrasenas = new String[num_Usuarios][2]; 


      
               do{ 
                 limpiarPantalla();
                  menu_principal();

                  System.out.println("Digite la opcion:");
                  opcionPrincipal=leer.nextInt();
                         switch (opcionPrincipal) {
                           case 1:
                              System.out.println("-----registrarse------");
                              

                              
               for (int i = 0; i < num_Usuarios; i++) {
                
                 System.out.println("Ingrese el nombre de usuario y la contraseña:");
                 System.out.print("Usuario: ");
                 usuariosContrasenas[i][0] = scanner.nextLine(); 
                 System.out.print("Contraseña: ");
                    usuariosContrasenas[i][1] = scanner.nextLine();  System.out.println("Por favor, ingrese sus datos:");
              



                    break;    
                }

                
                          case 2:
                              System.out.println("--------Iniciar sesion-------");
                              System.out.println("\nIniciar sesión:");
                              System.out.print("Usuario: ");
                              String usuarioIngresado = scanner.nextLine();
                              System.out.print("Contraseña: ");
                              String contrasenaIngresada = scanner.nextLine();

               boolean loginExitoso = false;
               for (int i = 0; i < num_Usuarios; i++) {
                     if (usuariosContrasenas[i][0].equals(usuarioIngresado) && usuariosContrasenas[i][1].equals(contrasenaIngresada)) {
                     loginExitoso = true;
                      break;
                }      
                      }

             if (loginExitoso) {
                System.out.println("Inicio de sesión exitoso.");
              } else {
               System.out.println("Usuario o contraseña incorrectos. Por favor, inténtelo de nuevo.");

              }
               pausa();
                break;
                        

         }
                }while(opcionPrincipal>=1 && opcionPrincipal<3);
                 System.out.println("Gracias por utilizar el software");
    }
    public static void menu_principal(){
        System.out.println("1.Registrarse");
        System.out.println("2.Iniciar sesion");
        System.out.println("3.salir");
       
    }
  
    public static void menu_crud(){
      int op=0;
        System.out.println("1.Registrar  gasto");
        System.out.println("2.Historial");
        System.out.println("3.Mostrar el saldo de la cuenta  ");
        System.out.println("7.Regresar al menu principal");
        do{
          switch (op ) {

          case 1:
            System.out.println("-----Registrar gasto-----");
            final int n_Gasto = 0; 
            String[][] gastos = new String[n_Gasto][3]; 
            for (int i = 0; i < n_Gasto; i++) {
                System.out.println( (i + 1) +"\nIngrese los detalles del gasto: " );
                System.out.print("Descripción del gasto: ");
                gastos[i][0] = leer.nextLine();

                System.out.print("Fecha : ");//dia/mes/año
                gastos[i][1] = leer.nextLine();
                System.out.print("Cantidad : ");
                gastos[i][2] = leer.nextLine();
            }
    
            
            break;
          case 2:
              System.out.println("----Historial-----");

              String Historial;
              System.out.println("1.ingresos");
              
              System.out.println("2.egresos");
              System.out.println("3.total");
              System.out.println("4.ahorro");
                   switch (op) {
                    case 1:
                      
                      break;
                   
                    default:
                      break;
                   }

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
    
  