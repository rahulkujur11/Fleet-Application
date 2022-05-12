package com.demo.MyFleetApp.controllers;

import java.util.List;
import java.util.Optional;

import com.demo.MyFleetApp.models.Country;
import com.demo.MyFleetApp.models.State;
import com.demo.MyFleetApp.services.CountryService;
import com.demo.MyFleetApp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StateController {

	@Autowired	private StateService stateService;
	@Autowired	private CountryService countryService;


	@GetMapping("/states")
	public String getStates(Model model) {
		List<State> stateList = stateService.getStates();
		model.addAttribute("states", stateList);

		List<Country> countryList = countryService.getCountries();
		model.addAttribute("countries", countryList);

		return "State";
	}

	@PostMapping("/states/addNew")
	public String addNew(State state) {
		stateService.save(state);
		return "redirect:/states";
	}

	@RequestMapping("states/findById")
	@ResponseBody
	public Optional<State> findById(int id) {
		return stateService.findById(id);
	}

	@RequestMapping(value="/states/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(State state) {
		stateService.save(state);
		return "redirect:/states";
	}

	@RequestMapping(value="/states/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		stateService.delete(id);
		return "redirect:/states";

	}
}
