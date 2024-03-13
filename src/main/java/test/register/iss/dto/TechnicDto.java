package test.register.iss.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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

    @NotNull(message = "Serial number can't be empty")
    private Long serialNumber;

    @NotNull(message = "Name can't be empty")
    @NotBlank(message = "Name number cannot be blank")
    @Size(max = 256, message = "Name cannot exceed 256 characters")
    private String name;

    @NotNull(message = "Price can't be empty")
    @Min(0)
    private Integer price;

    @NotNull(message = "Country Manufacture can't be empty")
    @NotBlank(message = "Country Manufacture cannot be blank")
    @Size(max = 128, message = "Country Manufacture cannot exceed 128 characters")
    private String countryManufacture;

    @NotNull(message = "Company Manufacture can't be empty")
    @NotBlank(message = "Company Manufacture cannot be blank")
    @Size(max = 128, message = "Company Manufacture cannot exceed 128 characters")
    private String companyManufacture;

    @NotNull(message = "Type can't be empty")
    @NotBlank(message = "Type cannot be blank")
    @Size(max = 256, message = "Type cannot exceed 256 characters")
    private String type;

    @NotNull(message = "Color can't be empty")
    @NotBlank(message = "Color cannot be blank")
    @Size(max = 256, message = "Color cannot exceed 256 characters")
    private String color;

    @NotNull(message = "Dimensions can't be empty")
    @NotBlank(message = "Dimensions cannot be blank")
    @Size(max = 128, message = "Dimensions cannot exceed 128 characters")
    private String dimensions;

    private boolean orderOnline;
    private boolean installmentPlan;
    private boolean availability;
}
