import java.util.*;
public class OrderingSystem
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Date date=new Date();
        System.out.println("Enter Customer Name");
        String name=sc.nextLine();
        System.out.println("Hotel Name\t\t"+"User Name\t\t"+"Date and Time");
        System.out.println(" ");
        System.err.println("Welcome to CC order Hotel"+"\t"+name+"\t\t\t"+date.toString());
        int a,b,c,d,e,f,l,i;
        int eachcost=0;
        int cost=0;
        int price=0;
        int y=0,v=0;
        String item=" ";

        System.out.println(" ");
        System.out.println("Our menu Card");
        System.out.println(" ");
        System.out.println("Item Name\t\t"+"Price\t\t"+"press to order");
        System.out.println(" ");
        System.out.println("Tea\t\t\t\t"+"60\t\t"+"1");
        System.out.println("Chiken Roll\t\t"+"40\t\t"+"2");
        System.out.println("Cofee\t\t\t"+"50\t\t"+"3");
        System.out.println("Cold Drink\t\t"+"50\t\t"+"4");
        System.out.println("Ice Cream\t\t\t"+"70\t\t"+"5");
        System.out.println(" ");
        System.out.println(" ");
        ArrayList order=new ArrayList();
        ArrayList<Integer> pric=new ArrayList<>();
        ArrayList plate=new ArrayList();


        do
        {

            System.out.println("press to order");

            a=sc.nextInt();
            int press[]=new int[]{a};


            System.out.println("Enter the Number of Contity");
            b=sc.nextInt();
            System.out.println(" ");
            if(a==1)
            {
                item="Tea\t\t";
                price=60;
                eachcost=price*b;
                cost+=eachcost;
                boolean of=order.contains(item);
                

                if(of)
                {
                    order.add("");
                    pric.add(eachcost);
                    plate.add(b);

                }
                else
                {
                    pric.add(eachcost);
                    plate.add(b);
                    order.add(item);
                }
            }
            if(a==2)
            {
                item="Chiken Roll";
                price=40;
                eachcost=price*b;
                cost+=eachcost;

                order.add(item);
                pric.add(eachcost);
                plate.add(b);

            }
            if(a==3)
            {
                item="Cofee\t";
                price=50;
                eachcost=price*b;
                cost+=eachcost;
                System.out.println(item+"\t\t"+b+"\t\t\t\t"+eachcost);
                order.add(item);
                pric.add(eachcost);
                plate.add(b);
            }
            if(a==4)
            {
                item="Cold Drink";
                price=50;
                eachcost=price*b;
                cost+=eachcost;
               
             order.add(item);
                pric.add(eachcost);
                plate.add(b);
            }
            if(a==5)
            {
                item="Ice Cream\t";
                price=70;
                eachcost=price*b;
                cost+=eachcost;
               
             order.add(item);
                pric.add(eachcost);
                plate.add(b);
            }
            
             for(int k=0;k<press.length;k++)
             {
                 String fetchitemname=" ";


                 if(press[k]==1)
                 {
                     fetchitemname="Tea";

                 }
                 if(press[k]==2)
                 {
                     fetchitemname="Chiken Roll";
                 }
                 if(press[k]==3)
                 {
                     fetchitemname="Cofee";

                 }
                 if(press[k]==4)
                 {
                     fetchitemname="Cold Drink";
                 }
                 if(press[k]==5)
                 {
                     fetchitemname="Ice Cream";
                 }
             }
             System.out.println("Do You Want To Continue the order(press 1 for continue/otherwise press 0");
             y=sc.nextInt();


             System.out .println(" ");


        }while(y!=0);
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Items Names"+"\t\t\t\t\t\t"+"No. of contity"+"\t\t"+"Sub Total");
        Iterator itr=order.iterator();
        Iterator<Integer> itr1=pric.iterator();
        Iterator itr2=plate.iterator();

        while(itr.hasNext()  && itr1.hasNext() && itr2.hasNext())
        {
            System.out.print(itr.next()+"\t\t\t\t\t\t\t"+itr2.next()+"\t\t\t"+itr1.next());
            System.out.println(" ");

        }
        System.out.println(" ");
        System.out.println("Total Bill :"+"\t\t\t\t\t\t\t\t\t\t"+cost);
        System.out.println(" ");

        System.out.print("Do You want Delete the order(press 1 for continue/otherwise press 0)" );
        l=sc.nextInt();

        System.out.println(" ");

        if(l==1)
        {
            do
            {
                if(order.isEmpty())
                {
                    System.out.println("Your Card is Empty");
                    break;
                }
                else
                {
                    System.out.println("press to delete");
                    f=sc.nextInt();
                    int delete[]=new int[]{f};

                    if(f==1)
                    {
                        item="Teal";
                        boolean of=order.contains(item);
                        int of1=order.indexOf(item);

                        if(of)
                        {
                            order.remove(item);
                            cost=cost-pric.remove(of1);

                            plate.remove(of1);
                        }
                    }
                    if(f==2)
                    {
                        item="Chiken Roll";
                        boolean of=order.contains(item);
                        int of1=order.indexOf(item);

                        if(of)
                        {
                            order.remove(item);
                            cost=cost-pric.remove(of1);

                            plate.remove(of1);
                        }
                    }
                    if(f==3)
                    {
                        item="Cofee";
                        boolean of =order.contains(item);
                        int of1=order.indexOf(item);

                        if(of)
                        {
                            order.remove(item);
                            cost=cost-pric.remove(of1);

                            plate.remove(of1);
                        }
                    }
                    if(f==4)
                    {
                       item="Cold Drink";
                       boolean of=order.contains(item);
                       int of1=order.indexOf(item);


                       if(of)
                       {
                           order.remove(item);
                           cost=cost-pric.remove(of1);

                           plate.remove(of1);
                       } 
                    }
                    if(f==5)
                    {
                        item="Ice Cream";
                        boolean of=order.contains(item);
                        int of1=order.indexOf(item);

                        if(of)
                        {
                            order.remove(item);
                            cost=cost-pric.remove(of1);

                            plate.remove(of1);

                        }
                    }
                    System.out.println("continue to delete the order(press 1 for continue/otherwise press o)");
                    v=sc.nextInt();
                }
            }while(v!=0);
            System.out.println(" ");
            System.out.println("Items Names"+"\t\t\t\t\t"+"No. of contity"+"\t\t\t"+"sub Total");
            itr=order.iterator();
            itr1=pric.iterator();
            itr2=plate.iterator();
            int scost=0;
            while(itr.hasNext() && itr1.hasNext() && itr2.hasNext())
            {
                System.out.println(itr.next()+"\t\t\t\t\t"+itr2.next()+"\t\t\t\t\t"+itr1.next());
                System.out.println(" ");
                System.out.println(" ");

            }
            System.out.println("Total Bill :"+"\t\t\t\t\t\t\t\t"+"     "+"\t\t"+cost);
        }
        else
        {
            System.out.println("Items Names"+"\t\t\t\t\t"+"No.of contity"+"\t\t"+"Sub total");
            itr=order.iterator();
            itr1=pric.iterator();
            itr2=pric.iterator();
            int scost=0;
            while(itr.hasNext() && itr1.hasNext() && itr2.hasNext())
            {
                System.out.println(itr.next()+"\t\t\t\t\t\t\t"+itr2.next()+"\t\t\t"+itr1.next());
                System.out.println(" ");

            }
            System.out.println("Total Bill :"+"\t\t\t\t\t\t\t\t"+"     "+"\t\t\t"+cost);

        }
        
        
        
        System.out.println();
        System.out.println("Thank You for Visiting our Hotel"+" "+name+"\t\t\t\t\t\t"+"signiture");            
        
    }
}
