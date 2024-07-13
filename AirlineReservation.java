//Project on Airline Reservation developed in Java

import java.lang.*;
import java.io.*;
import java.util.*;
import java.text.*;

class AirlineReservation
{
	static int bid;
	int no,id;
	String name,address,city;
	double amount,time;
	long phone;
	Date d;
	DateFormat df;
	Scanner sc=new Scanner(System.in);

	public AirlineReservation()
	{
		no=0;
		name="";
		bid=1;
		d=new Date();
		df=new SimpleDateFormat("dd/MM/yyyy");
	}
	
	public void Details()
	{
	    System.out.println("\n Please enter your customer id");
	    id=sc.nextInt();
	    System.out.println("\n Please enter your name");
	    name=sc.next();
	    System.out.println("\n Please enter your phone number");
	    phone=sc.nextLong();
	    System.out.println("\n Please enter your address");
	    address=sc.next();
	    System.out.println("\n Please enter your city");
	    city=sc.next();
	    }
	   
	public void DisplayDetails()
	{
	    System.out.println("\nCustomerid:"+id);
	    System.out.println("\nCustomername:"+name);
	    System.out.println("\nCity:"+city);
	    System.out.println("\nCustomeraddress:"+address);
	   }
	    
	    
	public void Airlines()
	{
	    System.out.println("\n\n*********************************************");
	    System.out.println("\nDiaplaying all Airlines");
	    System.out.println("\n1.Air India");
	    System.out.println("\n2.GoAir Airlines");
	    System.out.println("\n3.IndiGo Airlines");
	    System.out.println("\n4Jagson Airline");
	    System.out.println("\n5Jet Airways");
	    System.out.println("\n6Paramount Airways");
	    System.out.println("\n7SpiceJet Airlines");
	    System.out.println("\n8MDLR Airlines");
	   }
	    
	public void viewFlights()
	{
		System.out.println("\n\n*********************************************");
		System.out.println("\nDispalying all flights");
		System.out.println("\n1.Kolhapur to Pune - Rs.20,000");
		System.out.println("\n2.Kolhapur to Mumbai - Rs.25,000");
		System.out.println("\n3.Kolhapur to Banglore - Rs.30,000");
		System.out.println("\n4.Kolhapur to Delhi - Rs.50,000");
		System.out.println("\n5.Kolhapur to Ahemdabad - Rs.55,000");
		System.out.println("\n6.Kolhapur to Kolkata - Rs.60,000");
		System.out.println("\n7.Kolhapur to Mysore - Rs.45,000");
		System.out.println("\n8.Kolhapur to Kashmir - Rs.70,000");
		System.out.println("\n9.Kolhapur to Kerala - Rs.50,000");
		System.out.println("\n10.Kolhapur to Rajasthan - Rs.65,000");
		System.out.println("\n11.Kolhapur to Goa - Rs.40,000");
		System.out.println("\n12.Kolhapur to Hyderabad - Rs.45,000");
	}
	
	public void flightTimings()
	{
	    System.out.println("\n\n*********************************************");
	    System.out.println("\nDisplaying all departure and arrival timings");
	    System.out.println("\n1.Kolhapur to Pune - 09:00am to 09:30am");
	    System.out.println("\n2.Kolhapur to Mumbai - 10:00am to 11:00am");
	    System.out.println("\n3.Kolhapur to Banglore - 09:30am to 13:00pm");
	    System.out.println("\n4.Kolhapur to Delhi - 08:00am to 15:00pm");
	    System.out.println("\n5.Kolhapur to Ahemdabad - 08:30am to 12:30pm");
	    System.out.println("\n6.Kolhapur to Kolkata - 10:00am to 18:00pm");
	    System.out.println("\n7.Kolhapur to Mysore - 11:00am to 15:00pm");
	    System.out.println("\n8.Kolhapur to Kashmir - 07:30am to 17:20pm");
	    System.out.println("\n9.Kolhapur to Kerala - 09:45am to 12:45pm");
	    System.out.println("\n10.Kolhapur to Rajasthan - 08:25am to 14:40pm");
	    System.out.println("\n11.Kolhapur to Goa - 09:15am to 10:25pm");
	    System.out.println("\n12.Kolhapur to Hyderabad - 08:45am to 12:30pm");
	   }
	    
	    

	public void bookTicket()
	{
	   	int ch;
		Scanner sc =new Scanner(System.in);
		
		this.viewFlights();
		System.out.println("\n\nEnter your choice:");
		ch=sc.nextInt();
		System.out.println("Enter number of passengers:");
		no=sc.nextInt();
		System.out.println("Enter name:");
		name=sc.next();
		if(ch==1)
		{
			System.out.println("\n\nDisplaying booking details...");
			System.out.println("\n\nBooking number:"+bid+"\t\t\t\tBooking date:"+df.format(d));
			System.out.println("\nSource(from):Kolhapur");
			System.out.println("\nDestination(to):Pune");
			System.out.println("\nDeparture time: 09:00am");
			System.out.println("\nArrival time: 09:30am");
			System.out.println("\nNumber of passengers:"+no);
			System.out.println("\nName:"+name);
			amount=20000*no;
			System.out.println("\n\t\t\t\t\tTotal amount:"+amount);
			//bid+=1;
		
		}
		else if(ch==2)
		{
			System.out.println("\n\nDisplaying booking details...");
			System.out.println("\n\nBooking number:"+bid+"\t\t\t\tBooking date:"+df.format(d));
			System.out.println("\nSource(from):Kolhapur");
			System.out.println("\nDestination(to):Bombay");
			System.out.println("\nDeparture time: 10:00am");
			System.out.println("\nArrival time: 11:00am");
			System.out.println("\nNumber of passengers:"+no);
			System.out.println("Name:"+name);
			amount=25000*no;
			System.out.println("\n\t\t\t\t\tTotal amount:"+amount);
			//bid+=1;
			

		}
		else if(ch==3)	
		{
			System.out.println("\n\nDisplaying booking details...");
			System.out.println("\n\nBooking number:"+bid+"\t\t\t\tBooking date:"+df.format(d));
			System.out.println("\nSource(from):Kolhapur");
			System.out.println("\nDestination(to):Banglore");
			System.out.println("\nDeparture time: 09:30am");
			System.out.println("\nArrival time: 13:00pm");
			System.out.println("\nNumber of passengers:"+no);
			System.out.println("\nName:"+name);
			amount=30000*no;
			System.out.println("\n\t\t\t\t\tTotal amount:"+amount);
			//bid+=1;
		}
		else if(ch==4)	
		{
			System.out.println("\n\nDisplaying booking details...");
			System.out.println("\n\nBooking number:"+bid+"\t\t\t\tBooking date:"+df.format(d));
			System.out.println("\nSource(from):Kolhapur");
			System.out.println("\nDestination(to):Delhi");
			System.out.println("\nDeparture time: 08:00am");
			System.out.println("\nArrival time: 15:00pm");
			System.out.println("\nNumber of passengers:"+no);
			amount=50000*no;
			System.out.println("\n\t\t\t\t\tTotal amount:"+amount);
			//bid+=1;
		}
		else if(ch==5)	
		{
			System.out.println("\n\nDisplaying booking details...");
			System.out.println("\n\nBooking number:"+bid+"\t\t\t\tBooking date:"+df.format(d));
			System.out.println("\nSource(from):Kolhapur");
			System.out.println("\nDestination(to):Ahemdabad");
			System.out.println("\nDeparture time: 08:30am");
			System.out.println("\nArrival time: 12:30pm");
			System.out.println("\nNumber of passengers:"+no);
			System.out.println("Name:"+name);
			amount=55000*no;
			System.out.println("\n\t\t\t\t\tTotal amount:"+amount);
			//bid+=1;
		}
		else if(ch==6)
		{
		    System.out.println("\n\nDisplaying booking details...");
			System.out.println("\n\nBooking number:"+bid+"\t\t\t\tBooking date:"+df.format(d));
			System.out.println("\nSource(from):Kolhapur");
			System.out.println("\nDestination(to):Kolkata");
			System.out.println("\nDeparture time: 10:00am");
			System.out.println("\nArrival time: 18:00pm");
			System.out.println("\nNumber of passengers:"+no);
			System.out.println("Name:"+name);
			amount=55000*no;
			System.out.println("\n\t\t\t\t\tTotal amount:"+amount);
			//bid+=1}
}
			
else if(ch==7)
{
     System.out.println("\n\nDisplaying booking details...");
     System.out.println("\n\nBooking number:"+bid+"\t\t\t\tBooking date:"+df.format(d));
     System.out.println("\nSource(from):Kolhapur");
	 System.out.println("\nDestination(to):Mysore");
	 System.out.println("\nDeparture time: 11:00am");
	 System.out.println("\nArrival time: 15:00pm");
	 System.out.println("\nNumber of passengers:"+no);
	 System.out.println("Name:"+name);
	 amount=55000*no;
	 System.out.println("\n\t\t\t\t\tTotal amount:"+amount);
	 //bid+=1}
			
}
else if(ch==8)
{
    System.out.println("\n\nDisplaying booking details...");
    System.out.println("\n\nBooking number:"+bid+"\t\t\t\tBooking date:"+df.format(d));
    System.out.println("\nSource(from):Kolhapur");
	System.out.println("\nDestination(to):Kashmir");
	System.out.println("\nDeparture time: 07:30am");
	System.out.println("\nArrival time: 17:20pm");
	System.out.println("\nNumber of passengers:"+no);
	System.out.println("Name:"+name);
	amount=55000*no;
	System.out.println("\n\t\t\t\t\tTotal amount:"+amount);
	//bid+=1}
}
else if(ch==9)
{
    System.out.println("\n\nDisplaying booking details...");
    System.out.println("\n\nBooking number:"+bid+"\t\t\t\tBooking date:"+df.format(d));
    System.out.println("\nSource(from):Kolhapur");
	System.out.println("\nDestination(to):Kerala");
	System.out.println("\nDeparture time: 09:45am");
	System.out.println("\nArrival time: 12:45pm");
	System.out.println("\nNumber of passengers:"+no);
	System.out.println("Name:"+name);
	amount=55000*no;
	System.out.println("\n\t\t\t\t\tTotal amount:"+amount);
	//bid+=1}
}
else if(ch==10)
{
    System.out.println("\n\nDisplaying booking details...");
    System.out.println("\n\nBooking number:"+bid+"\t\t\t\tBooking date:"+df.format(d));
    System.out.println("\nSource(from):Kolhapur");
	System.out.println("\nDestination(to):Rajasthan");
	System.out.println("\nDeparture time: 08:25am");
	System.out.println("\nArrival time: 14:40pm");
	System.out.println("\nNumber of passengers:"+no);
	System.out.println("Name:"+name);
	amount=55000*no;
	System.out.println("\n\t\t\t\t\tTotal amount:"+amount);
	//bid+=1}
}
else if(ch==11)
{
    System.out.println("\n\nDisplaying booking details...");
    System.out.println("\n\nBooking number:"+bid+"\t\t\t\tBooking date:"+df.format(d));
    System.out.println("\nSource(from):Kolhapur");
	System.out.println("\nDestination(to):Goa");
	System.out.println("\nDeparture time: 09:15am");
	System.out.println("\nArrival time: 10:25pm");
	System.out.println("\nNumber of passengers:"+no);
	System.out.println("Name:"+name);
	amount=55000*no;
	System.out.println("\n\t\t\t\t\tTotal amount:"+amount);
	//bid+=1}
}
else if(ch==12)
{
    System.out.println("\n\nDisplaying booking details...");
     System.out.println("\n\nBooking number:"+bid+"\t\t\t\tBooking date:"+df.format(d));
     System.out.println("\nSource(from):Kolhapur");
	 System.out.println("\nDestination(to):Hyderabad");
	 System.out.println("\nDeparture time: 08:45am");
	 System.out.println("\nArrival time: 12:30pm");
	 System.out.println("\nNumber of passengers:"+no);
	 System.out.println("Name:"+name);
	 amount=55000*no;
	 System.out.println("\n\t\t\t\t\tTotal amount:"+amount);
	 //bid+1}
}
        else
		{
			System.out.println("Wrong choice entered");
		}
}
	

	public void cancelTicket()
	{
		int id;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\nEnter booking id:");
		id=sc.nextInt();
		if(id==bid)
		{
			System.out.println("\n\nDisplaying booking details...");	
			System.out.println("\n\nBooking number:"+bid+"\t\t\t\tBooking date:"+df.format(d));
			System.out.println("\nSource(from):Kolhapur");
			System.out.println("\nDestination(to):Delhi");
			System.out.println("\nDeparture time: 08:00am");
			System.out.println("\nArrival time: 15:00pm");
			System.out.println("\nNumber of passengers:"+no);
			System.out.println("\n\t\t\t\t\tTotal amount:"+amount);
			System.out.println("\n\nCancellation charges(30% of amount):"+amount*0.3);
			System.out.println("\n\nAmount refundable:"+(amount-amount*0.3));
		}
		else
		{
			System.out.println("\n\nBooking id not found");
		}
	}
	public static void main(String args[])
	{
		int count=6,ch;
		String username="",password="";
		Scanner sc=new Scanner(System.in);
		AirlineReservation ar=new AirlineReservation ();
		System.out.println("\n\t\t...********WELCOME TO AIRLINE RESERVATION********...");
		do
		{
		System.out.println("\nAuthentication required...");
		System.out.println("\nEnter username:");
		username=sc.next();
		System.out.println("\nEnter password:");
		password=sc.next();
		if(username.equals("admin") && password.equals("4"))
		{
			do
			{
			System.out.println("\nSelect your choice");
			System.out.println("\n1.Details");
			System.out.println("\n2.DisplayDetails");
			System.out.println("\n3.Airlines");
			System.out.println("\n4.View flights");
			System.out.println("\n5.Flight timings");
			System.out.println("\n6.Book tickets");
			System.out.println("\n7.Cancel tickets");
			System.out.println("\n8.Exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				ar.Details();
				break;
				
				case 2:
				ar.DisplayDetails();
				break;

				case 3:
				ar.Airlines();
				break;

				case 4:
				ar.viewFlights();
				break;

				case 5:
				ar.flightTimings();
				break;
				
				case 6:
				ar.bookTicket();
				break;
				
				case 7:
				ar.cancelTicket();
				break;
				
				case 8:
				System.exit(0);
					
				default:
				System.out.println("Wrong choice entered");
			}
			}while(ch!=5);		
	
		}
		else
		{
			count=count-1;
			System.out.println("\nInvalid username or password, please try again");
			System.out.println("\nRemaining attempts:"+count);
		}
		}while(count>=1);
		}
}                                    
