package objectpool;

import java.util.ArrayList;
import java.util.List;

import singleton.Connection;

public class DatabasePool {
    private static List<Connection> pool = new ArrayList<>();

    static {
        for (int i = 0; i < 100; i++) {
            Connection connection = new Connection("localhost", "root", "root");
            pool.add(connection);
        }
    }

    public static Connection getConnection() {
        if (pool.isEmpty()) {
            throw new RuntimeException("Koneksi habis");
        } else {
            Connection connection = pool.remove(0);
            return connection;
        }
    }

    public static void close(Connection connection) {
        pool.add(connection);
    }
}