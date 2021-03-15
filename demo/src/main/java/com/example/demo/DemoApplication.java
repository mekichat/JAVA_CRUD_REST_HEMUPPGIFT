package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// public void AddPlayer()
	// {
	// 	System.out.println(" ***  ADD NEW PLAYER *** ");
	// 	System.out.println("Namn:");
	// 	String namn = System.console().readLine(); 			
	// 	System.out.println("Age:");
	// 	int age = Integer.parseInt(System.console().readLine()); 			
	// 	System.out.println("Jerseynumber:");
	// 	int jersey = Integer.parseInt(System.console().readLine()); 	
	// 	System.out.println("Stad:");
	// 	String city = System.console().readLine(); 	
		
	// 	Player p = new Player();
	// 	p.SetAge(age);
	// 	p.SetNamn(namn);
	// 	p.SetJersey(jersey);
	// 	p.SetBorn(city);	

	// 	playerRepository.save(p);
	// }

	// private void ListPlayer() {
	// 	if(playerRepository.findAll() != null){
			
	// 		Iterable<Player> iterator = playerRepository.findAll();
			
	// 		System.out.printf("%-15s %-15s %-15s %-15s %n", "ID","Name","Age","Jersy");
	// 	    System.out.println("------------------------------------------------------------------");			
	// 		StringBuilder sbuf = new StringBuilder();
	// 		Formatter fmt = new Formatter(sbuf);
		
	// 		for (Player player : iterator) {				
				
	// 			fmt.format("%-15d %-15s %-15d %-15d %n", player.getId(), player.GetNamn(),player.GetAge(),player.GetJersey());
	// 			System.out.print(sbuf.toString());
	// 			sbuf.setLength(0);		
		
	// 		}
	// 		System.out.println("------------------------------------------------------------------");
	// 		fmt.close();

	// 	}
	// 	else{
	// 	 	System.out.println("Please Add Player First to the player list!!");
	// 	}
	// 	System.out.println("");		
	// }

	// private void UpdatePlayer() {
	// 	if(playerRepository.findAll() != null){			
			
	// 		System.out.print("Which Player ID number are you going to update? ");
	// 		int sel = Integer.parseInt(System.console().readLine());
	// 		System.out.println("");
	// 		System.out.println("Which property of the player are you going to update? ");
	// 		System.out.println(" 1. Name of the Player ");
	// 		System.out.println(" 2. Age of the Player ");
	// 		System.out.println(" 3. Jersy number of the Player ");
	// 		System.out.println(" 4. Born city of the Player ");
	// 		System.out.println(" 5. All property of the Player ");
	// 		int val = Integer.parseInt(System.console().readLine());
	// 		try {
	// 			  Player player = playerRepository.findById(sel).get();
	// 		      if(player != null){
	// 				 switch(val){
	// 						case 1:
	// 							System.out.print("Please provide Name of the Player: ");   
	// 							String name = System.console().readLine();
	// 							System.out.println("");				   
	// 							player.SetNamn(name);
	// 							playerRepository.save(player);							
	// 							break;
	// 						case 2:
	// 							System.out.print("Please provide Age of the Player: ");   
	// 							int age = Integer.parseInt(System.console().readLine());
	// 							System.out.println("");
	// 							player.SetAge(age);
	// 							playerRepository.save(player);
	// 							break;
	// 						case 3:
	// 							System.out.print("Please provide Jersy Number of the Player: ");   
	// 							int jersy = Integer.parseInt(System.console().readLine());
	// 							System.out.println("");				   
	// 							player.SetJersey(jersy);
	// 							playerRepository.save(player);
	// 							break;
	// 						case 4:
	// 							System.out.print("Please provide Born city of the Player: ");   
	// 							String city = System.console().readLine();
	// 							System.out.println("");				   
	// 							player.SetBorn(city);
	// 							playerRepository.save(player);
	// 							break;
	// 						case 5:
	// 							System.out.print("Please provide Name of the Player ");   
	// 							String playerName = System.console().readLine();
	// 							System.out.println("");
	// 							player.SetNamn(playerName);
	// 							System.out.print("Please provide Age of the Player ");   
	// 							int playerAge = Integer.parseInt(System.console().readLine());
	// 							System.out.println("");
	// 							player.SetAge(playerAge);
	// 							System.out.print("Please provide Jersy Number of the Player ");   
	// 							int playerJersy = Integer.parseInt(System.console().readLine());
	// 							System.out.println("");				     
	// 							player.SetJersey(playerJersy);
	// 							System.out.print("Please provide Born city of the Player: ");   
	// 							String playerCity = System.console().readLine();
	// 							System.out.println("");				   
	// 							player.SetBorn(playerCity);
	// 							playerRepository.save(player);				     
	// 							break;
	// 						default:
	// 							System.out.println(" You didn't provide correct selection");
	// 							break;
	// 				    }					
	// 		        }	
	// 		}catch (Exception e) {
	// 			//TODO: handle exception				
	// 				System.out.println("Please Add Player First to the player list!!");
	// 				System.out.println(e);
	// 	    }
	// 	}
	// 	else{
	// 			System.out.println("No Player to be updated from player table!!");
	// 	}	
	// 	System.out.println("");		 
	// }

	// private void RemovePlayer() {
	// 	System.out.print("Which Player ID number are you going to delete? ");
	// 	int sel = Integer.parseInt(System.console().readLine());
	// 	System.out.println("");			
	// 	try {
	// 		Player player = playerRepository.findById(sel).get();
	// 		if(player != null){			
	// 			playerRepository.delete(player);			
	// 		}			
	// 	}catch (Exception e) {
	// 		//TODO: handle exception			
	// 			System.out.println("No Player to be removed from player table!!");
	// 			System.out.println(e);			
	// 	}
		
	// 	System.out.println("");

	// }

	// @Override
	// public void run(String... args) throws Exception {
	// 	while(control){
	// 		System.out.println(" ***  MENU *** ");
	// 		System.out.println(" 1. Add New Player ");
	// 		System.out.println(" 2. List Player ");
	// 		System.out.println(" 3. Update Player ");
	// 		System.out.println(" 4. Remove Player ");
	// 		System.out.println(" 100. Exit ");
	// 		System.out.print(" Ange val> ");			
	// 		int sel = Integer.parseInt(System.console().readLine());
	// 		System.out.println("");			
	// 		switch(sel){
	// 			case 100:
	// 			  control = false;				  
	// 			  break;
	// 			case 1:
	// 			  AddPlayer();
	// 			  break;
	// 			case 2:
	// 			  ListPlayer(); 
	// 			  break;
	// 			case 3:
	// 			  UpdatePlayer();				     
	// 			  break;
	// 			case 4:
	// 			  RemovePlayer();				     
	// 			  break;  
	// 			default:
	// 			   System.out.println(" You didn't provide correct selection, please select valid option!!");
	// 			   break;
	// 		}
	// 	}

	// }

}
