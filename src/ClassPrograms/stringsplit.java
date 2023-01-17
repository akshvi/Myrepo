package ClassPrograms;

public class stringsplit {

	public static void main(String[] args) {
		String textmessage = "testing session for selenium by trainer online for manual and Automation";
		//String mobile = $56.90
		//String headset = $10.89;

		//String[] Splitedvalue = textmessage.split("for");
	/*	System.out.println(Splitedvalue[0]);
		System.out.println(Splitedvalue[1]);
	*/
		
	/*System.out.println(Splitedvalue[0].trim());
	System.out.println(Splitedvalue[1].trim());
	System.out.println(Splitedvalue[2].trim());///same as above
	*/
		
		String[] Splitedvalue = textmessage.split(" ");
		/*System.out.println(Splitedvalue.length);
		System.out.println(Splitedvalue[0]);
		System.out.println(Splitedvalue[1]);
		System.out.println(Splitedvalue[2]);
		System.out.println(Splitedvalue[3]);
		System.out.println(Splitedvalue[4]);
		System.out.println(Splitedvalue[5]);
		System.out.println(Splitedvalue[6]);
			*/


		//For Loop
		/*for(int i=0;i<Splitedvalue.length;i++)
		{
		System.out.println(Splitedvalue[i]);
		}
*/

		//Enhanced Forloop

		for(String x:Splitedvalue)
		{
		  System.out.println(x);
		}


	}

}
