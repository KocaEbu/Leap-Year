import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        int year;

        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen yil degerini giriniz : ");
        year= input.nextInt();

        if (year>0){

            if(year%4==0 && year%100==0 && year%400==0){

                System.out.println("Artik yildir.");

            }
            else {
                System.out.println("Artik yil degildir.");
            }

        }

        else {
            System.out.println("Yil hatalidir.");
        }


    }
}
