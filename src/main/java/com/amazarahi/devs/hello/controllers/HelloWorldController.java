/**
 * 
 */
package com.amazarahi.devs.hello.controllers;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Amazarashi
 *
 */
@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	//acceder al codigo atra vez de metodo
	@GetMapping
	public ResponseEntity<String> helloWorld()
	{
		return new ResponseEntity<>("Hello World :D ",HttpStatus.OK);
	}	

}
