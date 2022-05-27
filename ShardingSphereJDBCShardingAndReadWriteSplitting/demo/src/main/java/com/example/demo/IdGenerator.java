package com.example.demo;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.github.yitter.contract.IdGeneratorOptions;
import com.github.yitter.idgen.YitIdHelper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class IdGenerator implements IdentifierGenerator {
    final IdGeneratorOptions options = new IdGeneratorOptions((short) 1);

    @PostConstruct
    public void init() {
        YitIdHelper.setIdGenerator(options);
    }

    @Override
    public Long nextId(Object entity) {
        return YitIdHelper.nextId();
    }
}
