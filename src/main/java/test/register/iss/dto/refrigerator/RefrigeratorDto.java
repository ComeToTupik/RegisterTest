package test.register.iss.dto.refrigerator;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import test.register.iss.dto.TechnicDto;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RefrigeratorDto {
    private Long id;
    @Valid
    private TechnicDto aboutTechnicDto;

    @NotNull(message = "Count Doors can't be empty")
    @Min(1)
    private Short countDoors;

    @NotNull(message = "Type can't be empty")
    @NotBlank(message = "Type cannot be blank")
    @Size(max = 256, message = "Type cannot exceed 256 characters")
    private String typeCompressor;
}
