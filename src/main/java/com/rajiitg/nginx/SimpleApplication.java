package com.rajiitg.nginx;

import org.apache.commons.io.FileUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class SimpleApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SimpleApplication.class, args);
        FileUtils.touch(new File("/tmp/app-initialized"));
    }
}
