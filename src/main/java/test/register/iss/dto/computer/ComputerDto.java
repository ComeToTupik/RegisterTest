package test.register.iss.dto.computer;

import jakarta.validation.Valid;
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
@NoArgsConstructor
@AllArgsConstructor
public class ComputerDto {
    private Long id;
    @Valid
    private TechnicDto aboutTechnicDto;

    @NotNull(message = "Category can't be empty")
    @NotBlank(message = "Category cannot be blank")
    @Size(max = 256, message = "Category cannot exceed 256 characters")
    private String category;

    @NotNull(message = "Type Processor can't be empty")
    @NotBlank(message = "Type Processor cannot be blank")
    @Size(max = 256, message = "Type Processor cannot exceed 256 characters")
    private String typeProcessor;
}
