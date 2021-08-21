package leet.code;

public class EncodeandDecodeTinyURL {

    public static void main(String[] args) {
        String encode = encode("ftp://174.123.452.34/directory/file");
        String decode = decode(encode);
        System.out.println(decode);
    }

    // Encodes a URL to a shortened URL.
    public static String encode(String longUrl) {
        if ("https://".equals(longUrl.substring(0, 8))) {
            return 1 + longUrl.substring(8);
        }
        if ("ftp://".equals(longUrl.substring(0, 6))) {
            return 2 + longUrl.substring(6);
        }

        return 0 + longUrl.substring(7);
    }

    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) {

        if (shortUrl.charAt(0) == '1') {
            return "https://" + shortUrl.substring(1);
        }

        if (shortUrl.charAt(0) == '2') {
            return "ftp://" + shortUrl.substring(1);
        }

        return "http://" + shortUrl.substring(1);
    }
}
