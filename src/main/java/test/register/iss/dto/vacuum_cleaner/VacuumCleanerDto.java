package test.register.iss.dto.vacuum_cleaner;

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
    private TechnicDto technicDto;
    private float volume;
    private int numberModes;
}
