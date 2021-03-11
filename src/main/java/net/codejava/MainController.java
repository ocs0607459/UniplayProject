package net.codejava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	@Autowired
	private Tossrepo tossrepo;

	@GetMapping("/tossreg")
	public String showForm(Model model) {
		Toss toss = new Toss();
		model.addAttribute("toss", toss);

		System.out.println("hichandu");

		return "userlogin";
	}

	@PostMapping("/tossreg")
	public String submitForm(@ModelAttribute("toss") Toss toss) {
		System.out.println(toss);
		System.out.println(" toss entered");

		tossrepo.save(toss);
		System.out.println("sekhar");
		return "userlogin";
	}
}
