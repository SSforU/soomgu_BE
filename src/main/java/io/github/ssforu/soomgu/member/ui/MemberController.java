package io.github.ssforu.soomgu.member.ui;

import io.github.ssforu.soomgu.member.application.MemberService;
import io.github.ssforu.soomgu.member.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/user")
    public Map<String, Object> getUser() {
        UserResponse data = memberService.getFixedUser();

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("result", "success");
        body.put("message", "사용자 정보 조회 성공");
        body.put("data", data);
        return body;
    }
}
