package com.escola.escolaOnline.Service;

import com.escola.escolaOnline.Repository.UserRepository;
import com.escola.escolaOnline.models.UserEntity;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean adicionarAluno (String nome, String serie, int idade, int letivo, String email) {
        try {
            UserEntity user = new UserEntity();
            user.setNome(nome);
            user.setIdade(idade);
            user.setSerie(serie);
            user.setLetivo(letivo);
            user.setEmail(email);

            userRepository.save(user);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public List<UserEntity> listarAlunos() {
        return userRepository.findAll();
    }

    public List<UserEntity> buscarPorNome (String termo) {
        return userRepository.findByNomeContainingIgnoreCase(termo);
    }


}
