package domain_model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DRelationPort {
    private String id;
    private String projectId;
    private String projectName;
    private String microserviceId;
    private String microserviceName;
    private String entityId;
    private String entityName;
    private String attributeId;
    private String attributeName;
    private String port;
    private Number external;
    private Number externalRelationConfig;
    private Number crtDt;
    private Number updtDt;
//    inLinks: DSpaceRelationLink[];
//    outLinks: DSpaceRelationLink[];
    private String crtTaskId;
    private String crtStoryId;
    private String currentVersion;

}
