package fr.kelig.country;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Country {
    private String countryName;
    private String capitalName;
    private String currency;
}
