package datamodellers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpaceEntity {
    private String adminStatus;
    private String bucket;
    private int cacheable;
    private String StringcrtMicroserviceCode;
    private long crtMs;
    private String crtProjectCode;
    private String crtStoryCode;
    private String crtStoryId;
    private String crtTaskCode;
    private String crtTaskId;
    private String currentVersion;
    private String editable;
    private String entityCode;
    private String entityName;
    private String lookUpData;
    private String microserviceId;
    private String projectId;
    private String releaseVersion;
   }
