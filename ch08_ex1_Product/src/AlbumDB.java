
public class AlbumDB {
	public static Album getProduct(String albumCode) {
		
		Product p = null;
		
		if (albumCode.equalsIgnoreCase("Matellica") ||
				albumCode.equalsIgnoreCase("ShowTunes") ||
				albumCode.equalsIgnoreCase("Blues")) {
			Album a = new Album();
			if (albumCode.equalsIgnoreCase("Matellica")) {
				a.setCode(albumCode);
				a.setDescription("hard rock");
				a.setPrice(12.50);
			} 
			else if (albumCode.equalsIgnoreCase("ShowTunes")) {
				a.setCode(albumCode);
				a.setDescription("song");
				a.setPrice(9.99);
			}
			
			else if (albumCode.equalsIgnoreCase("Blues")) {
				a.setCode(albumCode);
				a.setDescription("mellow");
				a.setPrice(15.50);
			}
			p = a;
		}
		return (Album) p;
	}
}
