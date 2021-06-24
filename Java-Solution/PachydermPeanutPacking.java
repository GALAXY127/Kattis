
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PachydermPeanutPacking {
	double x1 =0;
	double x2 =0;
	double y1 =0;
	double y2 =0;
	String boxSize;
	static PachydermPeanutPacking [] array;
	public Main (String pos) {
		String[] value = pos.split(" ");
		this.x1 = Double.parseDouble(value[0]);
		this.y1 = Double.parseDouble(value[1]);
		this.x2 = Double.parseDouble(value[2]);
		this.y2 = Double.parseDouble(value[3]);
		this.boxSize = value[4];
	}
	
	public PachydermPeanutPacking() {
		x1=0;
		x2=0;
		y1=0;
		y2=0;
		boxSize="";
	}
	
	public static boolean inside(double x, double y, Main obj) {
		return x >= obj.x1 && x <= obj.x2 && y >= obj.y1 && y <= obj.y2;
	}
	
	
	public static void sum() throws NumberFormatException, IOException{
        //Scanner sc = new Scanner(System.in);
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
        	int cases = Integer.parseInt(read.readLine());
        	if(cases ==0) {
        		break;
        	}
        	array = new Main[cases];
        	for(int i=0;i<cases;i++) {
        		array[i] = new Main(read.readLine());
        	}
        	int peanut = Integer.parseInt(read.readLine());
        	for(int i =0;i<peanut;i++) {
        		String temp = read.readLine();
        		String [] temparr = temp.split(" ");
        		double x = Double.parseDouble(temparr[0]);
        		double y = Double.parseDouble(temparr[1]);
        		boolean flag=false;
        		for(int j=0;j<array.length;j++) {
        			if(inside(x,y,array[j])) {
        				if(temparr[2].equals(array[j].boxSize)) {
        					System.out.println(temparr[2]+" "+"correct");
        				}else {
        					System.out.println(temparr[2]+" "+array[j].boxSize);
        				}
        				flag=true;
        				break;
        			}
        			
        		}
        		if(!flag) {
        			System.out.println(temparr[2]+" "+"floor");
        		}
        		
        	}
        	System.out.println();
        }
        
        
        
       
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		sum();
	}
}
