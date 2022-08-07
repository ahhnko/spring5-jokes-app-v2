package guru.springframework.spring5jokesappv2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5jokesappv2.services.JokesService;

@Controller
@RequestMapping("/")
public class JokesController {

	@Autowired
	private JokesService jokesService;

	@GetMapping("")
	public String getJoke(Model model) {
		String joke = jokesService.getJoke();
		model.addAttribute("joke", joke);
		return "Index";
	}
}
