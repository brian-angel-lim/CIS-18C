public class CipherLab {

    public static void main(String[] args) {
        CaeserCipher cs = new CaeserCipher();
        String newText = cs.encode("5", "Hello, world");
        System.out.println(cs.decode("10", cs.encode("10", "Hello, World")));
    }
}
