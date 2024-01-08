package entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Beverage {
    private String name;
    private int calories;
    private double price;
}
