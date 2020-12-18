package domain_model;

public class DRelationLink {

    private String id ;
    private String linkType;
    private String inRelationPortId;
    private String inProjectId;
    private String inProjectName;
    private String inMicroserviceId;
    private String inMicroserviceName;
    private String inEntityId;
    private String inEntityName;
    private String inAttributeId;
    private String inAttributeName;
    private String outRelationPortId;
    private String outProjectId;
    private String outProjectName;
    private String outMicroserviceId;
    private String outMicroserviceName;
    private String outEntityId;
    private String outEntityName;
    private String outAttributeId;
    private String outAttributeName;
    private Number crtDt;
    private Number updtDt;
//    linkCanvasData: LinkCanvas;
    private String crtTaskId;
    private String crtStoryId;
    private String currentVersion;

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

    public String getInRelationPortId() {
        return inRelationPortId;
    }

    public void setInRelationPortId(String inRelationPortId) {
        this.inRelationPortId = inRelationPortId;
    }

    public String getInProjectId() {
        return inProjectId;
    }

    public void setInProjectId(String inProjectId) {
        this.inProjectId = inProjectId;
    }

    public String getInProjectName() {
        return inProjectName;
    }

    public void setInProjectName(String inProjectName) {
        this.inProjectName = inProjectName;
    }

    public String getInMicroserviceId() {
        return inMicroserviceId;
    }

    public void setInMicroserviceId(String inMicroserviceId) {
        this.inMicroserviceId = inMicroserviceId;
    }

    public String getInMicroserviceName() {
        return inMicroserviceName;
    }

    public void setInMicroserviceName(String inMicroserviceName) {
        this.inMicroserviceName = inMicroserviceName;
    }

    public String getInEntityId() {
        return inEntityId;
    }

    public void setInEntityId(String inEntityId) {
        this.inEntityId = inEntityId;
    }

    public String getInEntityName() {
        return inEntityName;
    }

    public void setInEntityName(String inEntityName) {
        this.inEntityName = inEntityName;
    }

    public String getInAttributeId() {
        return inAttributeId;
    }

    public void setInAttributeId(String inAttributeId) {
        this.inAttributeId = inAttributeId;
    }

    public String getInAttributeName() {
        return inAttributeName;
    }

    public void setInAttributeName(String inAttributeName) {
        this.inAttributeName = inAttributeName;
    }

    public String getOutRelationPortId() {
        return outRelationPortId;
    }

    public void setOutRelationPortId(String outRelationPortId) {
        this.outRelationPortId = outRelationPortId;
    }

    public String getOutProjectId() {
        return outProjectId;
    }

    public void setOutProjectId(String outProjectId) {
        this.outProjectId = outProjectId;
    }

    public String getOutProjectName() {
        return outProjectName;
    }

    public void setOutProjectName(String outProjectName) {
        this.outProjectName = outProjectName;
    }

    public String getOutMicroserviceId() {
        return outMicroserviceId;
    }

    public void setOutMicroserviceId(String outMicroserviceId) {
        this.outMicroserviceId = outMicroserviceId;
    }

    public String getOutMicroserviceName() {
        return outMicroserviceName;
    }

    public void setOutMicroserviceName(String outMicroserviceName) {
        this.outMicroserviceName = outMicroserviceName;
    }

    public String getOutEntityId() {
        return outEntityId;
    }

    public void setOutEntityId(String outEntityId) {
        this.outEntityId = outEntityId;
    }

    public String getOutEntityName() {
        return outEntityName;
    }

    public void setOutEntityName(String outEntityName) {
        this.outEntityName = outEntityName;
    }

    public String getOutAttributeId() {
        return outAttributeId;
    }

    public void setOutAttributeId(String outAttributeId) {
        this.outAttributeId = outAttributeId;
    }

    public String getOutAttributeName() {
        return outAttributeName;
    }

    public void setOutAttributeName(String outAttributeName) {
        this.outAttributeName = outAttributeName;
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
