package com.ucbcba.demo.Controllers;

import com.ucbcba.demo.Entities.User;
import com.ucbcba.demo.services.CityService;
import com.ucbcba.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserController {


    @Autowired
    private UserService userService;

    private CityService cityService;
    @Autowired
    public void setCityService(CityService cityService){
        this.cityService = cityService;
    }

    //@Autowired
    //private SecurityService securityService;

    //@Autowired
    //private UserValidator userValidator;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registrationInit(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("cities",cityService.listAllCities());
        return "register";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@Valid User user, BindingResult bindingResult, Model model) {
        ///userValidator.validate(userForm, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute(user);
            return "register";
        }
        user.setRole("CLIENTE");
        userService.save(user);
        return "redirect:/";
    }

    @RequestMapping("/profile")
    public String perfil(Model model) {
        return "showProfile";
    }

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String home(Model model, String error, String logout) {
//        model.addAttribute("cities", cityService.listAllCities());
//        return "home";
//    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        return "login";
    }
}