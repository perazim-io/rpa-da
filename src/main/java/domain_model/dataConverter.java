package domain_model;


import datamodellers.SpaceRelationLink;

import java.util.ArrayList;
import java.util.List;

public class dataConverter {
    private static dataConverter _instance;

    public static dataConverter getInstance(){
        if (_instance == null) {
            _instance = new dataConverter();
        }
        return _instance;
    }

    private dataConverter(){

    }
}
