package com.tennis.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Row",namespace = "urn:schemas-microsoft-com:office:excel")
@XmlAccessorType(XmlAccessType.FIELD)
public class Row {
	
	@XmlElement(name = "Cell",namespace = "urn:schemas-microsoft-com:office:spreadsheet")
	private List<Cell> Cell;

	public List<Cell> getCell() {
		return Cell;
	}

	public void setCell(List<Cell> cell) {
		Cell = cell;
	}

	@Override
	public String toString() {
		return "Row [Cell=" + Cell + "]";
	}
	
}

