package com.example.demo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class ContactController {

    ArrayList<Contact> newContact = new ArrayList<>();

   String addContact (@RequestBody Contact contact){

        String newContactEmail = contact.getEmail();
        for( int i = 0; i < newContact.size(); i++){

            if( newContact.get(i).getEmail().equals(newContactEmail)){
                return "Contact already exists with this email!";
            }
        }
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
