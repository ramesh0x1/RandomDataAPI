package RandomDataAPI.Response;


import RandomDataAPI.Classes.CreditCard;

import RandomDataAPI.Classes.Employment;
import RandomDataAPI.Classes.Subscription;
import RandomDataAPI.Classes.Address;
import lombok.Data;

@Data
public class RandomUserApiResponse {
    private int id;
    private String uid;
    private String password;
    private String username;
    private String email;
    private String gender;
    private String phone_number;
    private String social_insurance_number;
    private String date_of_birth;
    private Employment employment;
    private Address address;
    private CreditCard credit_card;
    private Subscription subscription;
}
