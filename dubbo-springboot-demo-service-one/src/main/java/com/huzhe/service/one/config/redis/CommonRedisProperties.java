package com.huzhe.service.one.config.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@lombok.Data
@Component
@ConfigurationProperties
public class CommonRedisProperties {

  @Value("${spring.redis.host}")
  private String host;

  @Value("${spring.redis.port}")
  private Integer port;

  @Value("${spring.redis.database}")
  private Integer database;

  @Value("${spring.redis.timeout}")
  private Integer timeout;

  @Value("${spring.redis.jedis.pool.max-active}")
  private Integer maxActive;

  @Value("${spring.redis.jedis.pool.max-idle}")
  private Integer maxIdle;

  @Value("${spring.redis.jedis.pool.min-idle}")
  private Integer minIdle;

  @Value("${spring.redis.jedis.pool.max-wait}")
  private Integer maxWait;
}
