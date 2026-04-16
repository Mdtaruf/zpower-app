package com.wnm.zpower.controller;

import com.wnm.zpower.entities.ContactLead;
import com.wnm.zpower.repository.ContactRepository;
import com.wnm.zpower.service.ServiceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ContactRepository contactRepo;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<ServiceInfo> services = Arrays.asList(
            new ServiceInfo("Z-CONSTRUCT", "End-to-end civil engineering solutions.", "#Construction", "hard-hat"),
            new ServiceInfo("Z-ESTATE", "Premium properties curated for your comfort.", "#RealEstate", "building-2")
        );
        model.addAttribute("services", services);
        model.addAttribute("contactLead", new ContactLead());
        return "index";
    }

    @PostMapping("/contact")
    public String submitContact(@ModelAttribute ContactLead lead, Model model) {
        contactRepo.save(lead); // Database mein save
        return "redirect:/?success=true#contact";
    }
}