package lms.mvctest.mvc.controller;

import lms.mvctest.mvc.annotation.Controller;
import lms.mvctest.mvc.annotation.RequestMapping;
import lms.mvctest.mvc.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("users", UserRepository.findAll());
        return "home";
    }
}