package com.rapido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rapido.model.User;
import com.rapido.service.IRapidoService;

@RestController
@RequestMapping( value="/rapido-api")
public class RapidoController {

	@Autowired
	IRapidoService iRapidoService;

	@PostMapping(value="/register")
	ResponseEntity<Void> Register(@RequestBody User user) {
		iRapidoService.Register(user);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info","registering user");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).build();
	}
	void login(String username,String password) {

	}
	@PatchMapping(value="/update")
	ResponseEntity<Void> UpdateDetails(@RequestParam("password") String password,@RequestParam("userId") String userId) {
		iRapidoService.UpdateDetails(password, userId);
		return ResponseEntity.accepted().build();
	}
	@DeleteMapping (value="/delete")
	void DeleteAccount(@RequestParam("userId") String userId) {
		iRapidoService.DeleteAccount(userId);
 	}
	@GetMapping
	User GetDetails(int userId) {
		return null;

	}
}
