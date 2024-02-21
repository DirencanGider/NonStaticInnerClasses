import java.util.Scanner;

/*

Inner classlar yani dahili sınıflar, belli bir görev yapan classların başka bir class'ın içinde gruplanması ile ortaya çıkan yapılardır.
Yani bizim bir class'ımız var, onun için de bir class daha var, onun da için de bir class daha var ve onun için de de bir class var gibi.
Özetle; Class içinde class.

Inner Class Çeşitleri :

1. Statik Olmayan Inner Classlar
2. Statik Inner Classlar
3. Lokal (Yerel) Inner Classlar
4. Anonymous(Anonim) Inner Classlar

 */
public class Main {

    public static void main(String[] args) {

        /* Factorial factorial; /*  Bu şekilde yazdığımızda Factorial class'ını göremiyor. O yüzden factoriel objesini oluşturamadık.
                                 Factorial Matematik class'ının static olmayan inner class'ı. Bizim il olarak Matematik Class'ına
                                 ulaşmamız gerekiyor.*/  //  7

        /* Matematik.Factorial factorial = new Factorial(); /* Bu şekilde yazınca yine hata çıkardı. Matematik içerisinde
                                                                Factorial'i oluşturacağız dememiz lazım. Bir alt satıra bak. */  //  8

        /* Matematik.Factorial factorial = new Matematik.Factorial(); /* Böyle yazınca da yine hata çıkardı. Hatada öncelikle Matematik'i
                                                                      oluşturup sonrasında Factorial'i oluşturmamız gerektiğini
                                                                      söyledi. Bir alt satıra bak. */  //  9

        Matematik.Factorial factorial = new Matematik().new Factorial();  /* Önce Matematik, ardındanda içerisindeki Factorial'i
                                                                             oluşturduk. Doğrusu bu şekilde. */  //  10
        Matematik.Asal asal = new Matematik().new Asal();  //  11
        Matematik.Alan alan = new Matematik().new Alan();  //  12
        Matematik.Alan.DaireAlan daireAlan = new Matematik().new Alan().new DaireAlan();  //  19

        Scanner scanner = new Scanner(System.in);  //  13

        System.out.println("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();

        if (asal.asal_mi(sayi)) {
            System.out.println("Bu sayı Asaldır.");

        }
        else {
            System.out.println("Bu sayı Asal değildir.");
        }
        factorial.faktoriyel();  //  14
       /* alan.daire_alan(5);  //  15  /* Alan class'ı içerisine DaireAlan class'ını inner class olarak yazdığımız zaman
                                          java burada hata verdi. Yapamamız gereken ise Matematik class'ı içerisindeki
                                          Alan classı içerisindeki DaireAlan classı içerisinde obje üreteceğiz.
                                          Üst satırlarda üretme işlemini gerçekleştirdikten sonra aşağıda tekrar kontrolünü
                                          sağyalacağız. */  //  18


        /* Son olarak Matematik çerçeve class'ı içerisindeki Alan inner class'ı içerisine DaireAlan adında bir class
           yazacağız. Sonuçları gözlemleyeceğiz. */  //  16

        daireAlan.daire_alan(5);  //  20

    }

}
