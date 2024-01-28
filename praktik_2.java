public class praktik_2 {
    public static void main(String args[]){
        int [] numbers = {1,4,6,9,13,16};
        int sumBilanganGanjil=0,sumBilnaganGenap=0;
        for(int i=0; i<6; i++){
            if(numbers[i]%2 == 0){
                sumBilnaganGenap=sumBilnaganGenap+numbers[i];
            }
            else{
                sumBilanganGanjil=sumBilanganGanjil+numbers[i];
            }
        }
        System.out.println("\nJumlah Bilangan Ganjil: " + sumBilanganGanjil);
        System.out.println("\nJumlah Bilangan Genap: " + sumBilnaganGenap);
    }
}

