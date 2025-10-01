package com.rodrigues.heric.CadastroDeUsuarios.Users.Controller;

import com.rodrigues.heric.CadastroDeUsuarios.Users.Model.UserModel;
import com.rodrigues.heric.CadastroDeUsuarios.Users.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserModel>> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(this.userService.getUserById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<UserModel> createUser(@RequestBody UserModel user) {
        return ResponseEntity.ok(this.userService.saveUser(user));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Optional<UserModel>> updateUser(@PathVariable Long id, @RequestBody UserModel user) {
        return ResponseEntity.ok(this.userService.updateUser(id, user));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        this.userService.deleteUser(id);
    }
}
