package test.register.iss.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TechnicDto {
    private Long id;
    private long serialNumber;
    private String name;
    private int price;
    private String countryManufacture;
    private String companyManufacture;
    private String type;
    private String color;
    private String dimensions;
    private boolean orderOnline;
    private boolean installmentPlan;
    private boolean availability;
}
