package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * Spring Web
 * h2 Database
 * OpenFeign
 *
 * @author devphilippe
 */


@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

        public static void main(String[] args) {
            SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
        }

    }
