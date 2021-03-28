package az.turbo.backend.users.application;

import az.turbo.backend.users.application.dto.UserCreateDto;
import az.turbo.backend.users.application.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> retrieveAll();

    long create(UserCreateDto userCreateDto);
}
