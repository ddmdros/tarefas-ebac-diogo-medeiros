public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.addAddress("Street 1");
        customer1.setClientId(1);

        /**
         * @author ddmdros
         */
        System.out.println(customer1.getAddress());
        System.out.println(customer1.getClientId());
        customer1.showAddress();



        System.out.println(customer1.showCustomerName());

        System.out.println(customer1.getTotalAmount());





    }



}
