package br.com.john.projetobancobackend.adapters.dto;

import br.com.john.projetobancobackend.core.domain.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}