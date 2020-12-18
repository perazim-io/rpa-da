package io.perazim.rpada;

import com.google.gson.stream.JsonToken;
import datamodellers.EntityCanvas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class RpaDaApplication {

	public static void main(String[] args) {

		SpringApplication.run(RpaDaApplication.class, args);

//		GetEntityCanvasData.getInstance().init();
//		if(GetEntityCanvasData.getInstance().isDataLoaded()){
//			GetEntityCanvasData.getInstance().makeEntCanvasData();
//		}


//		GetLinkCanvasData.getInstance().init();
//		if(GetLinkCanvasData.getInstance().isDataLoaded()){
//			GetLinkCanvasData.getInstance().makeLinkCanvasData();
//		}
//
//		GetSpaceEntityData.getInstance().init();
//		if(GetSpaceEntityData.getInstance().isDataLoaded()){
//			GetSpaceEntityData.getInstance().makeSpaceEntityData();
//		}
//
//		GetSpaceAttributeData.getInstance().init();
//		if(GetSpaceAttributeData.getInstance().isDataLoaded()){
//			GetSpaceAttributeData.getInstance().makeSpaceAttributeData();
//		}
//
//		GetSpaceRelationPortData.getInstance().init();
//		if(GetSpaceRelationPortData.getInstance().isDataLoaded()){
//			GetSpaceRelationPortData.getInstance().makeSpaceRelationPortData();
//		}
//
		GetSpaceRelationLinkData.getInstance().init();
		if(GetSpaceRelationLinkData.getInstance().isDataLoaded()){
			GetSpaceRelationLinkData.getInstance().makeSpaceRelationLinkData();
		}
	}

}
