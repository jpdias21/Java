package com.JpaHibernate.project.dto;

/** JSON devolvido pela API. */
public record UserResponse(Long id, String name, String email) {
}
