package datamodellers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LinkCanvas {
    private long crtMs;
    private String id;
    private String crtStoryId;
    private String crtTaskId;
    private String currentVersion;
    private String inAttributeId;
    private String inEntityId;
    private String microserviceId;
    private String outAttributeId;
    private String outEntityId;
    private String projectId;
    private String relationLinkId;
    private String releaseVersion;
    private long releasedDate;
    private List<Map<String, Number>> pointArr;
    
}

