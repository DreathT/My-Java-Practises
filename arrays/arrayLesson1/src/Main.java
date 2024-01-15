public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Abdullah";
        String ogrenci2 = "Sena";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);

        System.out.println("----------------------");

        String[] ogrenciler = new String[2];
        ogrenciler[0]="Abdullah";
        ogrenciler[1]="Sena";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("----------------------");

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}