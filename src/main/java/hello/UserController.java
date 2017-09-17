package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @RequestMapping(value = "/newUser", method = RequestMethod.POST)
    public ResponseEntity < String > addNewPerson(@RequestBody User user) {
        if (user != null) {
            
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

}
