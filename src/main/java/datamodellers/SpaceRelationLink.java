package datamodellers;

public class SpaceRelationLink {
    private String id;
    private String linkType;
    private String inProjectId;
    private String inMicroserviceId;
    private String inRelationPortId;
    private String inEntityId;
    private String inAttributeId;
    private String outProjectId;
    private String outMicroserviceId;
    private String outRelationPortId;
    private String outEntityId;
    private String outAttributeId;
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

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public String getInProjectId() {
        return inProjectId;
    }

    public void setInProjectId(String inProjectId) {
        this.inProjectId = inProjectId;
    }

    public String getInMicroserviceId() {
        return inMicroserviceId;
    }

    public void setInMicroserviceId(String inMicroserviceId) {
        this.inMicroserviceId = inMicroserviceId;
    }

    public String getInRelationPortId() {
        return inRelationPortId;
    }

    public void setInRelationPortId(String inRelationPortId) {
        this.inRelationPortId = inRelationPortId;
    }

    public String getInEntityId() {
        return inEntityId;
    }

    public void setInEntityId(String inEntityId) {
        this.inEntityId = inEntityId;
    }

    public String getInAttributeId() {
        return inAttributeId;
    }

    public void setInAttributeId(String inAttributeId) {
        this.inAttributeId = inAttributeId;
    }

    public String getOutProjectId() {
        return outProjectId;
    }

    public void setOutProjectId(String outProjectId) {
        this.outProjectId = outProjectId;
    }

    public String getOutMicroserviceId() {
        return outMicroserviceId;
    }

    public void setOutMicroserviceId(String outMicroserviceId) {
        this.outMicroserviceId = outMicroserviceId;
    }

    public String getOutRelationPortId() {
        return outRelationPortId;
    }

    public void setOutRelationPortId(String outRelationPortId) {
        this.outRelationPortId = outRelationPortId;
    }

    public String getOutEntityId() {
        return outEntityId;
    }

    public void setOutEntityId(String outEntityId) {
        this.outEntityId = outEntityId;
    }

    public String getOutAttributeId() {
        return outAttributeId;
    }

    public void setOutAttributeId(String outAttributeId) {
        this.outAttributeId = outAttributeId;
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
