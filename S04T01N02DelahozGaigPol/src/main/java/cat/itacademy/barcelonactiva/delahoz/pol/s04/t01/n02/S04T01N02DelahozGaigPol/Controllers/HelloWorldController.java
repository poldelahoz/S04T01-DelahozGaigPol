package cat.itacademy.barcelonactiva.delahoz.pol.s04.t01.n02.S04T01N02DelahozGaigPol.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(value="/HelloWorld")
    public String saluda(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String nom) {
      return String.format("Hola, %s. Estàs executant un projecte Gradle.", nom);
    }
	
	//@GetMapping(value="/HelloWorld2")
	@GetMapping({"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(required = false) String nom) {
		if (nom != null) {
			return String.format("Hola, %s. Estàs executant un projecte Gradle.", nom);
		}else {
			return "Hola. Estàs executant un projecte Gradle.";
		}
    }
	
}
