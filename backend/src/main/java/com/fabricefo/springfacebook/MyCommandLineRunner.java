package com.fabricefo.springfacebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.fabricefo.springfacebook.migrations.Migration;
import com.fabricefo.springfacebook.migrations.Mockup;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    private final Migration migration;
    private final Mockup mockup;

    @Autowired
    public MyCommandLineRunner(Migration migration, Mockup mockup) {
        this.migration = migration;
        this.mockup = mockup;
    }

    @Override
    public void run(String... args) {
        migration.initializeDb();
        mockup.mockData();
    }
}
