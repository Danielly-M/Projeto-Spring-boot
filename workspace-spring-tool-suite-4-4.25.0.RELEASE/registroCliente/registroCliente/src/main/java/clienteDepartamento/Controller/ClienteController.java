package clienteDepartamento.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/cliente")
@RestController
public class ClienteController {
	@PostMapping
	public void cadastrar(@RequestBody String json) {
		System.out.println(json);
	}

}
