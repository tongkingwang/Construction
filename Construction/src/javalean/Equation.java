package javalean;

import java.util.Random;

public class Equation {

	public static void main(String[] args) {
		int N = 50;
		int[] fontNum=new int [N];
		int[] endNum=new int [N];
		int[] symol=new int [N];//symol�����洢�������0���������1����ӷ�
		System.out.println("���50��100���ڵļӼ�������ϰ������д");
		Equations(fontNum,endNum,symol);
		printEquation(fontNum,endNum,symol);
		printResult(fontNum,endNum,symol);

	}

	//���������
	public static void Equations(int[] fontNum,int[] endNum,int[] symol) {
		
		Random num=new Random();
		for(int i=0;i<50;i++) {
			
			fontNum[i]=num.nextInt(101);
			endNum[i]=num.nextInt(101);
			symol[i]=num.nextInt(2);
			
			if(symol[i]==0) {
				if(fontNum[i]-endNum[i]<0){
					i--;
					continue;
				}		
			}
			else {
				if(fontNum[i]+endNum[i]>100) {
					i--;
					continue;
				}
				
			}
			int flag=0;
			for(int j=i-1;j>=0;j--) {
				if(fontNum[i]==fontNum[j]&&endNum[i]==endNum[j]&&symol[i]==symol[j]) {
					flag=1;
					break;
				}
			}
			if(flag==1) {
				i--;
				continue;
			}
		}
	}
	//�����ʽ
	public static void printEquation(int[] fontNum,int[] endNum,int[] symol) {
		System.out.print("\n������ʽ��\n");
		for(int i=0;i<50;i++) {
			if(symol[i]==0) 
				System.out.print("\n"+fontNum[i]+"-"+endNum[i]+"=");
			else
				System.out.print("\n"+fontNum[i]+"+"+endNum[i]+"=");
		}
	}
	//������
	public static void printResult(int[] fontNum,int[] endNum,int[] symol) {
		System.out.println("\n����������:");
		for(int i=0;i<50;i++) {
			if(symol[i]==0) 
				System.out.print(fontNum[i]-endNum[i]+"\n ");
			else
				System.out.print(fontNum[i]+endNum[i]+"\n");
			
		}
	}
}
