import java.io.*;
import java.net.*;

class Client{
    public static void main(String[] args) throws IOException{
        Socket socket = new Socket("localhost",1932);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = "";
        while(true){
            if(message.equals("BYE")){
                break;
            }
            BufferedReader responseStream = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your message here: ");
            String response = responseStream.readLine();
            out.println(response);
            message = bReader.readLine();
            System.out.println(String.format("Server: %s",message));

        }
        socket.close();
    }

}
