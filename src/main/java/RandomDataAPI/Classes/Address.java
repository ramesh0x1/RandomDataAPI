package RandomDataAPI.Classes;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {
    private String city;
    private String street_name;
    private String street_address;
    private String zip_code;
    private String state;
    private String country;
    private Coordinates coordinates;
}