package com.osgo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape
{
	private Point centre;
	
	public void draw()
	{
		System.out.println("Drawing Circle.");
		System.out.println("Circle with centre point at:" +"(" + centre.getX() + ", " + centre.getY() + ")" );
		
	} // end method draw

	public Point getCentre()
	{
		return centre;
	} // end method getCentre

	@Autowired	// Autowired is a post processor, defined in spring.xml
	@Qualifier("circleRelated")
	public void setCentre(Point centre)
	{
		this.centre = centre;
	} // end method setCentre

	
} // end Class Circle
