import java.io.*;
import java.net.*;

class Server{
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(1932);
        Socket socket = serverSocket.accept();
        BufferedReader bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        String message;;
        while((message = bReader.readLine())!=null){
            if(message.equals("QUIT")){
                out.println("BYE");
                break;
            }
            System.out.println(String.format("Client: %s",message));
            BufferedReader responseStream = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your response: ");
            String response = responseStream.readLine();
            out.println(response);
        }
        socket.close();
        serverSocket.close();
        bReader.close();

    }
}
