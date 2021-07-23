//make sure the classes are public
class Outside {
  int a = 0;
  
  class Inside {
    int b = 5;  
  }
}

public class InnerStellar {
  public static void main(String[] args){
    Outside o = new Outside();
    Outside.Insode i = o.new Inside();
    System.out.println(o.a + " " + i.b);    // 0 5
  }
}

//if it is static
class Outside {
  int a = 0;
  
  static class Inside {
    int b = 5;      //it only know b not a, {} is a scope
  }
}

public class InnerStellar {
  public static void main(String[] args){
    Outside.inside i = new Outside.Inside();
    System.out.println(i.b);    // 5  //only for b
  }
}
