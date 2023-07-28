package Role.Play.dice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiceRepo extends JpaRepository<Dice, String> {

}
