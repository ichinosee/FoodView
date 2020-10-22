package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FoodController {
	
	@Autowired
	HttpSession session;
	
	@Autowired
	FoodRepository foodRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@RequestMapping(value="/foods")
	public ModelAndView foods(ModelAndView mv) {
		mv.addObject("categories", categoryRepository.findAll());
		
		List<Food> foodList = foodRepository.findAll();
		
		mv.addObject("foods", foodList);
		
		mv.setViewName("foods");
		return mv;
	}
	
	@RequestMapping(value="/foods/{code}")
	public ModelAndView foodsByCode(
			@PathVariable(name="code") int categoryCode,
			ModelAndView mv
			) {
		mv.addObject("categories", categoryRepository.findAll());
		
		List<Food> foodList = foodRepository.findByCategoryCode(categoryCode);
		mv.addObject("foods", foodList);
		
		mv.setViewName("foods");
		return mv;
		
	}

}
