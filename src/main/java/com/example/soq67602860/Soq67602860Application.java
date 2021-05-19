package com.example.soq67602860;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Soq67602860Application {

	public static void main(String[] args) {
		SpringApplication.run(Soq67602860Application.class, args);
	}

	@GetMapping("/")
	public String get(@ModelAttribute("form") RequestDTO form) {
		return "index";
	}

	@PostMapping("/")
	public @ResponseBody List<String> post(@ModelAttribute("form") RequestDTO form) {
		System.out.format("Selected %d book%s%n", form.getRequestedBooks().size(),
				form.getRequestedBooks().size() == 1 ? "" : "s");
		return form.getRequestedBooks();

	}

	@ModelAttribute("allBooks")
	public List<Book> allBooks() {
		return List.of(Book.of("1", "God", "Bible"), Book.of("2", "Donald E. Knuth", "The Art of Computer Programming"),
				Book.of("3", "Robert C. Martin", "Clean Code"));
	}
}