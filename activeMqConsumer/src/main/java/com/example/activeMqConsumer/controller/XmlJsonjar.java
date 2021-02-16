package com.example.activeMqConsumer.controller;

import org.json.JSONObject;
import org.json.XML;

public class XmlJsonjar {

	public static void main(String[] args) {
		String hi = "<squadName>Super hero squad</squadName><secretBase>Super tower</secretBase><homeTown>Metro City</homeTown><members><secretIdentity>Dan Jukes</secretIdentity><name>Molecule Man</name><powers>Radiation resistance</powers><powers>Turning tiny</powers><powers>Radiation blast</powers><age>29</age></members><members><secretIdentity>Jane Wilson</secretIdentity><name>Madame Uppercut</name><powers>Million tonne punch</powers><powers>Damage resistance</powers><powers>Superhuman reflexes</powers><age>39</age></members><members><secretIdentity>Unknown</secretIdentity><name>Eternal Flame</name><powers>Immortality</powers><powers>Heat Immunity</powers><powers>Inferno</powers><powers>Teleportation</powers><powers>Interdimensional travel</powers><age>1000000</age></members><active>true</active><formed>2016</formed>";

		JSONObject jsonObject = XML.toJSONObject(hi);

		String xmlJson=jsonObject.toString();
		
		System.out.println(xmlJson);
		 
	}

}
