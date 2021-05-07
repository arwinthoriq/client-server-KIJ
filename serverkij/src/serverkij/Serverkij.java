/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverkij;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author user
 */
public class Serverkij {
    
    static Connection conn;
    static Statement cn;
    static ResultSet rs;
    
    static ServerSocket ss;
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    /**
     * @param args the command line arguments
     */
   
    public static void a() {
        String msgin = "";
       try {
            ss =  new ServerSocket(8080);
            s = ss.accept();
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            
            
            while(!msgin.equals("exit")) {
             //   String ms = din.readUTF();
                msgin = din.readUTF();
                String key = din.readUTF();
                
               String tgl = din.readUTF();
                
                String gout = "";
                String isitext = (key.length())+key+msgin;
                for (int i = 0; i< isitext.length(); i++) {
                    int index = isitext.charAt(i);
                    char s = (char) (index+1);
                    gout = gout + String.valueOf(s).trim();
                    
                    File data = new File("data_sementara.txt");
                    PrintWriter pr = new PrintWriter(new FileWriter(data, false));
                    pr.println(gout);
                    pr.close();
                
                }
                    File datadua = new File("data_asli.txt");
                    PrintWriter prdua = new PrintWriter(new FileWriter(datadua, true));
                    
                    File data = new File("data_sementara.txt");
                    Scanner in = new Scanner(data);  
                    Vector<String> v = new Vector<String>();
                    while(in.hasNextLine()) {
                        v.add(in.nextLine());
                    }
                    String n= "\n";
                    for (int p=0; p<v.size(); p++) {
                        prdua.println(n);
                       prdua.println(tgl);
                       prdua.println(v.get(p));
                        prdua.close();
                    }

                 // String enter = "\n";
             Scanner scan = new Scanner(datadua);
             while(scan.hasNextLine()) {
                 String get = scan.nextLine();
                   dout.writeUTF(get);
                  // dout.writeUTF(enter);
             }
           //    File datadua = new File("data_asli.txt");
          //  Scanner scan = new Scanner(datadua);
            // while(scan.hasNextLine()) {
             //    String ge = scan.nextLine();
                 //  dout.writeUTF(ge);
                   //System.out.println("mk");
        //}
            }
          
        } catch (Exception e) {
        }
       
    }
    
   
    
    public static void b() {
        try {
            File data = new File("data.txt");
            Scanner in = new Scanner(data);
            Vector<String> v = new Vector<String>();
            while(in.hasNextLine()) {
                v.add(in.nextLine());
            }
            for (int i=0; i<v.size(); i++) {
               // System.out.println(v.get(i));
                dout.writeUTF(v.get(i));
            }
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
      //koneksi();
      a();
  
      
    }
    
}

