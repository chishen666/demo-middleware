package com.carrx.demo.redis;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Redis工具类
 * 
 * @author Carl
 * @date 2019-12-27
 */
@Component
public class RedisUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(RedisUtils.class);

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 普通缓存放入
     *
     * @param key
     *            键
     * @param value
     *            值
     * @param <V>
     *            类类型
     * @return true：成功；false：失败
     */
    public <V> boolean setValue(String key, V value) {
        try {
            redisTemplate.opsForValue().set(key, value);
            return true;
        } catch (Exception e) {
            LOGGER.info("Redis setValue exception! e：{}", e);
            return false;
        }
    }

    /**
     * 普通缓存放入并设置失效时间
     *
     * @param key
     *            键
     * @param value
     *            值
     * @param time
     *            失效时间（秒）
     * @param <V>
     *            类类型
     * @return true：成功；false：失败
     */
    public <V> boolean setValue(String key, V value, long time) {
        try {
            if (time > 0) {
                redisTemplate.opsForValue().set(key, value, time, TimeUnit.SECONDS);
                return true;
            } else {
                return this.setValue(key, value);
            }
        } catch (Exception e) {
            LOGGER.info("Redis setValue exception! e：{}", e);
            return false;
        }
    }

    /**
     * 普通缓存获取
     * 
     * @param key
     *            键
     * @param <V>
     *            类类型
     * @return 值
     */
    public <V> V getValue(String key) {
        return key == null ? null : (V)redisTemplate.opsForValue().get(key);
    }

    /**
     * 指定缓存失效时间
     * 
     * @param key
     *            键
     * @param time
     *            失效时间（秒）
     * @return true：成功；false：失败
     */
    public boolean expire(String key, long time) {
        try {
            if (time > 0) {
                return redisTemplate.expire(key, time, TimeUnit.SECONDS);
            }
            return false;
        } catch (Exception e) {
            LOGGER.info("Redis expire exception! e：{}", e);
            return false;
        }
    }

    /**
     * 根据key获取过期时间
     *
     * @param key
     *            键 不能为null
     * @return 时间（秒） 返回0代表永久有效
     */
    public long getExpire(String key) {
        return redisTemplate.getExpire(key, TimeUnit.SECONDS);
    }

    /**
     * 判断key是否存在
     *
     * @param key
     *            键
     * @return true：key存在；false：key不存在
     */
    public boolean hasKey(String key) {
        return redisTemplate.hasKey(key);
    }

    /**
     * 根据key删除
     * 
     * @param key
     *            键
     * @return true：删除成功；false：删除失败
     */
    public boolean removeKey(String key) {
        return redisTemplate.delete(key);
    }

    public boolean setHash(String key, Map map) {
        try {
            redisTemplate.opsForHash().putAll(key, map);
            return true;
        } catch (Exception e) {
            LOGGER.info("Redis setHash exception! e：{}", e);
            return false;
        }
    }

    public Map getHash(String key) {
        return redisTemplate.opsForHash().entries(key);
    }

    public <V> boolean setHashValue(String key, String hk, V hv) {
        return redisTemplate.opsForHash().putIfAbsent(key, hk, hv);
    }

    /**
     *
     * @param key
     * @param hk hash的key
     * @param <V>
     * @return
     */
    public <V> V getHashValue(String key, String hk) {
        return (V)redisTemplate.opsForHash().get(key, hk);
    }

}
