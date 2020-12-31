package com.rpadaApp.domain_model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Domain {

    private String microServiceId;
    private List<DSpaceEntity> dSpaceEntities;


}
