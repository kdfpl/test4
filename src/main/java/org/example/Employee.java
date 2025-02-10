package org.example;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
}
