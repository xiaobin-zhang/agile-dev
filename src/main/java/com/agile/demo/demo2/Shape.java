package com.agile.demo.demo2;

import java.awt.Point;

import lombok.Data;
@Data
public class Shape {
	final static int TYPELINE = 0;
	
	final static int TYPERECTANGLE = 1;
	
	final static int TYPECIRCLE = 2;
	
	int shapType;
	
	Point p1;
	
	Point p2;
	
	int radius;
	
}
