package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationController {

	@Autowired
	private OperationService service = new OperationService();
	
	@GetMapping("/moltiplica")
	public Result moltiplica(int num1, int num2) {
		return service.moltiplica(num1, num2);
	}
	
}
