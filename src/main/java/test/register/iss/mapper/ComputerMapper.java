package test.register.iss.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import test.register.iss.dto.TechnicDto;
import test.register.iss.dto.computer.ComputerDto;
import test.register.iss.entity.Computer;
import test.register.iss.entity.Technic;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ComputerMapper {
    ComputerMapper INSTANCE = Mappers.getMapper(ComputerMapper.class);
    TechnicMapper technicMapper = TechnicMapper.INSTANCE;

    @Mapping(target = "aboutTechnicDto", source = "aboutTechnic", qualifiedByName = "mapTechnicToDto")
    ComputerDto toDto(Computer computer);

    @Mapping(target = "aboutTechnic", source = "aboutTechnicDto", qualifiedByName = "mapTechnicToEntity")
    Computer toEntity(ComputerDto computerDto);

    @Named("mapTechnicToDto")
    default TechnicDto mapTechnicToDto(Technic technic){
        return technicMapper.toDto(technic);
    }

    @Named("mapTechnicToEntity")
    default Technic mapTechnicToEntity(TechnicDto technicDto){
        return technicMapper.toEntity(technicDto);
    }
}
