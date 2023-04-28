package com.matster.multimodulemavenservice.controller;

import org.openapitools.api.UserApi;
import org.openapitools.model.User;
import org.openapitools.model.UserWithId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.UUID;

@RestController
public class UserController implements UserApi {

    @Override
    public ResponseEntity<Void> deleteById(UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<UserWithId> getById(UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<UserWithId> getUsers() {
        return ResponseEntity.ok(new UserWithId().avatar("test").login("test").password("test").type(UserWithId.TypeEnum.ADMIN).userId(UUID.randomUUID()));
    }

    @Override
    public ResponseEntity<Void> patchUser(UUID id, @Valid User body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> postUser(@Valid User body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> uploadAvatar(UUID id, @Valid MultipartFile receipt) {
        return null;
    }
}
