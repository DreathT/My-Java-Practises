public class Main {
    public static void main(String[] args) {
        int sayi = 25;
        int sonuc = 0;
        for(int i=2;i<=(sayi/2);i++){
            if(sayi % i == 0){
                sonuc = 1;
                break;
            }
        }
        if(sonuc==0){
            System.out.println("Sayi asaldir");
        }
        else{
            System.out.println("Sayi asal degildir");
        }
    }
}
