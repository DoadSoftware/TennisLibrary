package com.tennis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Worksheet", namespace = "urn:schemas-microsoft-com:office:excel")
@XmlAccessorType(XmlAccessType.FIELD)
public class Worksheet {
	
	@XmlElement(name = "Table",namespace = "urn:schemas-microsoft-com:office:spreadsheet")
	private Table Table;

	public Table getTable() {
		return Table;
	}

	public void setTable(Table table) {
		Table = table;
	}

	@Override
	public String toString() {
		return "Worksheet [Table=" + Table + "]";
	}

	
}

