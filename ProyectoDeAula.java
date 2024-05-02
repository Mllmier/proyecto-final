import java.util.Scanner;

public class ProyectoDeAula {
  static Scanner leer = new Scanner(System.in);
  static final int elementos = 6;
  static gastos[] Gastos = new gastos[elementos];
  static gastos Gasto = new gastos();
  static int ne = 1;// numero de elementos

  public static void main(String[] args) {
    int op = 0;
    do {
      limpiarPantalla();
      menu_Principal();
      System.out.println("Type a number :");
      op = leer.nextInt();
      gastos Gastos = new gastos();
      switch (op) {
        case 1:
          int opExpense = 0; // OPCION GAS

          // menu servicios

          System.out.println("-----expense management------");
          System.out.println("----------------------------");
          System.out.println("           MENU            ");
          System.out.println("----------------------------");
          System.out.println();
          System.out.println("1.Arriendo");
          System.out.println("2.Servicios");
          System.out.println("3.Transporte ");
          System.out.println("4.Comida");
          System.out.println("5. Gastos adicionales");
          System.out.println();
          System.out.println("Digite una opcion:");
          opExpense = leer.nextInt();

          // ingresar el arriendo
          switch (opExpense) {
            case 1:
              System.out.println("Ingrese Valor Del Arriendo");

              break;
            case 2:
              int op_servicios = 0;
              do {
                System.out.println();
                System.out.println("-------Servicios-------");
                System.out.println("1. Luz");
                System.out.println("2. agua");
                System.out.println("3. Gas");
                System.out.println("4. Internet");
                System.out.println("5. volver al menu de gestion de gastos");
                System.out.println();
                System.out.println("Enter option");
                op_servicios = leer.nextInt();

                switch (op_servicios) {

                  case 1:

                    System.out.println("Enter the price  to pay ");
                    Gastos.gastos_en_luz = leer.nextDouble();// METODOS PARA GUARDAR LOS GASTOS PERO UNO POR UNO
                    break;

                  case 2:
                    System.out.println("Enter the price to pay");
                    Gastos.gastos_en_agua = leer.nextDouble();
                    break;

                  case 3:
                    System.out.println("Enter the price to pay");
                    Gastos.gastos_en_gas = leer.nextDouble();
                    break;

                  case 4:

                    System.out.println("Enter the price to pay");
                    Gastos.gastos_en_internet = leer.nextDouble();
                    break;

                }
              } while (op_servicios >= 1 && op_servicios < 5);

          }
          break;
        case 2:
          System.out.println("--------People Management-------");
          menu_crud();
          System.out.println("Digite una opcion");
          int opcion_crud=0;
          opcion_crud = leer.nextInt();
          pausa();
          do {
            switch (opcion_crud) {
              case 1:
                System.out.println("");
                break;
            
            }
          } while (opcion_crud>=1 && opcion_crud<=5 );
          break;
        case 3:
          System.out.println("------Record-------");
          pausa();
          break;
      }
    } while (op >= 1 && op < 4);
    System.out.println("Thank you for using our software");

  }

  // MENU CONCEPTOS

  public static void menu_Principal() {
    System.out.println("1.Manage Concepts");
    System.out.println("2.Manage people");
    System.out.println("3.Record");
    System.out.println("4.Exit");
  }

  // menu
  public static void menu_crud() {
    System.out.println("1.Register");
    System.out.println("2.To list");//AGREGAR EN EL CONCEPTO DE GASTOS 
    System.out.println("3.Modify");
    System.out.println("4.Eliminate");
    System.out.println("5.Return to main menu");
  }

  // limpiar pantalla
  public static void limpiarPantalla() {
    try {
      ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
      Process staProcess = pb.inheritIO().start();
      staProcess.waitFor();

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void pausa() {
    leer.nextLine();
    System.out.println("\t\nPress Enter to continue");
    leer.nextLine();
  }
}