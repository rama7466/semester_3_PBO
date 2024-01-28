public class tugas2 {
    public static void main(String[] args){
        mobil mobil1 = new mobil();
        mobil mobil2 = new mobil();
        mobil mobil3 = new mobil();
        mobil mobil4 = new mobil();

        mobil1.obyek = "mobil1 ";
        mobil1.a = "Toyota ";
        mobil2.a = "Daihatsu ";
        mobil3.a = "Suzuki ";
        mobil4.a = "Honda ";

        mobil2.obyek = "mobil2 ";
        mobil1.b = "Biru ";
        mobil2.b = "Hitam ";
        mobil3.b = "Silver ";
        mobil4.b = "Merah ";

        mobil3.obyek = "mobil3 ";
        mobil1.c = "Minibus ";
        mobil2.c = "Pick Up ";
        mobil3.c = "SUV ";
        mobil4.c = "Sedan ";

        mobil4.obyek = "mobil4 ";
        mobil1.d = 2000;
        mobil2.d = 1500;
        mobil3.d = 1800;
        mobil4.d = 1300;

        
        mobil1.e = 7;
        mobil2.e = 2;
        mobil3.e = 5;
        mobil4.e = 5;
        
        mobil1.cetakMobil();
        mobil2.cetakMobil();
        mobil3.cetakMobil();
        mobil4.cetakMobil();

    }
}