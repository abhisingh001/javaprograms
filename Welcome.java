import java.util.Scanner;
class CustomerOrder
{
	private int totalBill;
	void calculateBill(int a)
	{
		totalBill+=a;
		//System.out.println(totalBill);
	}
	void showTotalBill(Welcome ar)
	{/*
		this.totalBill=0;
		for(int i=0;i<5;i++)
		{
			int j=a.itemOrder[i];
			if(j>0)
			j=j-1;
			int k=a.itemNo[i];
			totalBill+=k*a.price[j];
			//System.out.println(totalBill);
			j=0;
			k=0;

		}*/
		System.out.println("SNo"+"\tItem"+"\tno Of item"+"\tprice");
		for(int i=0;i<5;i++)
		{
			if(ar.itemOrder[i]==5)
				System.out.println((i+1)+"\t"+ar.item[i]+"\t"+ar.itemNo[i]+"\t\t"+ar.itemNo[i]*ar.price[i]);

		}
		System.out.println("\t\t\ttotal bill="+totalBill);


	}





}

class Welcome
{
	String item[]={"Cake","Pizza","Cold Drink","Tea","Burger"};
	int price[]={250,400,50,10,50};
	int itemOrder[]= new int[5];
	int itemNo[]=new int[5];
	
	void showItem()
	{	System.out.println("\t"+"Item"+"\t\tPrice");
		for(int i=0;i<5;i++)
		{
			System.out.println((i+1)+"\t"+item[i]+"\t\t"+price[i]);
		
		}

	}
	void menu(CustomerOrder ab)
	{	Scanner scan= new Scanner(System.in);
		this.showItem();
		System.out.println("choose option");
		int swi=scan.nextInt();
		int itemNo;
		boolean tr=true;
		aa:while(tr)
		{
	     		switch(swi)
			{
				case 1:
					System.out.println("how many cake");
					itemNo=scan.nextInt();
					this.itemOrder[0]=5;
					this.itemNo[0]+=itemNo;
					ab.calculateBill(price[0]*itemNo);
					break;
				case 2:
					System.out.println("how many pizza");
					itemNo=scan.nextInt();
					this.itemNo[1]+=itemNo;
					this.itemOrder[1]=5;
					ab.calculateBill(price[1]*itemNo);
					break;
				case 3:
					System.out.println("how many cold drinks");
					itemNo=scan.nextInt();
					this.itemOrder[2]=5;
					this.itemNo[2]+=itemNo;
					ab.calculateBill(price[2]*itemNo);
					break;
				case 4:
					System.out.println("how many tea");
					itemNo=scan.nextInt();
					this.itemOrder[3]=5;
					this.itemNo[3]+=itemNo;
					ab.calculateBill(price[3]*itemNo);
					break;
				case 5:
					System.out.println("how many burger");
					itemNo=scan.nextInt();
					this.itemOrder[4]=5;
					this.itemNo[4]+=itemNo;
					ab.calculateBill(price[4]*itemNo);
					break;
				case 6:
					System.out.println("total bill");
					ab.showTotalBill(this);
					break aa;

				default:
					System.out.println("choose order from list");
			}
			System.out.println("enter 6 for bill or order your item");
			swi=scan.nextInt();
			
			
		}
	}

	void takeOrder()
	{
		Scanner scan=new Scanner(System.in);	
		for(int i=0;i<5;i++)
		{	
			System.out.println("enter item number");
			this.itemOrder[i]=scan.nextInt();
			System.out.println("Enter number of item");
			this.itemNo[i]=scan.nextInt();
		
		}
		scan.close();

	}
	


	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		Welcome a= new Welcome();
		CustomerOrder c= new CustomerOrder();
		/*
		a.showItem();
		a.takeOrder();
		System.out.println("enter 1 for bill");
		int next=scan.nextInt();
		if(next==1)
		{
			
			c.totalBill(a);
		}
		*/

		a.menu(c);
		scan.close();

	}





}








































