## 简介
jedis-sql 在jedis基础上修改完成。
jedis source code:
https://github.com/xetorthio/jedis

## 使用说明
GenericObjectPoolConfig genericObjectPoolConfig = new GenericObjectPoolConfig();
genericObjectPoolConfig.setMaxIdle(1);
genericObjectPoolConfig.setMinIdle(1);
genericObjectPoolConfig.setMaxWaitMillis(-1);
JedisPool jedisPool = new JedisPool(genericObjectPoolConfig, "192.168.199.94", 6379);
Jedis jedis = jedisPool.getResource();

//jedis.createDatabase("asteria");
//jedis.executeSQL("asteria", "CREATE TABLE foo(A INT, B TEXT);");
//jedis.executeSQL("asteria", "INSERT INTO foo VALUES(3, 'bar');");
List<Object> list = jedis.executeSQL("asteria", "select * from foo");
System.out.println(list.size());
list.forEach(value -> {
    List<Object> values = (List<Object>) value;
    values.forEach(v -> {
        if(v instanceof byte[]) {
            System.out.println(new String((byte[])v));
        }
    });
});