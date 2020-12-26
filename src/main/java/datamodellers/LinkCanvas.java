package datamodellers;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class LinkCanvas {
    private long crtMs;
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

    public long getCrtMs() {
        return crtMs;
    }

    public void setCrtMs(long crtMs) {
        this.crtMs = crtMs;
    }

    public String getCrtStoryId() {
        return crtStoryId;
    }

    public void setCrtStoryId(String crtStoryId) {
        this.crtStoryId = crtStoryId;
    }

    public String getCrtTaskId() {
        return crtTaskId;
    }

    public void setCrtTaskId(String crtTaskId) {
        this.crtTaskId = crtTaskId;
    }

    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    public String getInAttributeId() {
        return inAttributeId;
    }

    public void setInAttributeId(String inAttributeId) {
        this.inAttributeId = inAttributeId;
    }

    public String getInEntityId() {
        return inEntityId;
    }

    public void setInEntityId(String inEntityId) {
        this.inEntityId = inEntityId;
    }

    public String getMicroserviceId() {
        return microserviceId;
    }

    public void setMicroserviceId(String microserviceId) {
        this.microserviceId = microserviceId;
    }

    public String getOutAttributeId() {
        return outAttributeId;
    }

    public void setOutAttributeId(String outAttributeId) {
        this.outAttributeId = outAttributeId;
    }

    public String getOutEntityId() {
        return outEntityId;
    }

    public void setOutEntityId(String outEntityId) {
        this.outEntityId = outEntityId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getRelationLinkId() {
        return relationLinkId;
    }

    public void setRelationLinkId(String relationLinkId) {
        this.relationLinkId = relationLinkId;
    }
}