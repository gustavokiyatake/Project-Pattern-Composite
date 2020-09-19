import java.util.*;

public class line {
  private List<cell> cells = new ArrayList<cell>();
 
  public void print() {
    int cellsCount = cells.size();

    // print the line
    int size = (cells.size() * 17) + (cellsCount + 1);
    char[] line = new char[size];
    java.util.Arrays.fill(line, '-');
  
    System.out.println(" " + new String(line));

    for (cell c : cells) {
      c.print();
    }

    // print the bord
    System.out.println(" |");
  }
 
  public void add(cell c) {
    cells.add(c);
  }
}