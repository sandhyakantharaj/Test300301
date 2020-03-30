package club;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
 
public class Team extends SportsClub{

	  public Team(String firstName, String lastName, String role, String gender,
	  String nationality, LocalDate DOB, String addressLine1, String
	  addressLine2,String city, String state, String postcode, String country) 
	  {
	  
	  this.setFirstName(firstName); 
	  this.setLastName(lastName);
	  this.setGender(gender); 
	  this.setNationality(nationality); 
	  this.setDOB(DOB);
	  this.setAddressLine1(addressLine1); 
	  this.setAddressLine2(addressLine2);
	  this.setCity(city); 
	  this.setState(state); 
	  this.setZipcode(postcode);
	  this.setCountry(country); 
	  this.setRole(role);
	 
	
	
	  }
	 
	
	  public Team() { 
		  }
	  
	 
	static ArrayList<Team> memAry1 = Main.memberdetails;


	  static ArrayList<Team> memAry2 = new ArrayList<Team>();
	  static ArrayList<Team>memAry3=Main.coachdetails;
	  
	  Random random=new Random();

	  boolean x=true; 
	  int i=0;
	 
	  	  //Junior Male Player
	  	  public void getJuniorMalePlayer(int teamsize) 
	  	  {
	  		 
	  		  while(x) {
	  		
	  			
	  			  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now()); int
	  			  year=age.getYears();
	  			 
	  	  
	  	  if ( (year<18)  && (memAry1.get(i).getGender().contentEquals("MALE")) )
	  	  {
	  		  
	  	  memAry2.add(memAry1.get(i)); 
	  	  
	  	  }
	  	  i++; 
	  	 
	  	  
	  			
	  			  if(memAry2.size()==teamsize)
	  			  {
	  				  x=false;
	  			  
	  			  System.out.println("Here you go:" );
	  			  System.out.println(memAry2.toString().replace("[", " ").replace("]", " ").replace(",", " ")); 
	  			  }
	  			   
	  		  }
	  	 
	  	
	  }
	  	  
	  	 
	  	  //junior female player
	  	  public void getJuniorFemalePlayer(int teamsize) 
	  	  {
	  		  while(x) {
	  		
	  	  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now());
	  	  int year=age.getYears();
	  	  
	  	  if ((year<18) && (memAry1.get(i).getGender().contentEquals("FEMALE")) ) 
	  	  {
	  		  
	  	  memAry2.add(memAry1.get(i)); 

	  	  
	  	  }
	  	  i++; 
	  	  
	  			
	  			  if(memAry2.size()==teamsize)
	  			  {
	  				  x=false;
	  			  
	  			  System.out.println("Here you go:" );
	  			  System.out.println(memAry2.toString().replace("[", " ").replace("]", " ").replace(",", " "));
	  			  }
	  		  }
	  			   
	  		  }
	  	  

	  	  
	  	  //male senior player
	  	  public void getMaleSeniorPlayer(int teamsize) { 
	  		  while(x) {
	  			  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now()); 
	  			  int year=age.getYears();
	  			  
	  			  
	  			  if((year >= 18) && (memAry1.get(i).getGender().contentEquals("MALE")) ) {
	  	  
	  				  memAry2.add(memAry1.get(i));
	  	  
	  			  		} i++;
	  	  
	  	  
	  	  
	  			  		if(memAry2.size()==teamsize) { x=false;
	  	  
	  			  		System.out.println("Here you go:" ); 
	  			  		System.out.println(memAry2.toString().replace("[", " ").replace("]", " ").replace(",", " ")); }
	  	  
	  		  			}
	  	  
	  	  
	  	  }

	
	  	//female senior player
	  	public void getFemaleSeniorPlayer(int teamsize) {
	  		// TODO Auto-generated method stub
	  		 while(x) {
	  			  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now()); 
	  			  int year=age.getYears();
	  			  
	  			  
	  			  if((year >= 18) && (memAry1.get(i).getGender().contentEquals("FEMALE") )) {
	  	  
	  				  memAry2.add(memAry1.get(i));
	  	  
	  			  		} i++;
	  	  
	  			  		if(memAry2.size()==teamsize) { 
	  			  			x=false;
	  	  
	  			  		System.out.println("Here you go:" ); 
	  			  		System.out.println(memAry2.toString().replace("[", " ").replace("]", " ").replace(",", " ")); }
	  	  
	  		  			}
	  	  
	  		
	  	}
	  	
	
	  	//junior mixed player
	  		public void getJuniorMixedPlayer(int teamsize) {
	  			// TODO Auto-generated method stub
	  			 while(x) {
	  				  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now()); 
	  				  int year=age.getYears();
	  				  
	  				  
	  				  if(year< 18)  {
	  		  
	  					  memAry2.add(memAry1.get(i));
	  		  
	  				  		} i++;
	  		  
	  				  		if(memAry2.size()==teamsize) { 
	  				  			x=false;
	  		  
	  				  		System.out.println("Here you go:" );
	  				  		
	  				  		System.out.println(memAry2.toString().replace("[", " ").replace("]", " ").replace(",", " ") ); }
	  		  
	  			  			}
	  		  
	  		}

	  		//senior mixed player
	  		public void getSeniorMixedPlayer(int teamsize) {
	  			 while(x) {
	  				  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now()); int
	  				  year=age.getYears();
	  				  
	  				  
	  				  if(year>= 18) {
	  		  
	  					  memAry2.add(memAry1.get(i));
	  		  
	  				  		} i++;
	  		  
	  				  		if(memAry2.size()==teamsize) { 
	  				  			x=false;
	  		  
	  				  		System.out.println("Here you go: " );
	  				  		
	  				  		System.out.println(memAry2.toString().replace("[", " ").replace("]", " ").replace(",", " ")); 
	  				  		
	  				  		}
	  		  
	  			  			}
	  		  
	  		}

	

	public void getMaleCoach() {
				System.out.println("  "+memAry3.get(0).toString());
		}
	public void getFemaleCoach() {
				System.out.println("  "+memAry3.get(1).toString());
		}
	
	public void getCoach() {
				/*
		 * int randomindex=(int) (Math.random()*memAry3.size()); System.out.println(" "+
		 * memAry3.get(randomindex));
		 */
				System.out.println(" " + "  "+ memAry3.get(0).toString());
				System.out.println(" " + "  " +memAry3.get(1).toString());
			}
	
	
	
	
	 
	 
	 String serialNo;
	
	  @Override public String toString() { String formattedDate =
	  DOB.format(DateTimeFormatter.ofPattern("dd/MM/YYYY"));
	  
	  return "  "+ role  + " "+ ":" + " "+ " "+firstName +" " + lastName +";"+
	  "      " + "Gender"+"="+ gender +";"+ "      "+"DOB"+"="+ formattedDate+"\n"; }
	 

//int j;
	
	
	  public int getCount(int teamsize) { // TODO Auto-generated method stub
	  for(int j=1;j<=teamsize;j++) { int count = j++; System.out.println(count);
	  return count; } return teamsize; }
	  
	 



}	
	
	
	
	  
























