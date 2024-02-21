import java.util.Scanner;

public class Matematik { /* Biz bu class'ı çerçeve class olarak kullanacağız ve içerisinde de inner classlarımızı
                            oluşturmaya çalışacağız. */  //  1

    private double PI = Math.PI;


    public class Factorial { // Normal bir class oluştururmuş gibi Matematik class'ı içerisinde ilk classımızı oluşturduk.  //  2

        public void faktoriyel() {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Bir sayı giriniz: ");

            int sayi = scanner.nextInt();
            int fakt = 1;

            for (int i = 2 ; i <= sayi ; i++) {

                fakt *= i;

            }
            System.out.println("Faktoriyel : " + fakt);

        }

    }

    public class Asal { // Matematik class'ı içerisinde 2. classımızı da oluşturduk.  //  3

        public boolean asal_mi(int sayi) {

            int i = 2;

            while (i < sayi) {

                if (sayi % i == 0) {
                    return false;
                }
                i++;

            }
            return true;

        }

    }

    public class Alan { // Matematik class'ı içerisinde 3. classımızı da oluşturduk. Bu class önemli. PI sayısını kullanacağız.  //  4

        public class DaireAlan {  /*  Bunu en son ekledik. Alan class'ı içerisine bu class'ı inner class olarak dahil ettik
                                      ve Alan class'ı içerisindekileri bu class içerisine aldık. */  //  17
            public void daire_alan(int yaricap) {

            /* Dairenin Alanı : pi * r^2 ---> Bizim burada PI sayısını kullanmamız gerekiyor. PI sayısını Math classından
               Math.PI şeklinde değil de direkt en üstte Matematik class'ımızda (çerçeve classımızda) oluşturmuş olduğumuz ve
               Math.PI'ye eşitlemiş olduğumuz PI değişkenini kullanacağız.

               Normalde PI değişkenimizin erişim belirleyicisi (access modifier) private. Direkt olarak erişmemiz mümkün değil.
               Fakat Alan class'ımız Matematik class'ının dahili sınıfı (inner class'ı) olduğu için rahatlıkla erişebiliyoruz. */  //  5

                double alan = PI * (yaricap * yaricap);

                System.out.println("Dairenin Alanı: " + alan);


            }

        }

    }

    //  Şimdi Main.java class'ı içerisinde bu classlara erişmeye çalışalım.  //  6


}
