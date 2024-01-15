public class Main {

    public static void main(String[] args) {
        Product product = new Product();

        product.set_id(1);
        product.set_name("Laptop");
        product.set_description("MSI Laptop");
        product.set_price(30000);
        product.set_stockAmount(5);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.get_code());

    }

}
