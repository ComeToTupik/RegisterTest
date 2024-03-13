package test.register.iss.dto.smartphone;

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
    private TechnicDto aboutTechnicDto;
    private int memory;
    private short countCameras;
}
