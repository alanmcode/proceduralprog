
  @date      4 October 2020
  @version   4

    A help bot program that lets the user ask questions regarding
    university and the bot will respond with a relevant answer.
   ****************************************/
   
import java.util.Scanner; 
class unihelpbot
{
    
    public static void main (String [] a) // Executes the program ; main
    {
        String [] qu = {};
		String question = askQuestion();
		botResponse("finance",qu);
		sort();
        
		QA q1 = QAset(); //accessor methods
		QA q1a = QAget();
		
        System.exit(0);

    } // END main

	// create a record - abstract data type QA = QuestionAnswer
	public static QA nQA(String question, String answer) //record
	{
		QA b = new QA();
		
		b.q = question;
		b.a = answer;
		
		return b;
	}
	
	public static QA QAset ()
	{
		QA q1 = nQA("grades","what grade you need depends on which course you apply to.");
		return q1;
	}
	
	public static QA QAget()
	{
		QA q1 = nQA("grades","what grade you need depends on which course you apply to.");
		return q1;
	}
	
	
    // User asks the bot a question
    public static String askQuestion ()
    {
        String question;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How can I help?");
        question = scanner.nextLine();
   
        return question;
    } // END askQuestion
    
	
	// Help bot responds to user
    public static void botResponse (String question, String [] qu)
    {
		
		String[] triggers = {"grades", "ucas", "statement", "finance", "degree"};
		String[] answers = {"what grade you need depends on which course you apply to.", "ucas is the system which your uni application goes through", "you need to write a ps for your uni application", "you can apply for loans to cover your tuition and some maintenance costs", "try to take into account what current a levels you do and what job you want to choose which degree"};
		
		
		for (int i=1; i <= 1; i++)
		{
		
			while (question != "exit")
			{	
				if (question == triggers[0]) 
				{
					System.out.println(answers[0]);
					break;
				}
				else if (question == triggers[1]) 
				{
					System.out.println(answers[1]);
					break;
				}
				else if (question == triggers[2]) 
				{
					System.out.println(answers[2]);
					break;
				}
				else if (question == triggers[3]) 
				{
					System.out.println(answers[3]);
					break;
				}
				else if (question == triggers[4]) 
				{
					System.out.println(answers[4]);
					break;
				}
				
				else // if trigger word is not found
				{
					System.out.println("Sorry, I don't know.");
					break;	
				}
			}
		}
    } // END botResponse
	
	public static void sort ()
	{
		String[] triggers = {"grades", "ucas", "statement", "finance", "degree"};
		String[] answers = {"what grade you need depends on which course you apply to.", "ucas is the system which your uni application goes through", "you need to write a ps for your uni application", "you can apply for loans to cover your tuition and some maintenance costs", "try to take into account what current a levels you do and what job you want to choose which degree"};
		int[] usefulness = new int[5];
		int[] u = new int[5];
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i <= 4; i++) //calculates useful
		{
			System.out.println("usefulness at " + i + "?");
			String countTemp = scanner.nextLine();
			count = Integer.parseInt(countTemp);
			usefulness[i] = count;
		}
		
		//sorts useful
		if (usefulness[0] > usefulness[1])
		{
			System.out.println("The most useful topic is " + triggers[0] + " at " + usefulness[0]);
			u[0] = usefulness[0];
		}
		
		else if (usefulness[1] > usefulness[0])
		{
			System.out.println("The most useful topic is " + triggers[1] + " at " + usefulness[1]);
			u[0] = usefulness[1];
		}
		
		else if (usefulness[2] > usefulness[3])
		{
			System.out.println("The most useful topic is " + triggers[2] + " at " + usefulness[2]);
			u[1] = usefulness[2];
		}
		
		else if (usefulness[3] > usefulness[2])
		{
			System.out.println("The most useful topic is " + triggers[3] + " at " + usefulness[3]);
			u[2] = usefulness[3];
		}
		
		else if (usefulness[4] > usefulness[5])
		{
			System.out.println("The most useful topic is " + triggers[4] + " at " + usefulness[4]);
			u[3] = usefulness[3];
		}
		
		else if (usefulness[4] < usefulness[5])
		{
			System.out.println("The most useful topic is " + triggers[5] + " at " + usefulness[5]);
			u[3] = usefulness[4];
		}
		
		else
		{
			System.out.println("The most useful topic is " + triggers[3] + " at " + usefulness[3]);
			u[4] = usefulness[5];
		}
		
		System.out.println(triggers[0] + "," + triggers[1] + "," + triggers[2] + "," + triggers[3] + "," + triggers[4]);
		System.out.println(usefulness[0] + "," + usefulness[1] + "," + usefulness[2] + "," + usefulness[3] + "," + usefulness[4]);
	}
	
}

//record class

class QA
{
	String q; //question
	String a; //answer
}

