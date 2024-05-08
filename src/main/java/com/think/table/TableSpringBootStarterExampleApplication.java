package com.think.table;

import com.think.table.annotation.TableScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@TableScan
public class TableSpringBootStarterExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(TableSpringBootStarterExampleApplication.class, args);
    }

}
