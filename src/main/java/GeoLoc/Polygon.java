package GeoLoc;

import java.util.ArrayList;

/**
 * Classe que representa ...
 * 
 * @author Sergio Braga
 * @version 1.0
 * @since 2019-08-28
 *
 */
 
public class Polygon {

	/**
	 * Construtor
	 **/
	public Polygon (){
		this.Points = new ArrayList<Point>();
	}

	private ArrayList<Point> Points;

	/**
	 * @return the points
	 */
	public ArrayList<Point> getPoints() {
		return Points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(ArrayList<Point> points) {
		this.Points = points;
	}


	public boolean IsPointInPolygon(Point pPoint, Polygon pPolygon)
	{
		int totalPoints = pPolygon.Points.size();
		boolean isInside = false;

		for ( int i = -1, j = totalPoints - 1; ++i < totalPoints; j = i )
		{
			if (((GetLongitude(pPolygon.Points.get(i)) <= GetLongitude(pPoint)
						&& GetLongitude(pPoint) < GetLongitude(pPolygon.Points.get(j)))
					||
					(GetLongitude(pPolygon.Points.get(j)) <= GetLongitude(pPoint)
						&& GetLongitude(pPoint) < GetLongitude(pPolygon.Points.get(i))))
				&&
				GetLatitude(pPoint) <
				((GetLatitude(pPolygon.Points.get(j)) - GetLatitude(pPolygon.Points.get(i))) * (GetLongitude(pPoint) - GetLongitude(pPolygon.Points.get(i)))) /
				(GetLongitude(pPolygon.Points.get(j)) - GetLongitude(pPolygon.Points.get(i))) + GetLatitude(pPolygon.Points.get(i)))
			{
				isInside = !isInside;
			}
		}
		return isInside;
	}

	private double GetLatitude(Point pPoint)
	{
		return pPoint.getLatitude();
	}

	private double GetLongitude(Point pPoint)
	{
		return pPoint.getLongitude();
	}
}
