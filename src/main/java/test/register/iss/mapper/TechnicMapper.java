package test.register.iss.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import test.register.iss.dto.TechnicDto;
import test.register.iss.entity.Technic;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TechnicMapper {
    TechnicMapper INSTANCE = Mappers.getMapper(TechnicMapper.class);
    TechnicDto toDto(Technic technic);
    Technic toEntity(TechnicDto technicDto);
}
