package test.register.iss.dto.vacuum_cleaner;

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
public class VacuumCleanerDto {
    private Long id;
    @Valid
    private TechnicDto technicDto;

    @NotNull(message = "Volume can't be empty")
    @Min(0)
    private Float volume;

    @NotNull(message = "Numbers Modes can't be empty")
    @Min(1)
    private Integer numberModes;
}
