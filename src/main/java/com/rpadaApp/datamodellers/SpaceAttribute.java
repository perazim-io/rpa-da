package com.rpadaApp.datamodellers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class SpaceAttribute {
    private String id;
    private String attributeCode;
    private String entityCode;
    private String projectId;
    private String microserviceId;
    private String microserviceCode;
    private String entityId;
    private String crtTaskId;
    private String crtStoryId;
    private String attrName;
    private String dataType;
    private String dispName;
    private Number minLength;
    private Number maxLength;
    private Number width;
    private Number precision;
    private int in;
    private int out;
    private int required;
    private int unique;
    private int lca;
    private int notNull;
    private int rules;
    private int routing;
    private int audit;
    private int realtimeUpdate;
    private int searchable;
    private String adminStatus;
    private String publishedStatus;
    private int lock;
    private String currentVersion;
    private String releaseVersion;
    private Number releasedDate;
    private Number crtDt;
    private Number updtDt;
}
