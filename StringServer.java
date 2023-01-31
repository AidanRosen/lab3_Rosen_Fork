import java.io.IOException;
import java.net.URI;


class StringServer {
    public static void main(String[] args) throws IOException {
        // if(args.length == 0){
        //     System.out.println("Missing port number! Try any number between 1024 to 49151");
        //     return;
        // }

        // int port = Integer.parseInt(args[0]);

        Server.start(3000, new Handler());
    }
}

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    String string = ""; 

    public String handleRequest(URI url) {
        if (url.getPath().equals("/add-string")) {

            String[] parameters = url.getQuery().split("=");

            if (parameters[0].equals("s")) {
                string += "\n" + parameters[1];
                return string;
            }

         
        } 

        return string; 
}
}



