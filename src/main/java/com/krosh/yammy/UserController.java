package com.krosh.yammy;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RequestMapping("api")
@RestController
public class UserController {

	@GetMapping("register")
	public RegisterRs hello(RegisterInfo info) {
		System.out.println("register");
		return new RegisterRs();
	}

	@GetMapping("user/list")
	public RegisterRs list(RegisterInfo info) {
		System.out.println("register");
		return new RegisterRs();
	}

	@PostMapping("user/{userId}/message")
	public RegisterRs messageList(String text) {
		System.out.println("register");
		return new RegisterRs();
	}

	@ExceptionHandler(Throwable.class)
	public ResponseEntity<String> handleException(Throwable e) {
		return ResponseEntity
				.status(HttpStatus.BAD_REQUEST)
				.body(e.getMessage());
	}
}
