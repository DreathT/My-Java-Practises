import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer Abdullah = new Customer(1,"Abdullah","Can");
        Customer Sena = new Customer(2,"Sena","Akat");
        customers.add(Abdullah);
        customers.add(Sena);

        customers.remove(Abdullah);
        for(Customer customer : customers) {
            System.out.println(customer._firstName);
        }

    }
}