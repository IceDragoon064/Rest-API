package com.lu.app.rest.Controller;

import com.lu.app.rest.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class HomePageController
{
    /*
    @Autowired
    private UserRepo userRepo;


    @GetMapping(value= "/")
    public String getPage()
    {
        return "Welcome";
    }

    @GetMapping(value = "/users")
    public List<User> getUsers()
    {
        return userRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveUser(@RequestBody User user)
    {
        userRepo.save(user);
        return "Saved....";
    }

    @PutMapping(value = "update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user)
    {
        User updatedUser = userRepo.findById(id).get();
        updatedUser.setFirstName(user.getFirstname());
        updatedUser.setLastName((user.getLastName()));
        updatedUser.setOccupation(user.getOccupation());
        updatedUser.setAge(user.getAge());
        userRepo.save(updatedUser);
        return "Updated....";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable long id)
    {
        User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "Deleted user with the id: " + id;
    }
    */

    @GetMapping
    public ModelAndView homePage()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("serviceApp/src/app/app.component.html");
        return modelAndView;
    }
}
