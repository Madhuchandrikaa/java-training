package com.atria.day9Abstraction;

public class Square extends Shape {
	private float side;
	public Square()
	{
		this.side=2.0f;
	}
	
	void calArea() {
		area=side*side;
	}
}
