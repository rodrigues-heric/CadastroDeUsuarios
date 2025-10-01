package com.rodrigues.heric.CadastroDeUsuarios.Users.Service;

import com.rodrigues.heric.CadastroDeUsuarios.Users.Model.UserModel;
import com.rodrigues.heric.CadastroDeUsuarios.Users.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserModel createUser(UserModel userModel) {
        return userRepository.save(userModel);
    }

    public Optional<UserModel> getUserById(Long id) {
        return userRepository.findById(id);
    }
}
