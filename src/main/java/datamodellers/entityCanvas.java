package datamodellers;


public class entityCanvas {
    private String id;
    private String microserviceId;
    private String projectId;
    private String entityId;
    private String loc;
    private long crtMs;
    private String crtStoryId;
    private String crtTaskId;
    private String currentVersion;


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMicroserviceId() {
		return microserviceId;
	}
	public void setMicroserviceId(String microserviceId) {
		this.microserviceId = microserviceId;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getCrtTaskId() {
		return crtTaskId;
	}

	public void setCrtTaskId(String crtTaskId) {
		this.crtTaskId = crtTaskId;
	}

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

	public String getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
	}
}

