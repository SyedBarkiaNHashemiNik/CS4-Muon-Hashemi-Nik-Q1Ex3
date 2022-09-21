import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String singerName;
    String favSong = "";
    String favSongGenre = "";
    String favSongWriter = "";
    
    char choice = 'n';
    int numOfPeople = 12;
    Singer singerDetails = new Singer();
    
    Judges judge1 = new Judges("Tatiana", "Rock", 42);
    Judges judge2 = new Judges("DJ Subatomic Supernova", "Disco", 567);
    Judges judge3 = new Judges("Yinu", "Classical", 3);
    Scanner myInput = new Scanner(System.in);

    Song chosenSong1 = new Song("Somewhere Over the Rainbow", "Reggae", "Israel Kamakawiwo'ole");
    Song chosenSong2 = new Song("Heartaches", "Pop", "Al Bowlly");
    Song chosenSong3 = new Song("Remember Me", "Mariachi/lullaby/pop", "Kristen Anderson Lopez and Robert Lopes");
     
    System.out.println("Introducing today's judges: ");
    System.out.println(judge1.name + "\n" + "Likes: " + judge1.likes + "\n" + "Age: " + judge1.age + "\n");
    System.out.println(judge2.name + "\n" + "Likes: " + judge2.likes + "\n" + "Age: " + judge2.age + "\n");
    System.out.println(judge3.name + "\n" + "Likes: " + judge3.likes + "\n" + "Age: " + judge3.age + "\n");
    
    
    System.out.print("These are today's most popular songs: " + chosenSong1.songName + ", " + chosenSong2.songName + ", " + chosenSong3.songName + "\n");
    System.out.print("Please input your singer: ");
    singerName = myInput.nextLine();
    System.out.print("Please input your singer's favorite song: ");
    favSong = myInput.nextLine();
    System.out.print("Please input the song's genre: ");
    favSongGenre = myInput.nextLine();
    System.out.print("Please input the song's writer: ");
    favSongWriter = myInput.nextLine();
    
    System.out.println();
    
    
    do {
      System.out.println("\n");
      
      if (choice == 'y') {  
        favSong = "";
        favSongGenre = "";
        favSongWriter = "";
        numOfPeople = 0;

        do {
          System.out.println("Please input the amount of people attending: ");
          numOfPeople = myInput.nextInt();  
        } while (numOfPeople < 0);
          
        myInput.nextLine(); //Not adding this line of "junk" code causes the entire do-while loop to execute before asking for the favSong input.
        System.out.print("Please input your singer's favorite song: ");
        favSong = myInput.nextLine();
        System.out.print("Please input the song's genre: ");
        favSongGenre = myInput.nextLine();
        System.out.print("Please input the song's writer: ");
        favSongWriter = myInput.nextLine();
      }      

      singerDetails.performForAudience(numOfPeople);
      singerDetails.changeFavSong(favSong, favSongGenre, favSongWriter, singerName);
      
      System.out.println("Singer: " + singerDetails.name + "\n" + "Earnings: " + singerDetails.earnings + "\n" + "Number of performances: " + singerDetails.numberOfPerformances + "\n" + singerDetails.favoriteSong + "\n");
      
      System.out.print("Would you like to adjust the number of people and the favorite song?: ");
      choice = myInput.next().charAt(0);
    } while (choice == 'y');
  }
}