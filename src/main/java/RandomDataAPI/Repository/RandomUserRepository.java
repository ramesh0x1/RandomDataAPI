package RandomDataAPI.Repository;

import RandomDataAPI.Entitie.RandomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RandomUserRepository extends JpaRepository<RandomUser, Integer> {


}