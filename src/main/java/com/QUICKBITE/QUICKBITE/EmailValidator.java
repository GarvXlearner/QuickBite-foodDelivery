package com.QUICKBITE.QUICKBITE;

import org.springframework.stereotype.Component;

@Component
public class EmailValidator {
    Boolean EmailValid(String email)
    { if(email!=null&&email.contains("@"))
    {
        return true;
    }
    return false;
    }
}
