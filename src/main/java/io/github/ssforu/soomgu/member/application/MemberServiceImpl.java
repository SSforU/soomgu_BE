package io.github.ssforu.soomgu.member.application;

import io.github.ssforu.soomgu.member.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    @Value("${soomgu.user.id:1}") // 키 : 디폴드밸류로 설정
    private Long userId;

    @Value("${soomgu.user.username:ssulion}")
    private String username;

    @Value("${soomgu.user.email:ssulion@example.com}")
    private String email;

    @Override
    public UserResponse getFixedUser() {
        return UserResponse.builder()
                .userId(userId)
                .username(username)
                .email(email)
                .createdAt(Instant.now())
                .build();
    }

}
