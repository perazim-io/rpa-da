package domain_model;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getMicroserviceId() {
        return microserviceId;
    }

    public void setMicroserviceId(String microserviceId) {
        this.microserviceId = microserviceId;
    }

    public String getMicroserviceName() {
        return microserviceName;
    }

    public void setMicroserviceName(String microserviceName) {
        this.microserviceName = microserviceName;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(String attributeId) {
        this.attributeId = attributeId;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Number getExternal() {
        return external;
    }

    public void setExternal(Number external) {
        this.external = external;
    }

    public Number getExternalRelationConfig() {
        return externalRelationConfig;
    }

    public void setExternalRelationConfig(Number externalRelationConfig) {
        this.externalRelationConfig = externalRelationConfig;
    }

    public Number getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(Number crtDt) {
        this.crtDt = crtDt;
    }

    public Number getUpdtDt() {
        return updtDt;
    }

    public void setUpdtDt(Number updtDt) {
        this.updtDt = updtDt;
    }

    public String getCrtTaskId() {
        return crtTaskId;
    }

    public void setCrtTaskId(String crtTaskId) {
        this.crtTaskId = crtTaskId;
    }

    public String getCrtStoryId() {
        return crtStoryId;
    }

    public void setCrtStoryId(String crtStoryId) {
        this.crtStoryId = crtStoryId;
    }

    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }
}
