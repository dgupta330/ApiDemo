package com.example.apidemo.controller;

import com.example.apidemo.User;
import com.example.apidemo.UserRepo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {


    @Autowired
    UserRepo repo;

    @RequestMapping("/")
    public String home()
    {
        return "index";
    }

    @RequestMapping("/getUser")
    @ResponseBody()
    public List<User> getUsers()
    {
        return repo.findAll();
    }

    @RequestMapping("/getUser/{id}")
    @ResponseBody
    public Optional<User> getUser(@PathVariable ("id") int id){
        return repo.findById(id);
    }
    @PostMapping ("/addUser")
    @ResponseBody
    public ModelAndView addToDB( User user, HttpSession session)
    {
        repo.save(user);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        mv.addObject("msg","Added Successfully");
        return mv;
    }
    

}
