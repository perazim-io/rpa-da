package datamodellers;

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

    public String getMicroserviceId() {
        return microserviceId;
    }

    public void setMicroserviceId(String microserviceId) {
        this.microserviceId = microserviceId;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(String attributeId) {
        this.attributeId = attributeId;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Boolean getExternal() {
        return external;
    }

    public void setExternal(Boolean external) {
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

    public String getReleaseVersion() {
        return releaseVersion;
    }

    public void setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public Number getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(Number releasedDate) {
        this.releasedDate = releasedDate;
    }
}
