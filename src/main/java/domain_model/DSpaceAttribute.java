package domain_model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DSpaceAttribute {
    private String id;
    private String attributeCode;
    private String projectId;
    private String microserviceId;
    private String projectName;
    private String microserviceName;
    private String microserviceCode;
    private String entityId;
    private String entityName;
    private String crtdTaskId;
    private String updtdTaskId;
    private String crtTaskId;
    private String attrName;
    private String dataType;
    private String dispName;
    private Number minLength;
    private Number maxLength;
    private Number width;
    private Number precision;
    private Number in;
    private Number out;
    private Number required;
    private Number unique;
    private Number lca;
    private Number notNull;
    private Number rules;
    private Number routing;
    private Number audit;
    private Number realtimeUpdate;
    private Number searchable;
    private String adminStatus;
    private String publishedStatus;
    private Number lock;
    private String currentVersion;
    private String releaseVersion;
    private Number crtDt;
    private Number updtDt;
    private List<DRelationPort> spaceRelationPorts;
//    routingConfig?: RoutingConfig;
//    rulesConfig?: RulesConfig;
}
