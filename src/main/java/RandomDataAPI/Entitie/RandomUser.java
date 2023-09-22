package RandomDataAPI.Entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "random_users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RandomUser {

      @Id
      private int id;

      private String uid;

      private String password;

      private String username;

      private String email;

      private  String gender;
}
