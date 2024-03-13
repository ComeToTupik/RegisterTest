package test.register.iss.dto.television;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import test.register.iss.dto.TechnicDto;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TelevisionDto {
    private Long id;
    private TechnicDto aboutTechnicDto;
    private String category;
    private String technology;
}
