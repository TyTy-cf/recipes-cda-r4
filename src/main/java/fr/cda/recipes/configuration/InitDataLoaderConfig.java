package fr.cda.recipes.configuration;

import fr.cda.recipes.entity.User;
import fr.cda.recipes.repository.UserRepository;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

@Component
public class InitDataLoaderConfig implements CommandLineRunner {

    private final Faker faker;
    private UserRepository userRepository;

    @Autowired
    public InitDataLoaderConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.faker = new Faker(Locale.of("fr"));
    }


    @Override
    public void run(String... args) {
    }

    private LocalDateTime generateRandomDate(Instant start) {
        Faker faker = new Faker();
        Instant randomDate = faker.timeAndDate().between(
                start,
                Instant.now());
        return randomDate.atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

}
