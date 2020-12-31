package com.rpadaApp.domain_model;

import com.rpadaApp.datamodellers.LinkCanvas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

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
    private LinkCanvas linkCanvasData;
    private String crtTaskId;
    private String crtStoryId;
    private String currentVersion;

}
