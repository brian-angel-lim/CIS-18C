import java.util.Scanner;

public class StringParsing {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String url = "https://www.google.com/test?name=john&profession=bellydancer";
        // Create a new Java Object that contains the following:
        // protocol (either http OR https always followed by ://
        //sub-domain (ex: www)
        //domain (ex: google)
        //top level domain (ex: com, next, org)
        //map of the querystring parameters
        //parse URL into the object you created above
        String protocol = "";
        boolean protocolStop = false;
        String subdomain = "";
        boolean subdomainStop = false;
        String domain = "";
        String tld = "";
        String queryString = "";

        for (int i = 0; i < url.length(); i++) {
            // loop through the string looking for the following:
            // First, look for :// - end of protocol
            if (url.charAt(i) != ':') {
                protocol = protocol + url.charAt(i);
            }
        }
        System.out.println(protocol);
    }
}
