public class Song {
  String songName;
  String songGenre;
  String songWriter;
 
  public Song(String a, String b, String c) {
    songName = a;
    songGenre = b;
    songWriter = c;
  }

  public String toString(){
    return "Song: " + this.songName + "\n" + "Genre: " + this.songGenre + "\n" + "Writer: " + this.songWriter;
  }

}
