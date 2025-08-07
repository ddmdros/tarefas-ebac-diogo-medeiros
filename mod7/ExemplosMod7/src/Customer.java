public class Customer {

    private int clientId;
    private String name;
    private String address;


    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addAddress(String address){
        setAddress(address);
    }

    public void showAddress(){
        System.out.println(this.address);
    }

    public String showCustomerName(){
        return "Diogo";
    }


    /**
     * @deprecated
     * Método de teste apenas para explicar o fucnionamento de int
     * @return numero arbitrário
     *
     */
    public int getTotalAmount(){
        return 20;
    }

    public void teste(){

    }
}
