public class main {
  public static void main(String[] args) {
    line l1 = new line();
    l1.add(new cell("João"));
    l1.add(new cell("Maria"));
    l1.add(new cell("José"));

    line l2 = new line();
    l2.add(new cell("10"));
    l2.add(new cell("10"));
    l2.add(new cell("7.5"));

    table t = new table();
    t.add(l1);
    t.add(l2);
    t.print();
  }
}