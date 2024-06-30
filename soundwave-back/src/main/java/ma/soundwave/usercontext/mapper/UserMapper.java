package ma.soundwave.usercontext.mapper;

import ma.soundwave.usercontext.ReadUserDTO;
import ma.soundwave.usercontext.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User entity);

}
