package pt.allanborges.userserviceapi.mapper;

import models.reponses.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pt.allanborges.userserviceapi.entity.User;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = IGNORE,
        nullValueCheckStrategy = ALWAYS
)
public interface UserMapper {

    UserResponse fromEntity(final User entity);

}