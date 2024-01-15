public class Main {
    public static void main(String[] args) {
        String msg = "Abdullah Sena'yı daha çok seviyor;).";
        String[] deger = {"a", "ı", "o", "u"};
        int i = 0, j;
        for (String harf : msg.split("")) {
            for (j = 0; j < deger.length; j++) {
                if (harf.equals(deger[j])) {
                    System.out.println(i + ". indexteki " + harf + " Kalın harftir");
                }
            }
            i++;
        }
    }
}