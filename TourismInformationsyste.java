import java.util.*;
import java.io.*;
interface Demo{
void message();
}
class TourismInformationsyste extends Administrator{	
    TourismInformationsyste()
{
Scanner in=new Scanner(System.in);
System.out.println("-----------------------Welcome to Tourism Information System--------------------");
System.out.println("                       1.Administrator"+"\n                       2.Traveller                                      ");
System.out.println("--------------------------------------------------------------------------------");
System.out.println("Enter your option");

ch=in.nextInt();
Traveller t1=new Traveller();
switch(ch)
{
	case 1:flag=1;
		System.out.println("Enter password");
		int count=0;
		ch1=in.nextInt();
		
		
		if(ch1==2)
                {
		
		administrator();
                break;
                }
		else
                {
		System.out.println("Wrong password");
		break;
                }
        
            
	case 2:flag=0;
		t1.traveller();	
		break;
	default:System.out.println("Invalid option");
}
}
    public static void main(String args[])throws Exception
{
Ratings r=new Ratings();
Scanner in=new Scanner(System.in);
while(true)
{
TourismInformationsyste t=new TourismInformationsyste();


System.out.println("Do you want to exit Please rate Enter 1");
t.ch=in.nextInt();
if(t.ch==1)
{
System.out.println("Enter rating out of 5");
t.ch=in.nextInt();
if(t.ch==1)
ocount++;
else if(t.ch==2)
tcount++;
else if(t.ch==3)
thcount++;
else if(t.ch==4)
fcount++;
else if(t.ch==5)
ficount++;
//message();
}
System.out.println("Do you want to exit Enter 1");
t.ch=in.nextInt();
if(t.ch==1)
break;
}
}
}

class Information{
    static int temp,ch,htoadult=1000,htsadult=2000,htdadult=3000,htochildren=500,htschildren=1000,htdchildren=2000,children=2000;
static int ktoadult=1000,ktsadult=2000,ktdadult=3000,ktochildren=500,ktschildren=1000,ktdchildren=2000;
static int rtoadult=1000,rtsadult=2000,rtdadult=3000,rtochildren=500,rtschildren=1000,rtdchildren=2000;
static int ch1,ndl=2000,nndl=1000,rdl=4000,rndl=3000,hdl=4000,hndl=2000,kdl=2000,kndl=1000,gdl=2000,gndl=1000,sdl=3000,sndl=2000,ocount=0,tcount=0,thcount=0,fcount=0,ficount=0,flag=0;

    void travelAgencies()
{
Scanner in=new Scanner(System.in);
System.out.println("------------------------------Travels Information------------------------------------------");
System.out.println("                              1.Hanuman travels"+"\n                              2.krishna travels"+"\n                              3.rama travels");
System.out.println("-----------------------------------------------------------------");
System.out.println("Enter your option");
ch=in.nextInt();
switch(ch)
{
	case 1:hanumanTravels();
		break;
	case 2:krishnaTravels();
		break;
	case 3:ramaTravels();
		break;
}
}
void hanumanTravels()
{
System.out.println("-------------------------------Hanuman Travels Prices------------------------------------");
if(ch1==1)
{
System.out.println("                              Category		  Price(Rs)");
System.out.println("                                Adult                   "+htoadult+
		"\n                                children                "+htochildren);
}
else if(ch1==2)
{
System.out.println("                              Category		  Price(Rs)");
System.out.println("                                Adult                   "+htsadult+
		"\n                                children                "+htschildren);
}
else if(ch1==3)
{
System.out.println("                              Category		  Price(Rs)");
System.out.println("                                Adult                   "+htdadult+
		"\n                                children                "+htdchildren);
}
}
void krishnaTravels()
{
System.out.println("---------------------------------Krishna Travels Prices------------------------------------");
if(ch1==1)
{
System.out.println("                              Category		  Price(Rs)");
System.out.println("                                Adult                   "+ktoadult+
		"\n                                children                "+ktochildren);
}
else if(ch1==2)
{
System.out.println("                              Category		  Price(Rs)");
System.out.println("                                Adult                   "+ktsadult+
		"\n                                children                "+ktschildren);
}
else if(ch1==3)
{
System.out.println("                              Category		  Price(Rs)");
System.out.println("                                Adult                   "+ktdadult+
		"\n                                children                "+ktdchildren);
}
}
void ramaTravels()
{
System.out.println("--------------------------------Rama Travels Prices------------------------------------");
if(ch1==1)
{
System.out.println("                              Category		  Price(Rs)");
System.out.println("                                Adult                   "+rtoadult+
		"\n                                children                "+rtochildren);
}
else if(ch1==2)
{
System.out.println("                              Category		  Price(Rs)");
System.out.println("                                Adult                   "+rtsadult+
		"\n                                children                "+rtschildren);
}
else if(ch1==3)
{
System.out.println("                              Category		  Price(Rs)");
System.out.println("                                Adult                   "+rtdadult+
		"\n                                children                "+rtdchildren);
}
}
void places()
{
Scanner in=new Scanner(System.in);
System.out.println("---------------------------------------------Places--------------------------");
System.out.println("                              1.ooty"+"\n                              2.Simla"+"\n                              3.Darjeeling");
System.out.println("-------------------------------------------------------------------------");
System.out.println("Enter your option");
ch1=in.nextInt();
switch(ch1)
{
	case 1:System.out.println("\n                              1.Travel Agencies"+"\n                              2.Lodging Information");
		System.out.println("Enter your option");
		ch=in.nextInt();
		switch(ch)
		{
		
		case 1:travelAgencies();
			break;
		case 2:lodgingInformation();
			break;
		}
		break;
	case 2:System.out.println("\n                              1.Travel Agencies"+"\n                              2.Lodging Information");
		System.out.println("Enter your option");
		ch=in.nextInt();
		switch(ch)
		{
		
		case 1:travelAgencies();
			break;
		case 2:lodgingInformation();
			break;
		}
		break;
	case 3:System.out.println("\n                              1.Travel Agencies"+"\n                              2.Lodging Information");
		System.out.println("Enter your option");
		ch=in.nextInt();
		switch(ch)
		{
		
		case 1:travelAgencies();
			break;
		case 2:lodgingInformation();
			break;
		}
		break;
}
}

void lodgingInformation()
{
System.out.println("----------------------------------------------Lodges----------------------------");
Scanner in=new Scanner(System.in);
if(ch1==1)
{
System.out.println("                              1.Narayana lodge"+"\n                              2.Ram lodge");
System.out.println("-----------------------------------------------------------------");
System.out.println("Enter your option");
ch=in.nextInt();
switch(ch)
{
	case 1:System.out.println("                              1.Deluxe"+"\n                              2.Non deluxe");
		System.out.println("---------------------");
		System.out.println("Enter your option");
		ch=in.nextInt();
		switch(ch)
		{
		case 1:System.out.println("                              Category		Price(Rs)");
System.out.println("                                Adult                   "+ndl+
		"\n                                children                "+ndl);
			break;
		case 2:System.out.println("                              Category		Price(Rs)");
System.out.println("                                Adult                   "+nndl+
		"\n                                children                "+nndl);
			break;
		}
		break;
	case 2:System.out.println("                              1.Deluxe"+"\n                              2.Non deluxe");
		System.out.println("---------------------");
		System.out.println("Enter your option");
		ch=in.nextInt();
		switch(ch)
		{
		case 1:System.out.println("                              Category		Price(Rs)");
System.out.println("                                Adult                   "+rdl+
		"\n                                children                "+rdl);
			break;
		case 2:System.out.println("                              Category		Price(Rs)");
System.out.println("                                Adult                   "+rndl+
		"\n                                children                "+rndl);
			break;
		}
		break;
}
}
else if(ch1==2)
{
System.out.println("                              1.hanuman lodge"+"\n                              2.krishna lodge");
ch=in.nextInt();
switch(ch)
{
	case 1:System.out.println("                              1.Deluxe"+"\n                              2.Non deluxe");
		System.out.println("---------------------");
		System.out.println("Enter your option");
		ch=in.nextInt();
		switch(ch)
		{
		case 1:System.out.println("                              Category		Price(Rs)");
System.out.println("                                Adult                   "+hdl+
		"\n                                children                "+hdl);
			break;
		case 2:System.out.println("                              Category		Price(Rs)");
System.out.println("                                Adult                   "+hndl+
		"\n                                children                "+hndl);
			break;
		}
		break;
	case 2:System.out.println("                              1.Deluxe"+"\n                              2.Non deluxe");
		System.out.println("---------------------");
		System.out.println("Enter your option");
		ch=in.nextInt();
		switch(ch)
		{
		case 1:System.out.println("                              Category		Price(Rs)");
System.out.println("                                Adult                   "+kdl+
		"\n                                children                "+kdl);
			break;
		case 2:System.out.println("                              Category		Price(Rs)");
System.out.println("                                Adult                   "+kndl+
		"\n                                children                "+kndl);
			break;
		}
		break;
}
}
else if(ch1==3)
{
System.out.println("                              1.Govinda lodge"+"\n                              2.simla lodge");
ch=in.nextInt();
switch(ch)
{
	case 1:System.out.println("                              1.Deluxe"+"\n                              2.Non deluxe");
		System.out.println("---------------------");
		System.out.println("Enter your option");
		ch=in.nextInt();
		switch(ch)
		{
		case 1:System.out.println("                              Category		Price(Rs)");
System.out.println("                                Adult                   "+gdl+
		"\n                                children                "+gdl);
			break;
		case 2:System.out.println("                              Category		Price(Rs)");
System.out.println("                                Adult                   "+gndl+
		"\n                                children                "+gndl);
			break;
		}
		break;
	case 2:System.out.println("                              1.Deluxe"+"\n                              2.Non deluxe");
		System.out.println("---------------------");
		System.out.println("Enter your option");
		ch=in.nextInt();
		switch(ch)
		{
		case 1:System.out.println("                              Category		Price(Rs)");
System.out.println("                                Adult                   "+sdl+
		"\n                                children                "+sdl);
			break;
		case 2:System.out.println("                              Category		Price(Rs)");
System.out.println("                                Adult                   "+sndl+
		"\n                                children                "+sndl);
			break;
		}
		break;
}
}
}
}
class Administrator extends Information{
int temp;
public void message()
{
System.out.println("Thank you");
}
    void administrator()
{
Scanner in=new Scanner(System.in);
System.out.println("----------------------View Bookings------------------------------------------------");
System.out.println("                      1.ooty"+"\n                      2.Simla"+"\n                      3.Darjeeling"+"\n                      4.View Ratings");
System.out.println("----------------------------------------------");
		System.out.println("Enter your option");
ch1=in.nextInt();
if(ch1==4)
{
System.out.println("-----------------------------Ratings--------------------------");
System.out.println("                     5 rating:"+ficount);
System.out.println("                     4 rating:"+fcount);
System.out.println("                     3 rating:"+thcount);
System.out.println("                     2 rating:"+tcount);
System.out.println("                     1 rating:"+ocount);
}
else
{
System.out.println("                              1.Modify travelAgencies prices"+"\n                              2.Modify lodging information");
ch=in.nextInt();
System.out.println("---------------------");
		System.out.println("Enter your option");
switch(ch)
{
	case 1:travelAgencies(1);
		break;
	
	case 2:lodgingInformation(1);
		break;
	
}
}
}
void lodgingInformation(int x)
{
Scanner in=new Scanner(System.in);
System.out.println("-----------------------------------Lodges---------------------------------");
if(ch1==1)
{
System.out.println("                              1.Narayana lodge"+"\n                              2.Ram lodge");
System.out.println("---------------------");
		System.out.println("Enter your option");
ch=in.nextInt();
System.out.println("If you want to modify the price enter the price else enter 0");
switch(ch)
{
	case 1:System.out.println("Enter deluxe prices");
		temp=in.nextInt();
		if(temp!=0)
		ndl=temp;
                
	System.out.println("Enter non deluxe price");
		temp=in.nextInt();
		if(temp!=0)
		nndl=temp;
                
               break;
	case 2:System.out.println("Enter deluxe prices");
		temp=in.nextInt();
		if(temp!=0)
		ndl=temp;
	System.out.println("Enter non deluxe price");
		temp=in.nextInt();
		if(temp!=0)
		nndl=temp;
        break;
}
}
else if(ch1==2)
{
System.out.println("                              1.hanuman lodge"+"\n                              2.krishna lodge");
ch=in.nextInt();
switch(ch)
{
	case 1:System.out.println("Enter deluxe prices");
		temp=in.nextInt();
		if(temp!=0)
		rdl=temp;
	System.out.println("Enter non deluxe price");
		temp=in.nextInt();
		if(temp!=0)
		rndl=temp;
	break;
	case 2:System.out.println("Enter deluxe prices");
		temp=in.nextInt();
		if(temp!=0)
		kdl=temp;
	System.out.println("Enter non deluxe price");
		temp=in.nextInt();
		if(temp!=0)
		kndl=temp;
	break;
}
}
else if(ch1==3)
{
System.out.println("                              1.Govinda lodge"+"\n                              2.simla lodge");
ch=in.nextInt();
switch(ch)
{
	case 1:System.out.println("Enter deluxe prices");
		temp=in.nextInt();
		if(temp!=0)
		gdl=temp;
	System.out.println("Enter non deluxe price");
		temp=in.nextInt();
		if(temp!=0)
		gndl=temp;
	break;
	case 2:System.out.println("Enter deluxe prices");
		temp=in.nextInt();
		if(temp!=0)
		sdl=temp;
            System.out.println("Enter non deluxe price");
		temp=in.nextInt();
		if(temp!=0)
		sndl=temp;
                
	break;
}
}
}
void travelAgencies(int x)
{
Scanner in=new Scanner(System.in);
System.out.println("                              1.Hanuman travels"+"\n                              2.krishna travels"+"\n                              3.rama travels");
System.out.println("Enter your option");
ch=in.nextInt();
System.out.println("If you want to modify the price enter the price else enter 0");
switch(ch)
{
	case 1:System.out.println("Enter new prices for adult and children tickets");
		if(ch1==1)
		{
		System.out.println("Enter adult ticket");
		temp=in.nextInt();
		if(temp!=0)
		htoadult=temp;
	System.out.println("Enter children ticket");
		temp=in.nextInt();
		if(temp!=0)
		htochildren=temp;
		}
		else if(ch1==2)
		{
		System.out.println("Enter adult ticket");
		temp=in.nextInt();
		if(temp!=0)
		htsadult=temp;
	System.out.println("Enter children ticket");
		temp=in.nextInt();
		if(temp!=0)
		htschildren=temp;
		}
		else if(ch1==3)
		{
		System.out.println("Enter adult ticket");
		temp=in.nextInt();
		if(temp!=0)
		htdadult=temp;
	System.out.println("Enter children ticket");
		temp=in.nextInt();
		if(temp!=0)
		htdchildren=temp;
		}
		break;
	case 2:System.out.println("Enter new prices for adult and children tickets");
		if(ch1==1)
		{
		System.out.println("Enter adult ticket");
		temp=in.nextInt();
		if(temp!=0)
		ktoadult=temp;
	System.out.println("Enter children ticket");
		temp=in.nextInt();
		if(temp!=0)
		ktochildren=temp;
		}
		else if(ch1==2)
		{
		System.out.println("Enter adult ticket");
		temp=in.nextInt();
		if(temp!=0)
		ktsadult=temp;
	System.out.println("Enter children ticket");
		temp=in.nextInt();
		if(temp!=0)
		ktschildren=temp;
		}
		else if(ch1==3)
		{
		System.out.println("Enter adult ticket");
		temp=in.nextInt();
		if(temp!=0)
		ktdadult=temp;
	System.out.println("Enter children ticket");
		temp=in.nextInt();
		if(temp!=0)
		ktdchildren=temp;
		}
		break;
	case 3:System.out.println("Enter new prices for adult and children tickets");
		if(ch1==1)
		{
		System.out.println("Enter adult ticket");
		temp=in.nextInt();
		if(temp!=0)
		rtoadult=temp;
	System.out.println("Enter children ticket");
		temp=in.nextInt();
		if(temp!=0)
		rtochildren=temp;
		}
		else if(ch1==2)
		{
		System.out.println("Enter adult ticket");
		temp=in.nextInt();
		if(temp!=0)
		rtsadult=temp;
	System.out.println("Enter children ticket");
		temp=in.nextInt();
		if(temp!=0)
		rtschildren=temp;
		}
		else if(ch1==3)
		{
		System.out.println("Enter adult ticket");
		temp=in.nextInt();
		if(temp!=0)
		rtdadult=temp;
	System.out.println("Enter children ticket");
		temp=in.nextInt();
		if(temp!=0)
		rtdchildren=temp;
		}
		break;
}
}		
}
class Ratings extends Information{
void message()
{
Scanner in=new Scanner(System.in);
if(flag==0)
{
System.out.println("Enter your rating out of 5");
int ch=in.nextInt();
if(ch==1)
ocount++;
else if(ch==2)
tcount++;
else if(ch==3)
thcount++;
else if(ch==4)
fcount++;
else if(ch==5)
{
ficount++;
System.out.println(ficount);
}
}
System.out.println("Thank you");
}
}
final class Traveller extends Information{
/*public void message()
{
System.out.println("Thank you");
}*/
    void traveller()
{
Scanner in=new Scanner(System.in);
System.out.println("------------------------places to see--------------------------");
System.out.println("Enter 1 to see places");
ch=in.nextInt();
switch(ch)
{
	
	
	
	case 1:places();
		break;
}
}
}






