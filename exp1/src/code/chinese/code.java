package code.chinese;
/*
 * ���������java��short���ͺ�char���ʹ�С��ͬ���ص㣬�ɶԺ�����ת���ɶ����ƴ��룬�ٽ���һЩ�����㷨
 * 
 */
public class code {
	public static void main(String arg[])
	{
		char a='��';
		short b=(short)a;
		System.out.println(a)	;
		System.out.println(b)	;
		//char[] s={'��','��','��','��','��','ѧ'};
		char s[]="�����ʵ��ѧ".toCharArray();
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
