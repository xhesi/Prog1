package bwi.prog1D.WS1617.wi16b002_Galanxhi.LabWork01;
import bwi.prog.utils.TextIO;
import bwi.prog1D.WS1617.wi16b002_Galanxhi.ExerciseSheet05.*;
public class SimpleLendItemDataBase {
	public static void main(String[] args){
		//interactiveMenu();
		LendItem it1 = new LendItem(), it2 = new LendItem();
		TextIO.putf("Welcome to LendApp\n");
		int mode = 0, format = 1;
		int input = 0;
		do {
		 TextIO.putf("enter opcode (9 for usage): ");
		 input = TextIO.getlnInt();
		 switch (input) {
		  case 1:
		   it1 = LendItemFunctions.scanLendItem();
		   break;
		  case 2:
		   it2 = LendItemFunctions.scanLendItem();
		   break;
		  case 3:
		   TextIO.putf("%s\n", LendItemFunctions.lendItemString(it1, format));
		   TextIO.putf("%s\n", LendItemFunctions.lendItemString(it2, format));
		   break;
		  case 4:
		   TextIO.putf("set compare mode (" + "1=by lend date, " + "2=by return date, " + "3=by lender, " + "4=by owner, " + "all other=by description: ");
		   mode = TextIO.getInt();
		   break;
		  case 5:
		   int cmp = LendItemFunctions.compare(it1, it2, mode);
		   if (cmp < 0)
		    TextIO.putf("LendItem1 is before LendItem2.\n");
		   else if (cmp > 0)
		    TextIO.putf("LendItem1 is after LendItem2.\n");
		   else
		    TextIO.putf("LendItems are equal.\n");
		   break;
		  case 6:
		   TextIO.putf("LendItem1 and LendItem2 are %s equal.\n",
		    LendItemFunctions.equals(it1, it2) ? "" : "not");
		   break;
		  case 9:
		   TextIO.putf("1 enter LendItem1\n" + "2 enter LendItem2\n" + "3 print LendItem1 and 2\n" + "4 set compare mode\n" + "5 compare the LendItems\n" + "6 check equality\n" + "9 display this message\n" + "0 exit\n");
		   break;
		  case 0:
		   break;
		  default:
		   TextIO.putln("invalid op code");
		 }
		} while (input != 0);
		TextIO.putf("Thank you for using LendApp.\n");
	}
	
	/*
	public static void populateDB()
	{
		int nextID=1;
		for (int i = 0; i < 25; i++) {
			LendItem li = new LendItem();
			li.id = nextID++;
			li.description = String.format("%c_description", ((int) (i
			* Math.PI * 10000)) % 15 + 'A');
			li.lender = String.format("Gustav_%02d", ((int) (i
			* Math.PI * 1000000)) % 10);
			li.lendDate = new Date();
			li.lendDate.year = 2010 - ((int) (i * Math.PI * 100)) % 100;
			li.lendDate.month = ((int) (i * Math.PI * 1000000)) % 12 + 1;
			li.lendDate.day = ((int) (i * Math.PI * 100000000)) % 28 + 1;
			LendItemArrayList list = null;
			LendItemArrayListFunctions.add(list, li);
			}
	}
	public static void interactiveMenu(){
		String menuOptions = 	"1) list\n" + 
								"2) add\n" +
								"3) remove\n" +
								"4) sort\n" +
								"5) filter\n" +
								"6) set format\n" +
								"0) quit\n";
		int inputOption;
		String inputErrorOutput="Please enter a number listed in the menu options [0-6]!";
		menuloop: while (true)
		{
			 TextIO.put(menuOptions);
			 try {
				 inputOption=TextIO.getlnInt();
			 }
			 catch (Exception e)
			 {
				 TextIO.putln(inputErrorOutput);
				 continue;
			 }
			 switch (inputOption)
			 {
			 case 1:
				 break;
			 case 2:
				 break;
			 case 3:
				 break;
			 case 4:
				 break;
			 case 5:
				 break;
			 case 6:
				 break;
			 case 0:
				 break menuloop;
			 default:
				 TextIO.putln(inputErrorOutput);
				 continue;
			 }
			 TextIO.putln(inputOption);
			 
		}
	}
	
	*/
}
