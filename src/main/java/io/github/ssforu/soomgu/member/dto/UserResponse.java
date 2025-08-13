package io.github.ssforu.soomgu.member.dto;

import lombok.*;

import java.time.Instant;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class UserResponse {

    private Long userId;
    private String username;
    private String email;
    private Instant createdAt;
}
