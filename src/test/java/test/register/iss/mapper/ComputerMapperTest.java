package test.register.iss.mapper;

import org.junit.jupiter.api.Test;
import test.register.iss.dto.TechnicDto;
import test.register.iss.dto.computer.ComputerDto;
import test.register.iss.entity.Computer;
import test.register.iss.entity.Technic;

import static org.junit.jupiter.api.Assertions.*;

class ComputerMapperTest {
    ComputerMapper computerMapper = ComputerMapper.INSTANCE;

    @Test
    public void toDto_checkCorrectWork(){
        Computer computer = createEntity();

        ComputerDto result = computerMapper.toDto(computer);

        assertNotNull(result);

        assertEquals(1L, result.getId());
        assertEquals(1L, result.getAboutTechnicDto().getId());
        assertEquals("category", result.getCategory());
        assertEquals("processor", result.getTypeProcessor());
    }

    @Test
    public void toEntity_checkCorrectWork(){
        ComputerDto computerDto = createDto();

        Computer result = computerMapper.toEntity(computerDto);

        assertNotNull(result);

        assertEquals(1L, result.getId());
        assertEquals(1L, result.getAboutTechnic().getId());
        assertEquals("category", result.getCategory());
        assertEquals("processor", result.getTypeProcessor());
    }

    private Computer createEntity(){
        Technic technic = Technic.builder()
                .id(1L)
                .build();
        return Computer.builder()
                .id(1L)
                .aboutTechnic(technic)
                .category("category")
                .typeProcessor("processor")
                .build();
    }

    private ComputerDto createDto(){
        TechnicDto technicDto = TechnicDto.builder()
                .id(1L)
                .build();
        return ComputerDto.builder()
                .id(1L)
                .aboutTechnicDto(technicDto)
                .category("category")
                .typeProcessor("processor")
                .build();
    }
}