package RandomDataAPI.Classes;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
 public  class Subscription {
    private String plan;
    private String status;
    private String payment_method;
    private String term;
}