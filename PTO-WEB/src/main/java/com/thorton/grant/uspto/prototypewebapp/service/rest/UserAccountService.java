package com.thorton.grant.uspto.prototypewebapp.service.rest;


import com.thorton.grant.uspto.prototypewebapp.factories.ServiceBeanFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@Service
public class UserAccountService {

    private final ServiceBeanFactory serviceBeanFactory;

    public UserAccountService(ServiceBeanFactory serviceBeanFactory) {
        this.serviceBeanFactory = serviceBeanFactory;
    }

    @RequestMapping(method = RequestMethod.GET, value="/account/email/update/{email}/{password1}/{password2}")
    @ResponseBody
    String updateUserPassword(@PathVariable String email, @PathVariable String password1, @PathVariable String password2){



        // retrieve current userName from spring security

        // check if current password matches what is stored

        // set status code based on if that matched

        // if matched. update password for credentials object



        return "{status: 200}" +
                "{requested email: "+email+"}     "+"passswd: "+password1+" }" +
                "{new password :"+password2+"   }";
    }
}
