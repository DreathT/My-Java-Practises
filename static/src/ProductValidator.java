public class ProductValidator {

    static {
        System.out.println("Static yapici Blok calisti");
    }

    public ProductValidator(){
        System.out.println("Yapici Blok calisti");
    }
    public static boolean isValid(Product product) {
        if(product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}
