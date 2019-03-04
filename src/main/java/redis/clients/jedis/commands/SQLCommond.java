package redis.clients.jedis.commands;

import java.util.List;

/**
 * @Title: SQLCommond
 * @ProjectName: jedis
 * @Description: TODO
 * @author: xiaobingxian
 * @date: 2019/3/1 17:49
 */
public interface SQLCommond {
    String createDatabase(String database);
    List<Object> executeSQL(String database, String sql);
}
