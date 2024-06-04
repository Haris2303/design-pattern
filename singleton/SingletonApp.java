package singleton;

public class SingletonApp {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.save("0001");

        OrderDetailService orderDetailService = new OrderDetailService();
        orderDetailService.save("0001", "Tango");
        orderDetailService.save("0001", "Sampo");
        orderDetailService.save("0001", "Sambal");
    }

}
