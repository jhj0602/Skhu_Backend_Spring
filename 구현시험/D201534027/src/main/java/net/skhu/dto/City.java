package net.skhu.dto;

import java.util.List;
import lombok.Data;

@Data
public class City {
	int id;
	int districtId;
	String Name;
	int population;
	int area;
}