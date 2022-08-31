public class Class {
    public static void main(String[] args) {
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("in.txt", true)))) {
            out.println("New line append here !!");
        }catch (IOException e) {
            System.err.println(e);
        }
    }
}
