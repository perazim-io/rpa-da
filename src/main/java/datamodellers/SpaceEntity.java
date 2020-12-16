package datamodellers;

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
    private Boolean lock;
    private Boolean lookUpData;
    private Boolean editable;
    private Boolean cacheable;
    private String currentVersion;
    private String releaseVersion;
    private Number releasedDate;
    private Number crtDt;
    private Number updtDt;

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

    public String getMicroserviceCode() {
        return microserviceCode;
    }

    public void setMicroserviceCode(String microserviceCode) {
        this.microserviceCode = microserviceCode;
    }

    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
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

    public String getUpdtStoryId() {
        return updtStoryId;
    }

    public void setUpdtStoryId(String updtStoryId) {
        this.updtStoryId = updtStoryId;
    }

    public String getUpdtTaskId() {
        return updtTaskId;
    }

    public void setUpdtTaskId(String updtTaskId) {
        this.updtTaskId = updtTaskId;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(String adminStatus) {
        this.adminStatus = adminStatus;
    }

    public String getPublishedStatus() {
        return publishedStatus;
    }

    public void setPublishedStatus(String publishedStatus) {
        this.publishedStatus = publishedStatus;
    }

    public Boolean getLock() {
        return lock;
    }

    public void setLock(Boolean lock) {
        this.lock = lock;
    }

    public Boolean getLookUpData() {
        return lookUpData;
    }

    public void setLookUpData(Boolean lookUpData) {
        this.lookUpData = lookUpData;
    }

    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public Boolean getCacheable() {
        return cacheable;
    }

    public void setCacheable(Boolean cacheable) {
        this.cacheable = cacheable;
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
}
