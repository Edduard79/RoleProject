package Role.Play.dice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiceController {
    @Autowired
    private DiceService diceService;
}
