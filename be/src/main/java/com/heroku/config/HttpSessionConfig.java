package com.heroku.config;

import com.lambdaworks.redis.RedisURI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.ConfigureRedisAction;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.CookieHttpSessionStrategy;
import org.springframework.session.web.http.HttpSessionStrategy;


@Configuration
@EnableRedisHttpSession
public class HttpSessionConfig {

    @Value("${spring.redis.url}")
    private String url;

    @Bean
    public ConfigureRedisAction configureRedisAction() {
        return ConfigureRedisAction.NO_OP;
    }

    @Bean
    public LettuceConnectionFactory connectionFactory() {

        RedisURI uri = RedisURI.create(url);
        LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory(uri.getHost(), uri.getPort());
        lettuceConnectionFactory.setPassword(String.valueOf(uri.getPassword()));
        return lettuceConnectionFactory;
    }

    @Bean
    public HttpSessionStrategy httpSessionStrategy() {
//        return new HeaderHttpSessionStrategy();
        return new CookieHttpSessionStrategy();

    }
}