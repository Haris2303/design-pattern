package singleton;

import objectpool.DatabasePool;

public class OrderDetailService {

    public void save(String orderId, String product) {
        Connection connection = DatabasePool.getConnection();
        DatabaseHelper.getConnection().sql("INSERT INTO ORDER_DETAILS ....");
        DatabasePool.close(connection);
    }

}