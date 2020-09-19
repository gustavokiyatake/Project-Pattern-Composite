import java.util.*;

public class table {
  private List<line> lines = new ArrayList<line>();
  
  public void add(line l) {
    lines.add(l);
  }

  public void print() {
    for (line l : lines) {
      l.print();
    }
  }
}