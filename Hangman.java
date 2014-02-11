import acm.graphics.*;
import java.util.Scanner;
import acm.program.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Hangman extends GraphicsProgram {

		Scanner sc = new Scanner(System.in);
		
		//HangmanSchrift
		GLabel label1 = new GLabel("Hangman:", 100, 75);
		label1.setColor(Color.red);
		label1.setLocation(50.5,50.5);
		label1.setFont("arial-bold-14");
		add(label1);
		
		//Gewonnenschrift
		GLabel labelg = new GLabel("Du hast GEWONNEN! :)", 50, 50);
		labelg.setColor(Color.red);
		labelg.setLocation(50.5,140.5);
		labelg.setFont("arial-bold-14");

		//Verlorenschrift
		GLabel labell = new GLabel("GAME OVER!", 50, 50);
		labell.setColor(Color.red);
		labell.setLocation(50.5,140.5);
		labell.setFont("arial-bold-14");
		
		//UnterstrichH
		GLine lineH = new GLine(100, 105, 110, 105);
		add(lineH);
		
		//BuchstabeH
		GLabel labelH = new GLabel("H", 100, 105);
		
		//UnterstrichA
		GLine lineA = new GLine(115, 105, 125, 105);
		add(lineA);
		
		//BuchstabeA
		GLabel labelA = new GLabel("A", 115, 105);
		
		//UnterstrichN
		GLine lineN = new GLine(130, 105, 140, 105);
		add(lineN);
		
		//BuchstabeN
		GLabel labelN = new GLabel("N", 130, 105);
		
		//UnterstrichG
		GLine lineG = new GLine(145, 105, 155, 105);
		add(lineG);
		
		//BuchstabeG
		GLabel labelG = new GLabel("G", 145, 105);
		
		//UnterstrichM
		GLine lineM = new GLine(160, 105, 170, 105);
		add(lineM);
		
		//BuchstabeM
		GLabel labelM = new GLabel("M", 160, 105);
		
		//UnterstrichA2
		GLine lineA2 = new GLine(175, 105, 185, 105);
		add(lineA2);
		
		//BuchstabeA2
		GLabel labelA2 = new GLabel("A", 175, 105);
		
		//UnterstrichN2
		GLine lineN2 = new GLine(190, 105, 200, 105);
		add(lineN2);
		
		//BuchstabeN2
		GLabel labelN2 = new GLabel("N", 190, 105);
		
		//oval3.setColor(Color.red); 		# färbt
		//oval3.setLocation(20.5, 20.5); 	# setzt auf x, y
		//oval3.move(10.5,10.5);			# bewegt es um x, y
		
		//Boden
	 	GLine line1 = new GLine(20, 350, 200, 350);
	 	
	 	//Hügel(Kreis)
		GOval oval1 = new GOval(40, 305, 100, 100);

		//Hügel(Rechteck)
		GRect rect1 = new GRect(20, 351, 150, 55);
		rect1.setColor(Color.white);
		rect1.setFilled(true);
		rect1.setFillColor(Color.white);
		
		//Pfahl
		GLine line2 = new GLine(90, 305, 90, 151);
		
		//Balken
		GLine line3 = new GLine(60, 151, 190, 151);
		
		//Diagonale
		GLine line4 = new GLine(90, 201, 140, 151);
		
		//Kreis im Stützbalken 
		GOval oval2 = new GOval(98, 158, 12, 12);
		
		//Strick
		GLine line5 = new GLine(170, 151, 170, 195);
		
		//Kopf
		GOval oval3 = new GOval(160, 195, 20, 20);
		
		//Hals
		GLine line6 = new GLine(170, 216, 170, 260);
		
		//ArmL
		GLine line7 = new GLine(150, 240, 170, 230);
		
		//ArmR
		GLine line8 = new GLine(170, 230, 190, 240);
		
		//BeinL
		GLine line9 = new GLine(170, 260, 160, 290);
		
		//BeinR
		GLine line10 = new GLine(170, 260, 180, 290);
		
		//Hügel(Kreis)
		//GOval oval4 = new GOval(40, 305, 100, 100);
		
		//GewonnenSmilley
		
		GOval oval4a = new GOval(164, 200, 3, 3);//L_Auge
		GOval oval4b = new GOval(174, 200, 3, 3);//R_Auge
		GOval oval4c = new GOval(166, 205, 7, 7);//Mund
		
		GRect rect2 = new GRect(166, 205, 10, 4);//Rechteck über Mund für Lächeln
		rect2.setColor(Color.white);
		rect2.setFilled(true);
		rect2.setFillColor(Color.white);
		
		//VerlorenSmilley
		
		GOval oval5a = new GOval(165, 200, 3, 3);//L_Auge
		GOval oval5b = new GOval(175, 200, 3, 3);//R_Auge
		GOval oval5c = new GOval(169, 207, 7, 7);//Mund
		
		System.out.println("Dies ist ein Spiel namens Hangman. Bitte raten sie das Wort.");
		
		int state = 0;
		String buchstabe;
		boolean h = false;
		boolean a = false;
		boolean n = false;
		boolean g = false;
		boolean m = false;
		boolean hangm = false;
		boolean gameover = false;
	
		do{
		System.out.println("Bitte Buchstaben eingeben: ");
		buchstabe = sc.nextLine();
		//char letter = buchstabe.charAt(0);
		
		if (buchstabe.equals("h") && h == false){
			System.out.println("Richtig geraten!");
			h = true;
			add(labelH);
			if ( h == true && a == true && n == true && g == true && m == true){
				hangm = true; //Abbruchbedingung
			}
		}
		else if (buchstabe.equals("a") && a == false){
			System.out.println("Richtig geraten!");
			a = true;
			add(labelA);
			add(labelA2);
			if ( h == true && a == true && n == true && g == true && m == true){
				hangm = true; //Abbruchbedingung
			}
		}
		else if (buchstabe.equals("n") && n == false){
			System.out.println("Richtig geraten!");
			n = true;
			add(labelN);
			add(labelN2);
			if ( h == true && a == true && n == true && g == true && m == true){
				hangm = true; //Abbruchbedingung
			}
		}
		else if(buchstabe.equals("g") && g == false){
			System.out.println("Richtig geraten!");
			g = true;
			add(labelG);
			if ( h == true && a == true && n == true && g == true && m == true){
				hangm = true; //Abbruchbedingung
			}
		}
		else if(buchstabe.equals("m") && m == false){
			System.out.println("Richtig geraten!");
			m = true;
			add(labelM);
			if ( h == true && a == true && n == true && g == true && m == true){
				hangm = true; //Abbruchbedingung
			}
		}
		else if ( h == true && a == true && n && true && g == true && m == true){
			hangm = true; //Abbruchbedingung
		}
		
		else if (buchstabe.equals("h") && h == true){
			System.out.println("H wurde bereits eingegeben!");
			
		}
		else if (buchstabe.equals("a") && a == true){
			System.out.println("A wurde bereits eingegeben!");

		}
		else if (buchstabe.equals("n") && n == true){
			System.out.println("N wurde bereits eingegeben!");

		}
		else if(buchstabe.equals("g") && g == true){
			System.out.println("G wurde bereits eingegeben!");

		}
		else if(buchstabe.equals("m") && m == true){
			System.out.println("M wurde bereits eingegeben!");
		}
		else if(buchstabe.equals("") || buchstabe.equals(" ")|| buchstabe.equals("  ")|| buchstabe.equals("   ")){
			System.out.println("Sie haben keinen Buchstaben eingegeben:");
		}
		
		else{
			state += 1;
	        switch (state) {
	            case 1:
	            	//Boden
	        		add(line1);
	        		System.out.println("Falsch geraten!");
	                     break;
	            case 2:
	            	//Boden
	            	add(line1);
	            	//Hügel(Kreis)
	        		add(oval1);
	        		//Hügel(Rechteck)
	        		add(rect1);
	        		System.out.println("Falsch geraten!");
	                     break;
	            case 3:
	            	//Boden
	        		add(line1);
	            	//Hügel(Kreis)
	        		add(oval1);
	        		//Hügel(Rechteck)
	        		add(rect1);
	            	//pfahl
	        		add(line2);
	        		System.out.println("Falsch geraten!");
	                     break;
	            case 4:
	            	//Boden
	        		add(line1);
	            	//Hügel(Kreis)
	        		add(oval1);
	        		//Hügel(Rechteck)
	        		add(rect1);
	            	//pfahl
	        		add(line2);
	            	//balken
	        		add(line3);
	        		System.out.println("Falsch geraten!");
	                     break;
	            case 5:
	            	//Boden
	        		add(line1);
	            	//Hügel(Kreis)
	        		add(oval1);
	        		//Hügel(Rechteck)
	        		add(rect1);
	            	//pfahl
	        		add(line2);
	            	//balken
	        		add(line3);
	            	//diagonale
	        		add(line4);
	        		System.out.println("Falsch geraten!");
	                break;
	            case 6: 
	            	//Boden
	        		add(line1);	
	        	 	//Hügel(Kreis)
	        		add(oval1);
	        		//Hügel(Rechteck)
	        		add(rect1);
	        		//pfahl
	        		add(line2);
	        		//balken
	        		add(line3);
	        		//diagonale
	        		add(line4);
	        		//Kreis im stützbalken 
	        		add(oval2);
	        		System.out.println("Falsch geraten!");
	                    break;
	            case 7:  
	            	//Boden
	        		add(line1);
	        	 	//Hügel(Kreis)
	        		add(oval1);
	        		//Hügel(Rechteck)
	        		add(rect1);
	        		//pfahl
	        		add(line2);
	        		//balken
	        		add(line3);
	        		//diagonale
	        		add(line4);
	        		//kreis im stützbalken 
	        		add(oval2);
	        		//strick
	        		add(line5);
	        		System.out.println("Falsch geraten!");
	                break;            
	            case 8:
	            	//Boden
	        		add(line1);
	        	 	////Hügel(Kreis)
	        		add(oval1);
	        		//Hügel(Rechteck)
	        		add(rect1);
	        		//pfahl
	        		add(line2);
	        		//balken
	        		add(line3);
	        		//diagonale
	        		add(line4);
	        		//kreis im stützbalken 
	        		add(oval2);
	        		//strick
	        		add(line5);
	            	//kopf
	        		add(oval3);
	        		System.out.println("Falsch geraten!");
	                break;
	            case 9:
	            	//Boden
	        		add(line1);
	        	 	//Hügel
	        		add(oval1);
	        		//Hügel(Kreis)        		
	        		add(rect1);
	        		//pfahl
	        		add(line2);
	        		//balken
	        		add(line3);
	        		//diagonale
	        		add(line4);
	        		//kreis im stützbalken 
	        		add(oval2);
	        		//strick
	        		add(line5);
	            	//kopf
	        		add(oval3);
	            	//hals
	        		add(line6);
	        		System.out.println("Falsch geraten!");
	                break;
	            case 10:  
	            	//Boden
	        		add(line1);
	        	 	//Hügel(Kreis)
	        		add(oval1);
	        		//Hügel(Rechteck)
	        		add(rect1);
	        		//pfahl;
	        		add(line2);
	        		//balken
	        		add(line3);
	        		//diagonale
	        		add(line4);
	        		//kreis im stützbalken 
	        		add(oval2);
	        		//strick
	        		add(line5);
	            	//kopf
	        		add(oval3);
	            	//hals
	        		add(line6);
	            	//armL
	        		add(line7);
	        		System.out.println("Falsch geraten!");
	                    break;
	            case 11:
	            	//Boden
	        		add(line1);
	        	 	//Hügel(Kreis)
	        		add(oval1);
	        		//Hügel(Rechteck)
	        		add(rect1);
	        		//pfahl
	        		add(line2);
	        		//balken
	        		add(line3);
	        		//diagonale
	        		add(line4);
	        		//kreis im stützbalken 
	        		add(oval2);
	        		//strick
	        		add(line5);
	            	//kopf
	        		add(oval3);
	            	//hals
	        		add(line6);
	            	//armL
	        		add(line7);
	            	//armR
	        		add(line8);
	        		System.out.println("Falsch geraten!");
	        			break;
	            case 12: 
	            	//Boden
	        		add(line1);
	        	 	//Hügel
	        		add(oval1);
	        		//Hügel(Rechteck)
	        		add(rect1);
	        		//pfahl
	        		add(line2);
	        		//balken
	        		add(line3);
	        		//diagonale
	        		add(line4);
	        		//kreis im stützbalken 
	        		add(oval2);
	        		//strick
	        		add(line5);
	            	//kopf
	        		add(oval3);
	            	//hals
	        		add(line6);
	            	//armL
	        		add(line7);
	            	//armR
	        		add(line8);
	            	//beinL
	        		add(line9);
	        		System.out.println("Falsch geraten!");
	                	break;
	            case 13:
	            	//Boden
	        		add(line1);
	        	 	//Hügel(Kreis)
	        		add(oval1);
	        		//Hügel(Rechteck)
	        		add(rect1);
	        		//pfahl
	        		add(line2);
	        		//balken
	        		add(line3);
	        		//diagonale
	        		add(line4);
	        		//kreis im stützbalken 
	        		add(oval2);
	        		//strick
	        		add(line5);
	            	//kopf
	        		add(oval3);
	            	//hals
	        		add(line6);
	            	//armL
	        		add(line7);
	            	//armR
	        		add(line8);
	        		//beinL
	        		add(line9);
	        		//beinR
	        		add(line10);
	        		System.out.println("Falsch geraten!");
	        		gameover = true;
	        			break;
	        	}
		
	       } 	
		}while(hangm == false && gameover == false); 
		
		if( hangm == true ){
			System.out.println("Du hast gewonnen!");
			//Gewonnenschrift
			add(labelg);	
			//Kopf
			add(oval3);
			//L_Auge
			add(oval4a);
			//R_Auge
			add(oval4b);
			//Mund
			add(oval4c);
			//
			add(rect2);
        	//hals
    		add(line6);
        	//armL
    		add(line7);
        	//armR
    		add(line8);
    		//beinL
    		add(line9);
    		//beinR
    		add(line10);
		}
		else if( gameover == true){
			System.out.println("Game over!");
			//Verlorenschrift
			add(labell);	
			//L_Auge
			add(oval5a);
			//R_Auge
			add(oval5b);
			//Mund
			add(oval5c);
		}
		sc.close();
	}
}		
