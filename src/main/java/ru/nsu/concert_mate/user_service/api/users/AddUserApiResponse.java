package ru.nsu.concert_mate.user_service.api.users;

import lombok.Data;
import ru.nsu.concert_mate.user_service.api.ApiResponseStatus;
import ru.nsu.concert_mate.user_service.api.ApiResponseStatusCode;
import ru.nsu.concert_mate.user_service.model.dto.UserDto;

@Data
public class AddUserApiResponse {
    private ApiResponseStatus status;

    private UserDto user;

    public AddUserApiResponse(ApiResponseStatusCode code) {
        this(code, null);
    }

    public AddUserApiResponse(UserDto user) {
        this(ApiResponseStatusCode.SUCCESS, user);
    }

    public AddUserApiResponse(ApiResponseStatusCode code, UserDto user) {
        this.status = new ApiResponseStatus(code);
        this.user = user;
    }
}
