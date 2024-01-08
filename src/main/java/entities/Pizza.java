package entities;

import java.util.List;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Pizza {
    private String name;
    private List<Topping> toppingList;
    private int calories;
    private double price;

}
