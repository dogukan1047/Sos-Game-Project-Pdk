package Pdk;


import java.util.Random;

public class Pc extends Player {
    Random rnd = new Random();

    Character[] harf = {'S', 'O'};

    public Pc() {
        super("Bilgisayar");
    }

    public int satirVeYaSutunSec(int boyut) {

        return rnd.nextInt((boyut - 1) + 1) + 1;
    }


    public char harfSec( Game game,Blok blok) {


/*        //YATAYDA KONTROL
       for (int i = 1; i <= game.getBoyut(); i++) {
            for (int j = 1; j <= game.getBoyut(); j++) {

               if(i<8){
                if ((game.getBloklar()[i][j].getHarf() == 'S') && game.getBloklar()[i][j + 1].getHarf() == '0') {
                    game.harfYaz(i, j + 2, 'S');
                    return 'S';
                }}
                if(j<8){
                if ((game.getBloklar()[i][j].getHarf() == 'S') && game.getBloklar()[i + 1][j].getHarf() == '0') {
                    game.harfYaz(i + 2, j, 'S');
                    return 'S';
                }}
                if(j<8){
                if ((game.getBloklar()[i][j].getHarf() == 'S') && game.getBloklar()[i + 1][j + 1].getHarf() == '0') {
                    game.harfYaz(i + 2, j, 'S');
                    return 'S';
                }}
                if((j<8 ) && i>=2){
                if ((game.getBloklar()[i][j].getHarf() == 'S') && game.getBloklar()[i - 1][j + 1].getHarf() == '0') {
                    if ((blok.getSutun() >= 2) || (blok.getSutun() >= 3))
                        game.harfYaz(i - 2, j + 2, 'S');
                    return 'S';}}

                }}*/


        /*int sonBlokSatir = sonBlok.getSatir();
        int sonBlokSutun = sonBlok.getSutun();


        if (sonBlok.getHarf() == 'S') {
            // sos icin üst dikey  kontrol
            if (sonBlokSatir - 2 >= 0) {
                if ( bloklar[sonBlokSatir - 1][sonBlokSutun].getHarf() == 'O') {
                    bloklar[sonBlokSatir - 2][sonBlokSutun].setHarf('S');

                    return 'S';
                }
            }
            // sos icin alt dikey kontrol
            if (sonBlokSatir + 2 < boyut) {
                if (bloklar[sonBlokSatir + 2][sonBlokSutun].getHarf() == 'S') {
                    bloklar[sonBlokSatir + 1][sonBlokSutun].setHarf('O');
                    return 'O';
                }
            }
            // sag yatay kontrol.
            if (sonBlokSutun + 2 < boyut) {
                if ( bloklar[sonBlokSatir][sonBlokSutun + 1].getHarf() == 'O') {

                    bloklar[sonBlokSatir][sonBlokSutun + 2].setHarf('S');
                    return  'S';
                }
            }
            // sol yatay kontrol
            if (sonBlokSutun - 2 >= 0) {
                if (bloklar[sonBlokSatir][sonBlokSutun - 2].getHarf() == 'S'  ) {

                    bloklar[sonBlokSatir][sonBlokSutun - 1].setHarf('O');
                    return 'O';
                }
            }
            // dikey ve yatay bitti capraz kontrollere gecildi
            // sag ust capraz
            if (sonBlokSatir - 2 >= 0 && sonBlokSutun + 2 < boyut) {
                if (bloklar[sonBlokSatir - 2][sonBlokSutun + 2].getHarf() == 'S') {

                    bloklar[sonBlokSatir - 1][sonBlokSutun + 1].setHarf('O');
                  return 'O';
                }
            }
            // sag alt capraz (buna bakılcak)
            //Sağ Alt Çapraz Kontrol
            if (sonBlokSatir + 2 < boyut && sonBlokSutun + 2 < boyut) {
                if (  bloklar[sonBlokSatir + 1][sonBlokSutun + 1].getHarf() == 'O') {

                    bloklar[sonBlokSatir + 2][sonBlokSutun + 2].setHarf('S');
                    return 'S';
                }
            }
            // sol üst capraz.
            if (sonBlokSatir - 2 >= 0 && sonBlokSutun - 2 >= 0) {
                if (bloklar[sonBlokSatir - 2][sonBlokSutun - 2].getHarf() == 'S' ) {
                    bloklar[sonBlokSatir - 1][sonBlokSutun - 1].setHarf('O');
                    return 'O';

                }
            }
            // sol alt capraz.
            if (sonBlokSatir + 2 < boyut && sonBlokSutun - 2 >= 0) {
                if ( bloklar[sonBlokSatir + 1][sonBlokSutun - 1].getHarf() == 'O') {
                    bloklar[sonBlokSatir + 2][sonBlokSutun - 2].setHarf('S');
                    return 'S';
                }
            }
            // capraz kosullarda bitti
        } else if (sonBlok.getHarf() == 'O') {
            // girilen deger 'O' oldugunda kontrol
            // dikey kontrol
            if (sonBlokSatir - 1 >= 0 && sonBlokSatir + 1 < boyut) {
                if (bloklar[sonBlokSatir + 1][sonBlokSutun].getHarf() == 'S') {
                    bloklar[sonBlokSatir - 1][sonBlokSutun].setHarf('S');
                    return 'S';
                }
            }

            //yatay kontrol
            if (sonBlokSutun - 1 >= 0 && sonBlokSutun + 1 < boyut) {
                if ( bloklar[sonBlokSatir][sonBlokSutun + 1].getHarf() == 'S') {
                    bloklar[sonBlokSatir][sonBlokSutun - 1].setHarf('S');
                    return 'S';
                }
            }

            // capraz kontrol 1
            if (sonBlokSatir - 1 >= 0 && sonBlokSutun + 1 < boyut && sonBlokSatir + 1 < boyut && sonBlokSutun - 1 >= 0) {
                if ( bloklar[sonBlokSatir + 1][sonBlokSutun - 1].getHarf() == 'S') {
                    bloklar[sonBlokSatir - 1][sonBlokSutun + 1].setHarf('S');
                    return 'S';

                }
            }
            // capraz kontrol 2
            if (sonBlokSatir + 1 < boyut && sonBlokSutun + 1 < boyut && sonBlokSatir - 1 <= 0 && sonBlokSutun - 1 <= 0) {
                if (bloklar[sonBlokSatir + 1][sonBlokSutun + 1].getHarf() == 'S' && bloklar[sonBlokSatir - 1][sonBlokSutun - 1].getHarf() == 'S') {
                    bloklar[sonBlokSatir + 1][sonBlokSutun + 1].setHarf('S');
                    return 'S';

                }
            }
        }*/
    /*  //YATAYDA KONTROL
       for (int i = 1; i <= game.getBoyut(); i++) {
            for (int j = 1; j <= game.getBoyut(); j++) {

               if(i<8){
                if ((game.getBloklar()[i][j].getHarf() == 'S') && game.getBloklar()[i][j + 1].getHarf() == '0') {
                    game.harfYaz(i, j + 2, 'S');
                    return harf['S'];
                }}
                if(j<8){
                if ((game.getBloklar()[i][j].getHarf() == 'S') && game.getBloklar()[i + 1][j].getHarf() == '0') {
                    game.harfYaz(i + 2, j, 'S');
                    return harf['S'];
                }}
                if(j<8){
                if ((game.getBloklar()[i][j].getHarf() == 'S') && game.getBloklar()[i + 1][j + 1].getHarf() == '0') {
                    game.harfYaz(i + 2, j, 'S');
                    return harf['S'];
                }}
                if((j<8 ) && i>=2){
                if ((game.getBloklar()[i][j].getHarf() == 'S') && game.getBloklar()[i - 1][j + 1].getHarf() == '0') {
                    if ((blok.getSutun() >= 2) || (blok.getSutun() >= 3))
                        game.harfYaz(i - 2, j + 2, 'S');
                    return harf['S'];}}

                }}
*/









        return harf[rnd.nextInt(2)];

    }

}
