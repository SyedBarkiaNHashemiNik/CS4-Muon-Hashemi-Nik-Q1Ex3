public class Singer {

  String name;
  int numberOfPerformances;
  double earnings; 
  Song favoriteSong;
  
  public void performForAudience(int a) {
    numberOfPerformances += 1;
    earnings += 100 * a;
  }
  
   
  public void changeFavSong(String a, String b, String c, String d) {
    favoriteSong = new Song(a, b, c);
    name = d;
  } 
}