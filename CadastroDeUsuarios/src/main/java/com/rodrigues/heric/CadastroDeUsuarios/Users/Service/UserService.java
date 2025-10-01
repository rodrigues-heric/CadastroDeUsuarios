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

    public UserModel saveUser(UserModel userModel) {
        return this.userRepository.save(userModel);
    }

    public Optional<UserModel> getUserById(Long id) {
        return this.userRepository.findById(id);
    }

    public Optional<UserModel> updateUser(Long id, UserModel user) {
        Optional<UserModel> existingUserOptional = this.getUserById(id);

        if (existingUserOptional.isPresent()) {
            UserModel existingUser = existingUserOptional.get();
            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
            existingUser.setAge(user.getAge());

            return Optional.of(this.saveUser(existingUser));
        }

        return Optional.empty();
    }

    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
    }
}
