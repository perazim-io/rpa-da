package com.rpadaApp.datamodellers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class MicroServiceDetails {
    private long crtMs;
    private String microserviceId;
    private String microserviceName;
    private String projectCode;
    private String projectId;
    private String projectName;
}
