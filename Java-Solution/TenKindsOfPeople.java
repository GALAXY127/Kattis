
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TenKindsOfProple {
     static char[][] map;
    private static final int[][] dir = {{0,-1}, {1,0}, {0,1}, {-1,0}};// Våran pos
    static ArrayList<Point> list = new ArrayList<Point>();
    static BufferedReader reader;

     static void sum() throws IOException {
         reader = new BufferedReader(new InputStreamReader(System.in));
         String[] size = reader.readLine().split(" ");
         map = new char[Integer.parseInt(size[0])][Integer.parseInt(size[1])]; // sätter storlek
         add();
         int[][] tempMap = new int[map.length][map[0].length];
         int fill =2;
         for (int i = 0; i <map.length; i++){
             for (int j = 0; j < map[0].length; j++){
                 if (tempMap[i][j] == 0)
                 {
                     GroupMap(new Point(i , j) , map , tempMap , fill);
                     fill++;
                 }
             }
         }
         int GroupP = Integer.parseInt(reader.readLine());
         for(int i =0; i< GroupP; i++){
             String[] temp = reader.readLine().split(" ");
             if (tempMap[Integer.parseInt(temp[0])-1][Integer.parseInt(temp[1])-1] == tempMap[Integer.parseInt(temp[2])-1][Integer.parseInt(temp[3])-1]){
                 System.out.println(map[Integer.parseInt(temp[0])-1][Integer.parseInt(temp[1])-1] == '1' ? "decimal" : "binary");
             }
             else{
                 System.out.println("neither");
             }

         }
         reader.close();
         }






    static void add() throws IOException {
         for(int i =0; i<map.length; i++){
             map[i] = reader.readLine().toCharArray();
         }

     }
    static void print(){ // kolla om vi kan printa korrekt
         for(int i=0; i < map.length; i++){
             for(int j =0; j <map[0].length; j++){
                 System.out.print(" " + map[i][j] + " ");
             }
             System.out.println();
         }
     }
    public static void GroupMap(Point point , char[][] map , int[][] groups , int fill) {
        list.add(point);
        groups[point.x][point.y] = fill;

        while (!list.isEmpty())
        {
            Point curr = list.remove(0);

            for (int i = 0; i < 4; i++)
            {
                int row = curr.x + dir[i][0];
                int col = curr.y + dir[i][1];

                if (row >= 0 && row < map.length && col >= 0 && col < map[0].length)
                    if (map[row][col] == map[curr.x][curr.y] && groups[row][col] != fill)
                    {
                        groups[row][col] = fill;
                        list.add(new Point(row , col));
                    }
            }
        }

    }





    public static void main(String[] args) throws IOException {
        sum();



    }
}