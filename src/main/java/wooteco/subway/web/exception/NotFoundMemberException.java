package wooteco.subway.web.exception;

public class NotFoundMemberException extends AuthenticationException {

    public static final String ERROR_MESSAGE = " 회원님을 찾을 수 없습니다.";

    public NotFoundMemberException() {
        super(ERROR_MESSAGE);
    }

    public NotFoundMemberException(String email) {
        super(email + ERROR_MESSAGE);
    }
}
