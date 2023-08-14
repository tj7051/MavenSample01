package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping({"/",""})
	public ResponseEntity<?> index(){
		Map<String, Object> map = new HashMap<>();
		map.put("id", "k001");
		
		return ResponseEntity.ok().body(map);
	}
	
	@GetMapping("/health")
	public ResponseEntity<?> health(){
		Map<String, Object> map = new HashMap<>();
		map.put("status", "ok");
		
		return ResponseEntity.ok().body(map);
	}

}
