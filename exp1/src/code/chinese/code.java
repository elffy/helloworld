package code.chinese;
/*
 * 本程序根据java中short类型和char类型大小相同的特点，可对汉字先转换成二进制代码，再进行一些加密算法
 * 
 */
public class code {
	public static void main(String arg[])
	{
		char a='邮';
		short b=(short)a;
		System.out.println(a)	;
		System.out.println(b)	;
		//char[] s={'北','京','邮','电','大','学'};
		char s[]="北京邮电大学".toCharArray();
		short a1[]=new short[6];
		char c[]=new char[6];
		for(short i=0;i<s.length;i++)
		{
			a1[i]=(short)s[i];
			short k=(short)(a1[i]+3);
			c[i]=(char)k;
			
		}
		System.out.println(s)	;
		for(int j=0;j<6;j++)
		{
		System.out.println(a1[j])	;
		}
		System.out.println(c)	;
	}
}
