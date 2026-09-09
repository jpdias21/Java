package com.JpaHibernate.project.dto;

/** JSON recebido ao criar ou atualizar um usuário. */
public record UserRequest(String name, String email) {
}
