package com.example.demo;

import com.example.demo.entity.User;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RedisTest {
    private final StringRedisTemplate stringRedisTemplate;
    private final RedisTemplate<String, User> redisTemplate;

    @Test
    public void redisTemplateTest() {
        final String KEY = "key";
        stringRedisTemplate.opsForValue().set(KEY, "value");
        System.out.println(KEY + " -> " + stringRedisTemplate.opsForValue().get(KEY));

        final String USER_KEY = "user_key";
        redisTemplate.opsForValue().set(USER_KEY, new User(1L, "name"));
        System.out.println(USER_KEY + " -> " + redisTemplate.opsForValue().get(USER_KEY));
    }
}
