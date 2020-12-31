package com.rpadaApp.datamodellers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

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
}
