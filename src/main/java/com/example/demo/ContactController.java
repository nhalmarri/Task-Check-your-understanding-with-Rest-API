package com.example.demo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class ContactController {

    ArrayList<Contact> newContact = new ArrayList<>();

    @PostMapping ("/addContact")
    String addContact (@RequestBody Contact contact){
         newContact.add(contact);
         return "Contact added Successfully!";
    }

    //getContactDetails

    @GetMapping("/getContactDetails")
    Contact getContactDetails (@RequestParam String name) throws Exception {

        for(int i = 0 ; i < newContact.size() ; i++){
            if((newContact.get(i).getName()).equals(name)){
                return newContact.get(i);
            }
           //else return null;
        }


        //The meesage is written instead of the null but make null work :)


        throw new Exception("Contact not found.");
    }








}