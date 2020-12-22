package datamodellers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpaceEntity {
    private String id;
    private String projectId;
    private String microserviceId;
    private String microserviceCode;
    private String entityCode;
    private String crtStoryId;
    private String crtTaskId;
    private String updtStoryId;
    private String updtTaskId;
    private String entityName;
    private String adminStatus;
    private String publishedStatus;
    private int lock;
    private int lookUpData;
    private int editable;
    private int cacheable;
//    private String currentVersion;
//    private String releaseVersion;
//    private Number releasedDate;
    private Number crtDt;
    private Number updtDt;

   }
