package com.JpaHibernate.project.service;

import com.JpaHibernate.project.dto.UserRequest;
import com.JpaHibernate.project.dto.UserResponse;
import com.JpaHibernate.project.entity.Users;
import com.JpaHibernate.project.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

/** Onde ficam as regras do CRUD de usuários. */
@Service
public class UsersService {

    private final UsersRepository repository;

    public UsersService(UsersRepository repository) {
        this.repository = repository;
    }

    public UserResponse create(UserRequest request) {
        validate(request);
        String email = request.email().trim();

        if (repository.existsByEmail(email)) {
            throw new IllegalStateException("E-mail já cadastrado");
        }

        Users user = new Users(request.name().trim(), email);
        return toResponse(repository.save(user));
    }

    public List<UserResponse> findAll() {
        return repository.findAll().stream()
                .map(this::toResponse)
                .toList();
    }

    public UserResponse findById(Long id) {
        return toResponse(findEntityById(id));
    }

    public UserResponse update(Long id, UserRequest request) {
        validate(request);
        Users user = findEntityById(id);
        String email = request.email().trim();

        if (!user.getEmail().equalsIgnoreCase(email) && repository.existsByEmail(email)) {
            throw new IllegalStateException("E-mail já cadastrado");
        }

        user.setName(request.name().trim());
        user.setEmail(email);
        return toResponse(repository.save(user));
    }

    public void delete(Long id) {
        repository.delete(findEntityById(id));
    }

    private Users findEntityById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Usuário não encontrado"));
    }

    private void validate(UserRequest request) {
        if (request == null || request.name() == null || request.name().isBlank()
                || request.email() == null || request.email().isBlank()) {
            throw new IllegalArgumentException("Nome e e-mail são obrigatórios");
        }
    }

    private UserResponse toResponse(Users user) {
        return new UserResponse(user.getId(), user.getName(), user.getEmail());
    }
}
