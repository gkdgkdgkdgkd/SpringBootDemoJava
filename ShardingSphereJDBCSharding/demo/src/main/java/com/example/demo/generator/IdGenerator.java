package com.example.demo.generator;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.github.yitter.idgen.YitIdHelper;
import org.springframework.context.annotation.Bean;

public class IdGenerator {
    @Bean
    public IdentifierGenerator identifierGenerator() {
        return entity -> YitIdHelper.nextId();
    }
}