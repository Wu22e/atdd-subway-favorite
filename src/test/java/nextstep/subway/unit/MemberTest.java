package nextstep.subway.unit;

import nextstep.member.domain.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class MemberTest {

    @DisplayName("일치하지 않는 비밀번호 요청 시 예외가 발생한다.")
    @Test
    void validatePassword() {
        // given
        Member member = new Member("email@email.com", "password", 29);

        // when & then
        assertThatThrownBy(() -> member.validatePassword("password1")).isInstanceOf(RuntimeException.class);
    }
}
