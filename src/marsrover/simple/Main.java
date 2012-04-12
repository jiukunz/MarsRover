package marsrover.simple;


public class Main {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        String output = simulator.shuRuDaoShuChu("cmd.txt");
        System.out.println(output);
    }
}
