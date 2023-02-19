import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*int number = 1;
      do{
          System.out.println("number inainte de incrementare: " + number);
          number ++;
          System.out.println("number dupa incrementare: " + number);
      }while(number < 10);*/
        int number = 4;
        switch(number){
            case 1 :
                System.out.println("in acest caz, number este 1");
                break;
            case 2:
                System.out.println("in aceste caz, number este 2");
                break;
            default:
                System.out.println("diferit");
                break;
        }

    }
}