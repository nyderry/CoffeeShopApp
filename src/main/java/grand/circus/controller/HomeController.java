package grand.circus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Ny Derry on 7/21/2017.
 */



    @Controller
    public class HomeController {


    @RequestMapping("/summary")

    public ModelAndView summary(@RequestParam("firstname") String firstname,
                                @RequestParam("lastname") String lastname,
                                @RequestParam("email") String email,
                                @RequestParam("phonenumber") String phonenumber,
                                @RequestParam("password") String password,
                                Model model) {


        model.addAttribute("fname",firstname);
        model.addAttribute("lname",lastname);
        model.addAttribute("e_mail",email);
        model.addAttribute("phonenum",phonenumber);
        model.addAttribute("pwd",password);


        return new ModelAndView("summary", "message" , model);
    }

    @RequestMapping("registration")

    public String register() {
        return "registration";
    }

    @RequestMapping("/welcome")

    public ModelAndView welcome() {
        return new
                ModelAndView("index", "message", "Welcome!");

    }

    @RequestMapping("")

    public String welcomeGreeting() {
        return "index";

    }

    }


