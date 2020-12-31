package com.rpadaApp.datamodellers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class EntityCanvas {
    private String id;
    private String microserviceId;
    private String projectId;
    private String entityId;
    private String loc;
    private long crtMs;
    private String crtStoryId;
    private String crtTaskId;
    private String currentVersion;

}

