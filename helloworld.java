import static java.lang.System.*;
//import java.util.*;

public class helloworld {
	public static void main(String arg[]){
	int i,j,k,N=2000;
	long count=0;
	//Date d=new Date();//创建一个时间对象
	//String time=d.toLocaleString();//返回系统当前时间
	//out.print(time); 
	long time1=System.currentTimeMillis();
	out.println(time1);
	for(i=0;i<N;i++)
		for(j=0;j<N;j++)
			for(k=0;k<N;k++)
			count++;
		out.println("hello world!");
		out.println("Have counte:"+count);
		//time=d.toLocaleString();//返回系统当前时间
		long time2=System.currentTimeMillis();
		out.println(time2);
		out.println("total time: "+((time2-time1)/1000)+"s");
	}

}
