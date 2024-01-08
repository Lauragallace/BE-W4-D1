package entities;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Topping {
    private String name;
    private int calories;
    private double price;
}