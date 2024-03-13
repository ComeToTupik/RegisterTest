package test.register.iss.mapper;

import org.junit.jupiter.api.Test;
import test.register.iss.dto.TechnicDto;
import test.register.iss.entity.Technic;

import static org.junit.jupiter.api.Assertions.*;

class TechnicMapperTest {
    private final TechnicMapper technicMapper = TechnicMapper.INSTANCE;

    @Test
    public void toDto_checkCorrectWork(){
        Technic technic = createEntity();

        TechnicDto result = technicMapper.toDto(technic);

        assertNotNull(result);

        assertEquals(1L, result.getId());
        assertEquals("name", result.getName());
        assertEquals(111L, result.getSerialNumber());
        assertEquals(1, result.getPrice());
        assertEquals("country", result.getCountryManufacture());
        assertEquals("company", result.getCompanyManufacture());
        assertEquals("type", result.getType());
        assertEquals("color", result.getColor());
        assertEquals("10x10x10", result.getDimensions());
        assertTrue(result.isOrderOnline());
        assertFalse(result.isInstallmentPlan());
        assertTrue(result.isAvailability());
    }
    @Test
    public void toEntity_checkCorrectWork(){
        TechnicDto technicDto = createDto();

        Technic result = technicMapper.toEntity(technicDto);

        assertNotNull(result);

        assertEquals(1L, result.getId());
        assertEquals("name", result.getName());
        assertEquals(111L, result.getSerialNumber());
        assertEquals(1, result.getPrice());
        assertEquals("country", result.getCountryManufacture());
        assertEquals("company", result.getCompanyManufacture());
        assertEquals("type", result.getType());
        assertEquals("color", result.getColor());
        assertEquals("10x10x10", result.getDimensions());
        assertTrue(result.isOrderOnline());
        assertFalse(result.isInstallmentPlan());
        assertTrue(result.isAvailability());
    }

    private TechnicDto createDto() {
        return TechnicDto.builder()
                .id(1L)
                .name("name")
                .serialNumber(111L)
                .price(1)
                .countryManufacture("country")
                .companyManufacture("company")
                .type("type")
                .color("color")
                .dimensions("10x10x10")
                .orderOnline(true)
                .installmentPlan(false)
                .availability(true)
                .build();
    }

    private Technic createEntity() {
        return Technic.builder()
                .id(1L)
                .name("name")
                .serialNumber(111L)
                .price(1)
                .countryManufacture("country")
                .companyManufacture("company")
                .type("type")
                .color("color")
                .dimensions("10x10x10")
                .orderOnline(true)
                .installmentPlan(false)
                .availability(true)
                .build();
    }
}