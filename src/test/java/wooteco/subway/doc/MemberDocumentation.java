package wooteco.subway.doc;

import static org.springframework.restdocs.headers.HeaderDocumentation.*;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.*;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;
import static wooteco.subway.doc.ApiDocumentUtils.*;
import static wooteco.subway.doc.DocumentFormatGenerator.*;

import org.springframework.restdocs.mockmvc.RestDocumentationResultHandler;
import org.springframework.restdocs.payload.JsonFieldType;

public class MemberDocumentation {
    public static RestDocumentationResultHandler createMember() {
        return document("members/create",
            getDocumentRequest(),
            getDocumentResponse(),
            requestFields(
                fieldWithPath("email").type(JsonFieldType.STRING)
                    .description("The user's email address").attributes(getEmailFormat()),
                fieldWithPath("name").type(JsonFieldType.STRING).description("The user's name"),
                fieldWithPath("password").type(JsonFieldType.STRING)
                    .description("The user's password"),
                fieldWithPath("passwordCheck").type(JsonFieldType.STRING)
                    .description("The user's passwordCheck")
            ),
            responseHeaders(
                headerWithName("Location").description("The user's location who just created")
            )
        );
    }

    public static RestDocumentationResultHandler createFail(String url) {
        return document(url,
            getDocumentRequest(),
            getDocumentResponse(),
            requestFields(
                fieldWithPath("email").type(JsonFieldType.STRING)
                    .description("The user's email address").attributes(getEmailFormat()),
                fieldWithPath("name").type(JsonFieldType.STRING).description("The user's name"),
                fieldWithPath("password").type(JsonFieldType.STRING)
                    .description("The user's password"),
                fieldWithPath("passwordCheck").type(JsonFieldType.STRING)
                    .description("The user's passwordCheck")
            ),
            responseFields(
                fieldWithPath("message").type(JsonFieldType.STRING)
                    .description("The error message")
            )
        );
    }

    public static RestDocumentationResultHandler login() {
        return document("members/login",
            getDocumentRequest(),
            getDocumentResponse(),
            requestFields(
                fieldWithPath("email").type(JsonFieldType.STRING)
                    .description("The user's email")
                    .attributes(getEmailFormat()),
                fieldWithPath("password").type(JsonFieldType.STRING)
                    .description("The user's password")
            ),
            responseFields(
                fieldWithPath("accessToken").type(JsonFieldType.STRING)
                    .description("The user's accessToken"),
                fieldWithPath("tokenType").type(JsonFieldType.STRING)
                    .description("The type of accessToken")
            )
        );
    }

    public static RestDocumentationResultHandler loginFail(String url) {
        return document(url,
            getDocumentRequest(),
            getDocumentResponse(),
            requestFields(
                fieldWithPath("email").type(JsonFieldType.STRING)
                    .description("The user's email")
                    .attributes(getEmailFormat()),
                fieldWithPath("password").type(JsonFieldType.STRING)
                    .description("The user's password")
            ),
            responseFields(
                fieldWithPath("message").type(JsonFieldType.STRING)
                    .description("The exception message")
            )
        );
    }

    public static RestDocumentationResultHandler getMember() {
        return document("members/get",
            getDocumentRequest(),
            getDocumentResponse(),
            responseFields(
                fieldWithPath("id").type(JsonFieldType.NUMBER).description("The user's id"),
                fieldWithPath("email").type(JsonFieldType.STRING)
                    .description("The user's email")
                    .attributes(getEmailFormat()),
                fieldWithPath("name").type(JsonFieldType.STRING).description("The user's name")
            )
        );
    }

    public static RestDocumentationResultHandler getFail(String url) {
        return document(url,
            getDocumentRequest(),
            getDocumentResponse(),
            responseFields(
                fieldWithPath("message").type(JsonFieldType.STRING)
                    .description("The error message")
            )
        );
    }

    public static RestDocumentationResultHandler updateMember() {
        return document("members/update",
            getDocumentRequest(),
            getDocumentResponse(),
            requestFields(
                fieldWithPath("name").type(JsonFieldType.STRING).description("The user's name"),
                fieldWithPath("oldPassword").type(JsonFieldType.STRING)
                    .description("The user's old password"),
                fieldWithPath("newPassword").type(JsonFieldType.STRING)
                    .description("The user's new password")
            )
        );
    }

    public static RestDocumentationResultHandler updateFail(String url) {
        return document(url,
            getDocumentRequest(),
            getDocumentResponse(),
            requestFields(
                fieldWithPath("name").type(JsonFieldType.STRING).description("The user's name"),
                fieldWithPath("oldPassword").type(JsonFieldType.STRING)
                    .description("The user's old password"),
                fieldWithPath("newPassword").type(JsonFieldType.STRING)
                    .description("The user's new password")
            ),
            responseFields(
                fieldWithPath("message").type(JsonFieldType.STRING)
                    .description("The error message")
            )
        );
    }

    public static RestDocumentationResultHandler deleteMember() {
        return document("members/delete",
            getDocumentRequest(),
            getDocumentResponse()
        );
    }

    public static RestDocumentationResultHandler deleteFail(String url) {
        return document(url,
            getDocumentRequest(),
            getDocumentResponse(),
            responseFields(
                fieldWithPath("message").type(JsonFieldType.STRING)
                    .description("The error message")
            )
        );
    }
}