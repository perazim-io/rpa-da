package domain_model;

public class DSpaceEntity {
    private String id;
    private String projectId;
    private String projectName;
    private String microserviceId;
    private String microserviceCode;
    private String microserviceName;
    private String entityName;
    private String entityCode;
    private String adminStatus;
    private String publishedStatus;
    private String currentVersion;
    private String releaseVersion;
    private Number lookUpData;
    private Number lock;
    private Number cacheable;
    private Number crtDt;
    private Number updtDt;
//    canvasData: EntityCanvas;
//    spaceAttributes: DSpaceAttribute[];

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

    public String getMicroserviceCode() {
        return microserviceCode;
    }

    public void setMicroserviceCode(String microserviceCode) {
        this.microserviceCode = microserviceCode;
    }

    public String getMicroserviceName() {
        return microserviceName;
    }

    public void setMicroserviceName(String microserviceName) {
        this.microserviceName = microserviceName;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
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

    public Number getLookUpData() {
        return lookUpData;
    }

    public void setLookUpData(Number lookUpData) {
        this.lookUpData = lookUpData;
    }

    public Number getLock() {
        return lock;
    }

    public void setLock(Number lock) {
        this.lock = lock;
    }

    public Number getCacheable() {
        return cacheable;
    }

    public void setCacheable(Number cacheable) {
        this.cacheable = cacheable;
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
//    canvasData: EntityCanvas;
//    spaceAttributes: DSpaceAttribute[];
//    dmch?: DDmch[];
}
