package sharpie;

import java.util.List;

public class SharpieSet {
  private List<Sharpie> sharpieList;

  public int countUsable() {
    int usableSharpies = 0;
    for (Sharpie sharpie: sharpieList) {
      if(sharpie.inkAmount > 0){
        usableSharpies++;
      }
    }
    return usableSharpies;
  }
  public void removeTrash(){
    for (int i = 0; i < sharpieList.size(); i++) {
      if(sharpieList.get(i).inkAmount <= 0){
        sharpieList.remove(i);
      }
    }
  }
}
/*
  it contains a list of Sharpie
  countUsable() -> sharpie is usable if it has ink in it
        removeTrash() -> removes all unusable sharpies*/