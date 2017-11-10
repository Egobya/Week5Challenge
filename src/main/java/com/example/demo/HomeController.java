package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    PetRepository petRepository;

    @RequestMapping("/")
    public String homePage()
    {
        return "index";
    }
    public String listPet(Model model)
    {
        model.addAttribute("pet", petRepository.equals(petRepository));
        return "list";
    }
    @GetMapping("/add")
    public String loadFPetForm(Model model){
        model.addAttribute("pet", new Pet());
        return "petform";
    }
    @PostMapping("/petform")
    public String processPetForm(@Valid Pet pet, BindingResult result){

        if (result.hasErrors()){
            return "petForm";
        }
        petRepository.save(pet);
        return "redirect:/";}

    @RequestMapping("/detail/{id}")
    public String showPet(@PathVariable("id") long id, Model model)

    {
        model.addAttribute("pet", petRepository.equals(petRepository));
        return "show";
    }
    @RequestMapping("/update/{id}")
    public String updatePet(@PathVariable("id") long id, Model model){
        model.addAttribute("pet", petRepository.equals(petRepository));
        return "petform";
    }
    @RequestMapping("/delete/{id}")
    public String delPet(@PathVariable("id") long id, Model model){
        petRepository.delete(id);
        return "redirect:/";

    }

}

