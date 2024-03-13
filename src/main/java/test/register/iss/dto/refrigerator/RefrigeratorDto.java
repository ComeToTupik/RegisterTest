package test.register.iss.dto.refrigerator;

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
    private TechnicDto aboutTechnicDto;
    private short countDoors;
    private String typeCompressor;
}
