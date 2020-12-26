package datamodellers;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
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
    private int lock;
    private int lookUpData;
    private int editable;
    private int cacheable;
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

    public int getLock() {
        return lock;
    }

    public void setLock(int lock) {
        this.lock = lock;
    }

    public int getLookUpData() {
        return lookUpData;
    }

    public void setLookUpData(int lookUpData) {
        this.lookUpData = lookUpData;
    }

    public int getEditable() {
        return editable;
    }

    public void setEditable(int editable) {
        this.editable = editable;
    }

    public int getCacheable() {
        return cacheable;
    }

    public void setCacheable(int cacheable) {
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
}
