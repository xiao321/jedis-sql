package redis.clients.jedis.commands;

import java.util.List;

/**
 * @Title: SQLCommands
 * @ProjectName: jedis
 * @Description: TODO
 * @author: xiaobingxian
 * @date: 2019/3/1 17:27
 */
public interface BinarySQLCommands {
    Long createDatabase(byte[] database);
    List<Object> executeSQL(byte[] database, byte[] sql);
}
