package singleton;

import objectpool.DatabasePool;

public class OrderService {

    public void save(String orderId) {
        Connection connection = DatabasePool.getConnection();
        connection.sql("INSERT INTO ORDER ...");
        DatabasePool.close(connection);
    }

}
