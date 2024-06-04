package singleton;

import java.util.List;

public class Connection {

    public Connection(String host, String username, String password) {
    }

    public String sql(String query) {
        return query;
    }

    public String sql(String query, Object... data) {
        return query;
    }

    public List<Object[]> select(String sql) {
        return null;
    }
}
