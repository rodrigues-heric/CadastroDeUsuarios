package com.rodrigues.heric.CadastroDeUsuarios.Users.Repository;

import com.rodrigues.heric.CadastroDeUsuarios.Users.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}
