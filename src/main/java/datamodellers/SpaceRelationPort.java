package datamodellers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class SpaceRelationPort {
    private String id;
    private String projectId;
    private String microserviceId;
    private String entityId;
    private String attributeId;
    private String port;
    private Boolean external;
    private Number externalRelationConfig;
    private Number crtDt;
    private Number updtDt;
    private String crtTaskId;
    private String crtStoryId;
    private String currentVersion;
    private String releaseVersion;
    private Number releasedDate;

}
