package wooteco.subway.web.service.favorite.dto;

import javax.validation.constraints.NotBlank;

public class FavoriteRequest {

    @NotBlank
    private String sourceName;

    @NotBlank
    private String targetName;

    public FavoriteRequest() {
    }

    public FavoriteRequest(String sourceName, String targetName) {
        this.sourceName = sourceName;
        this.targetName = targetName;
    }

    public String getSourceName() {
        return sourceName;
    }

    public String getTargetName() {
        return targetName;
    }
}
