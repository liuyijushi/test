package exercise2;

import java.util.Scanner;

/*编写程序，实现如下功能：
提示用户输入2个圆的圆心坐标和各自的半径值，判断并输出这两个圆之前的位置关系。
两个圆之间的位置关系有如下三种：
*/
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //提示用户输入两个圆的圆心坐标和各自半径
     Scanner input = new Scanner(System.in);
     float a,b,c,d,r1,r2;
     System.out.println("请您输入第1个圆的坐标和半径");
     a=input.nextFloat();
     b=input.nextFloat();
     r1=input.nextFloat();
     System.out.println("请您输入第2个圆的坐标和半径");
     c=input.nextFloat();
     d=input.nextFloat();
     r2=input.nextFloat();
//运用公式判断两圆关系  
//包含     (a-c)*(a-c) + (b-d)*(b-d)<(r1-r2)*(r1-r2)
    if((a-c)*(a-c)+(b-d)*(b-d)<(r1-r2)*(r1-r2))
      System.out.printf("(%.2f,%.2f)-%.2f"+
 		"包含(%.2f,%.2f)-%.2f",a,b,r1,c,d,r2);
//两圆相交(r1-r2)*(r1-r2)<(a-c)*(a-c) + (b-d)*(b-d) < (r1+r2)*(r1+r2) 
  if((a-c)*(a-c)+(b-d)*(b-d)>(r1-r2)*(r1-r2) && 
    		 (a-c)*(a-c)+(b-d)*(b-d)<(r1+r2)*(r1+r2) )
         System.out.printf("(%.2f,%.2f)-%.2f"+
    		"与(%.2f,%.2f)-%.2f相交",a,b,r1,c,d,r2);
//无关（相离）(a-c)*(a-c) + (b-d)*(b-d)> (r1+r2)*(r1+r2)  
     if((a-c)*(a-c)+(b-d)*(b-d)>(r1+r2)*(r1+r2))
         System.out.printf("(%.2f,%.2f)-%.2f"+
    		"与(%.2f,%.2f)-%.2f无关",a,b,r1,c,d,r2);
 //输出格式  (0.00,0.00)-10.00 包含 (0.00,1.00)-5.00  修改文件内容
		
	}

}

