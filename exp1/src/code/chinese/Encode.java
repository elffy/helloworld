/**
 * ����������ڼ��ܺ��֣����ö��������ķ������ܣ�ͬʱʵ�����ļ����������
 */

package code.chinese;

import java.io.*;
//import java.awt.*;
//import java.awt.event.*;

public class Encode {
	public static void main(String[] args)
	{
		char a[]="����10�㷢������".toCharArray();
		int n=a.length,m;
		try{
			File f=new File("secret.txt");
			for(int i=0;i<a.length;i++)
			{
				a[i]=(char)(a[i]^'R');				
			}
			FileWriter fw=new FileWriter(f);
			fw.write(a, 0, a.length);
			fw.close();
			FileReader fr=new FileReader(f);
			char t[]=new char[10];
			System.out.println("���ģ�");
			m=fr.read(t, 0, 10);
			//while((n=fr.read(t, 0, 9))!=-1);
			//{
				String s=new String(t,0,n);
				System.out.println(s);
				System.out.println(m);
			//}
			fr.close();
			
			System.out.println("���ģ�");
			for(int i=0;i<a.length;i++)
			{
				t[i]=(char)(t[i]^'R');
			}
			String str=new String(t,0,n);
			System.out.println(str);
			
		}
		catch(IOException e){System.out.println(e.getMessage());}
	}
}
