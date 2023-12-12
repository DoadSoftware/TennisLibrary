package com.tennis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Workbook", namespace = "urn:schemas-microsoft-com:office:spreadsheet")
@XmlAccessorType(XmlAccessType.FIELD)
public class WorkBook {
	
	@XmlElement(name = "Worksheet",namespace = "urn:schemas-microsoft-com:office:spreadsheet")
	private Worksheet Worksheet;

	public Worksheet getWorksheet() {
		return Worksheet;
	}

	public void setWorksheet(Worksheet worksheet) {
		Worksheet = worksheet;
	}

}

