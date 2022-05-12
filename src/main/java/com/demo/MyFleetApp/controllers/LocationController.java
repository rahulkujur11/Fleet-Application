package com.demo.MyFleetApp.controllers;

import com.demo.MyFleetApp.models.Country;
import com.demo.MyFleetApp.models.Location;
import com.demo.MyFleetApp.models.State;
import com.demo.MyFleetApp.services.CountryService;
import com.demo.MyFleetApp.services.LocationService;
import com.demo.MyFleetApp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {

	@Autowired
	private StateService stateService;
	@Autowired	private CountryService countryService;
	@Autowired  private LocationService locationService;

	@GetMapping("/locations")
	public String getStates(Model model) {

		List<State> stateList = stateService.getStates();
		List<Country> countryList = countryService.getCountries();
		//List<Location> locationList = locationService.findAll();

		model.addAttribute("countries", countryList);
		//model.addAttribute("locations", locationList);
		model.addAttribute("states", stateList);
		return "location";
	}

	@PostMapping("/locations/addNew")
	public String addNew(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}

	@RequestMapping("locations/findById")
	@ResponseBody
	public Optional<Location> findById(int id) {
		return locationService.findById(id);
	}

	@RequestMapping(value="/locations/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}

	@RequestMapping(value="/locations/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		//locationService.deleteById(id);
		return "redirect:/locations";
	}
}
