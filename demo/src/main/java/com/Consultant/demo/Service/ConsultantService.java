package com.Consultant.demo.Service;

import com.Consultant.demo.Model.Consultant;
import com.Consultant.demo.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ConsultantService {

    @Autowired
    Repository rep;
    public List<Consultant> getUsers(){
        return rep.findAll();
    }

    public Consultant createUser(@Validated @RequestBody Consultant c){
        return rep.save(c);
    }

//    public Consultant updateuser(@PathVariable(value="id") Long Id,@Validated @RequestBody Consultant c){
//        Consultant user=rep.findById(Id).orElseThrow(()-> new ResourceNotFoundException("Consultant","Id",Id));
//        user.setEmail(c.getEmail());
//        user.setName(c.getName());
//        user.setMobileNumber(c.getMobileNumber());
//        Consultant updatedUser=rep.save(user);
//        return updatedUser;
//    }


}
