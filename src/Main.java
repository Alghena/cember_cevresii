import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("yarıçapı gir");
        int yaricap=scan.nextInt();
        System.out.println("cemberin cevresi:" + (2*Math.PI*yaricap));


        }

}