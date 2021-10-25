import java.util.ArrayList;

/*
You’re heading to a desert island, cut off from the world, for the next six months. Luckily, you can bring a playlist of your favorite music ♪♪

*/

class Playlist {
  
  public static void main(String[] args) {
    //Create a new ArrayList that hold String values
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    //Add songs
    desertIslandPlaylist.add("Halo");
    desertIslandPlaylist.add("Nonghao");
    desertIslandPlaylist.add("Aloha");
    desertIslandPlaylist.add("Cool");
    desertIslandPlaylist.add("Beautiful");
    desertIslandPlaylist.add("Great");
    //Print it
    System.out.println(desertIslandPlaylist);
    //Check the number of songs
    System.out.println(desertIslandPlaylist.size());
    //Remove an item
    desertIslandPlaylist.remove(1);
    //Swap two songs using index
    int indexA = desertIslandPlaylist.indexOf("Halo");
    int indexB = desertIslandPlaylist.indexOf("Cool");
    String tempA = "Halo";
    desertIslandPlaylist.set(indexA, "Cool");
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);





  }
  
}
