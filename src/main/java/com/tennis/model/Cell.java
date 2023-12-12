package com.tennis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Cell",namespace = "urn:schemas-microsoft-com:office:excel")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cell {
	
	@XmlElement(name = "Data",namespace = "urn:schemas-microsoft-com:office:spreadsheet")
	private String Data;

	public String getData() {
		return Data;
	}

	public void setData(String data) {
		Data = data;
	}

	@Override
	public String toString() {
		return "Cell [Data=" + Data + "]";
	}

}

