public interface ICipher {
    public String encode (String key, String plainText);
    public String decode(String key, String cipherText);
}
