package com.Consultant.demo.Controller;

import com.Consultant.demo.Model.Consultant;
import com.Consultant.demo.Service.ConsultantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class UserController {

    @Autowired
    ConsultantService consultantService;
    @GetMapping("/allusers")
    public List<Consultant> getConsultant()
    {
    return consultantService.getUsers();
    }

    @PostMapping("/createuser")
    public Consultant createConsultant(@RequestBody Consultant c){
        return consultantService.createUser(c);
    }
}
