package test.register.iss.dto.computer;

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
    private TechnicDto aboutTechnicDto;
    private String category;
    private String typeProcessor;
}
