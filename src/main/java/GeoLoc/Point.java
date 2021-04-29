package GeoLoc;


/**
 * Classe que representa ...
 * 
 * @author Sergio Braga
 * @version 1.0
 * @since 2019-08-28
 *
 */
 
public class Point {

	/**
	 * Construtor
	 **/
	public Point (double pLatitude, double pLongitude){
		this.Latitude = pLatitude;
		this.Longitude = pLongitude;
	}
	
	private double Latitude;
	private double Longitude;

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return Longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.Longitude = longitude;
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return Latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.Latitude = latitude;
	}
}
