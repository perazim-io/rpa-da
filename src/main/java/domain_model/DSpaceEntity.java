package domain_model;

import datamodellers.EntityCanvas;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

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
    private EntityCanvas canvasData;
    private List<DSpaceAttribute> spaceAttributes;
}
