package RandomDataAPI.Controllers;

import RandomDataAPI.Service.RandomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomUserController {

    @Autowired
    RandomUserService userService;
    @PostMapping("add/randomUsers")
    public String addRandomUsers(){
         userService.scheduledDataRetrieval();
        return "adding random users successfully ";
    }
}
