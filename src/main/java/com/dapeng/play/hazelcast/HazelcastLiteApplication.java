package com.dapeng.play.hazelcast;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.util.UUID;
import java.util.stream.IntStream;

@SpringBootApplication
public class HazelcastLiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(HazelcastLiteApplication.class, args);
    }

}
