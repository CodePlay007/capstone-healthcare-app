package com.upgrad.bookmyconsultation;

import com.upgrad.bookmyconsultation.config.ApiConfiguration;
import com.upgrad.bookmyconsultation.config.WebConfiguration;
import com.upgrad.bookmyconsultation.entity.User;
import com.upgrad.bookmyconsultation.exception.InvalidInputException;
import com.upgrad.bookmyconsultation.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import java.time.LocalDate;

@SpringBootApplication
@Import({ApiConfiguration.class, WebConfiguration.class})
public class BookmyconsultationApplication {
	public static void main(String[] args) throws InvalidInputException {

		SpringApplication.run(BookmyconsultationApplication.class, args);

	}
}
