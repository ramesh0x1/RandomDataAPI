package RandomDataAPI.Service;

import RandomDataAPI.Entitie.RandomUser;
import RandomDataAPI.Repository.RandomUserRepository;
import RandomDataAPI.Response.RandomUserApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class RandomUserService {

       @Autowired
       RestTemplate restTemplate;
       @Autowired
       RandomUserRepository randomUserRepository;

    @Scheduled(fixedRate = 3600000)
    public void scheduledDataRetrieval() {
        fetchDataAndSave();
    }

        public void fetchDataAndSave () {
            System.out.println("fetch and save");
            String apiUrl = "https://random-data-api.com/api/users/random_user?size=10";
            List<RandomUserApiResponse> response = Arrays.asList(restTemplate.getForObject(apiUrl,  RandomUserApiResponse[].class));
            System.out.println(response);

            if (response != null) {
                System.out.println("response not null");
                for (RandomUserApiResponse randomUser : response) {

                    RandomUser newUser = new RandomUser();
                  RandomUser randomUser1=  randomUserRepository.findById(randomUser.getId()).orElse(null);
                  System.out.println(randomUser1 +"randomUser");
                  if(randomUser1!=null){
                      System.out.println("Continue");
                      continue;
                  }
                  System.out.println("responseUser :"+randomUser);
                    newUser.setId(randomUser.getId());
                    newUser.setUid(randomUser.getUid());
                    newUser.setPassword(randomUser.getPassword());
                    newUser.setUsername(randomUser.getUsername());
                    newUser.setEmail(randomUser.getEmail());
                    newUser.setGender(randomUser.getGender());
                    randomUserRepository.save(newUser);
                }
            }
        }

}

