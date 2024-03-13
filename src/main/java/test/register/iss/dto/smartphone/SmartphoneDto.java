package test.register.iss.dto.smartphone;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import test.register.iss.dto.TechnicDto;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SmartphoneDto {
    private Long id;
    @Valid
    private TechnicDto aboutTechnicDto;

    @NotNull(message = "Memory can't be empty")
    @Min(0)
    private Integer memory;

    @NotNull(message = "Count Cameras can't be empty")
    @Min(1)
    private Short countCameras;
}
