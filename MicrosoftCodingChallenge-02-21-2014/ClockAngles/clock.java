import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.io.*;
 
public class clock {
	private static int maxClock = 3600;
	private static int maxHour = 12;
	private static int maxMin = 60;
	private static int maxSec = 60;
	
	private static double hrTmp = 0;
	private static double minTmp = 0;
	private static double secTmp = 0;
	
	private static double hrPos = 0;
	private static double minPos = 0;
	private static double secPos = 0;
	
	private static double hrDegree = 0;
	private static double minDegree = 0;
	private static double secDegree = 0;
	
	private static int n;
	
	public static void fillTemp(String str)
	{
		int tmpPos = 0;
		tmpPos = str.indexOf(":"); 
		//System.out.println(str);
		hrTmp = Integer.parseInt(str.substring(0,tmpPos));
		str = str.substring(tmpPos+1, str.length());
		tmpPos = str.indexOf(":");
		minTmp = Integer.parseInt(str.substring(0,tmpPos));
		
		str = str.substring(tmpPos+1, str.length());
		secTmp = Integer.parseInt(str);
		
		System.out.println("hrTmp: " + hrTmp + " minTmp: " + minTmp+ " secTmp: " + secTmp);
	}
	
	public static double calcSecPosition(double hr, double min, double sec)
	{
		return sec*60;
	}
	
	public static double calcMinPosition(double hr, double min, double sec)
	{
		return (min*60)+(sec);
	}
	
	public static double calcHrPosition(double hr, double min, double sec)
	{
		return (hr*300)+(min*5) + (sec/12);
	}
	
	public static void calcClockPos(double hr, double min, double sec)
	{
		secPos = calcSecPosition(hr, min, sec);
		minPos = calcMinPosition(hr,min,sec);
		hrPos = calcHrPosition(hr,min,sec);
		
		System.out.println("hrPos: " + hrPos + " minPos: " + minPos+ " secPos: " + secPos);
	}
	
	public static void calcClockDegree(double hrPos, double minPos, double secPos)
	{
		hrDegree = hrPos/10;
		minDegree = minPos/10;
		secDegree = secPos/10;
	}
	
	
	public static double getDegree(double x, double y)
	{
		//System.out.println("x is : " + x + " y is : " + y);
		double tmp = Math.abs(x-y);
		if(tmp > 180)
		{
			return 360.00 - tmp;
		}
		else return tmp;
		
		
	}
	
	public static void createOutString(double x, double y, double z)
	{
		//return x+":"+y+":"+z;
		DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(x) + ":"+df.format(y)+":"+df.format(z));
	}
	/*public int calcSecPosition (int hr)
	{
		
	}
 */
	public static void main(String[] args) {
		
		//fillTemp("13:00:00");
		//System.out.println(hrTmp + " " + minTmp + " " + secTmp);
		
 
        // process the line.
				// process the line.
				//String x = new String(buffer);
	try{
		BufferedReader br = new BufferedReader(new FileReader("/home/sam/Desktop/SampleInput.txt"));
        String line;
        line = br.readLine();
        System.out.println(line);
        
		
        while((line = br.readLine()) != null) {
             // do something with line.
				fillTemp(line);
				calcClockPos(hrTmp, minTmp, secTmp);
				calcClockDegree(hrPos, minPos, secPos);
				double hrToMin = getDegree(hrDegree, minDegree);
				double hrToSec = getDegree(hrDegree, secDegree);
				double minToSec = getDegree(minDegree, secDegree);
				
				String hrToMinS = Double.toString(hrToMin);
				//System.out.println("winning" + " " + hrToMinS);
				String hrToSecS = Double.toString(hrToSec);
				String minToSecS = Double.toString(minToSec);
				
				createOutString(hrToMin, hrToSec, minToSec);
			}
		} catch(FileNotFoundException e)
		{
			System.out.println("nigger");
			System.exit(0);
		}
		catch (IOException e)
		{
			System.out.println("nigger2");
			System.exit(0);
		}
				
				

		}
}
