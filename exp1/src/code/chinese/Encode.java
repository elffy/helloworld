/**
 * 本程序可用于加密汉字，采用二进制异或的方法加密，同时实现了文件的输入输出
 */

package code.chinese;

import java.io.*;
//import java.awt.*;
//import java.awt.event.*;

public class Encode {
	public static void main(String[] args)
	{
		char a[]="今晚10点发动攻击".toCharArray();
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
			System.out.println("密文：");
			m=fr.read(t, 0, 10);
			//while((n=fr.read(t, 0, 9))!=-1);
			//{
				String s=new String(t,0,n);
				System.out.println(s);
				System.out.println(m);
			//}
			fr.close();
			
			System.out.println("明文：");
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
