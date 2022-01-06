package com.AutomationOMSA;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import io.ous.jtoml.ParseException;

public class JSONOR {  
	
	
public static String LoginOR_Username() throws ParseException, IOException, org.json.simple.parser.ParseException{
JSONParser jp = new JSONParser();
FileReader reader = new FileReader(".\\jsonfiles\\Login.json");
Object obj = jp.parse(reader);
JSONObject  LogOR = (JSONObject)obj;
String Username = (String)LogOR.get("Username");
//String Password = (String)LogOR.get("Password");
//String Login = (String)LogOR.get("Login");
//System.out.println(Username + " " + Password + " " +Login);
return Username;
}
public static String LoginOR_Password() throws ParseException, IOException, org.json.simple.parser.ParseException{
JSONParser jp = new JSONParser();
FileReader reader = new FileReader(".\\jsonfiles\\Login.json");
Object obj = jp.parse(reader);
JSONObject  LogOR = (JSONObject)obj;
String Password = (String)LogOR.get("Password");
return Password;
} 
public static String LoginOR_Login() throws ParseException, IOException, org.json.simple.parser.ParseException{
JSONParser jp = new JSONParser();
FileReader reader = new FileReader(".\\jsonfiles\\Login.json");
Object obj = jp.parse(reader);
JSONObject  LogOR = (JSONObject)obj;
String Login = (String)LogOR.get("Login");
return Login;
}

public static String LoginOR_StandaloneQuote() throws ParseException, IOException, org.json.simple.parser.ParseException{
JSONParser jp = new JSONParser();
FileReader reader = new FileReader(".\\jsonfiles\\Login.json");
Object obj = jp.parse(reader);
JSONObject  LogOR = (JSONObject)obj;
String StandaloneQuote = (String)LogOR.get("StandaloneQuote");
return StandaloneQuote;
}

public static String LoginOR_CreateNewQuote() throws ParseException, IOException, org.json.simple.parser.ParseException{
JSONParser jp = new JSONParser();
FileReader reader = new FileReader(".\\jsonfiles\\Login.json");
Object obj = jp.parse(reader);
JSONObject  LogOR = (JSONObject)obj;
String CreateNewQuote = (String)LogOR.get("CreateNewQuote");
return CreateNewQuote;
}

public static String LoginOR_Investment() throws ParseException, IOException, org.json.simple.parser.ParseException{
JSONParser jp = new JSONParser();
FileReader reader = new FileReader(".\\jsonfiles\\Login.json");
Object obj = jp.parse(reader);
JSONObject  LogOR = (JSONObject)obj;
String Investment = (String)LogOR.get("Investment");
return Investment;
}

public static String LoginOR_Nextt() throws ParseException, IOException, org.json.simple.parser.ParseException{
JSONParser jp = new JSONParser();
FileReader reader = new FileReader(".\\jsonfiles\\Login.json");
Object obj = jp.parse(reader);
JSONObject  LogOR = (JSONObject)obj;
String Next = (String)LogOR.get("Next");
return Next;

}


public static String SearchCustomer_Individual() throws ParseException, IOException, org.json.simple.parser.ParseException{
JSONParser jp = new JSONParser();
FileReader reader = new FileReader(".\\jsonfiles\\SearchCustomer.json");
Object obj = jp.parse(reader);
JSONObject  LogOR = (JSONObject)obj;
String Individual = (String)LogOR.get("Individual");
return Individual;

}

public static String SearchCustomer_FName() throws ParseException, IOException, org.json.simple.parser.ParseException{
JSONParser jp = new JSONParser();
FileReader reader = new FileReader(".\\jsonfiles\\SearchCustomer.json");
Object obj = jp.parse(reader);
JSONObject  LogOR = (JSONObject)obj;
String FName = (String)LogOR.get("FName");
return FName;

}

public static String SearchCustomer_SName() throws ParseException, IOException, org.json.simple.parser.ParseException{
JSONParser jp = new JSONParser();
FileReader reader = new FileReader(".\\jsonfiles\\SearchCustomer.json");
Object obj = jp.parse(reader);
JSONObject  LogOR = (JSONObject)obj;
String SName = (String)LogOR.get("SName");
return SName;

}

public static String SearchCustomer_IDNum() throws ParseException, IOException, org.json.simple.parser.ParseException{
JSONParser jp = new JSONParser();
FileReader reader = new FileReader(".\\jsonfiles\\SearchCustomer.json");
Object obj = jp.parse(reader);
JSONObject  LogOR = (JSONObject)obj;
String IDNum = (String)LogOR.get("IDNum");
return IDNum;

}

public static String SearchCustomer_Search() throws ParseException, IOException, org.json.simple.parser.ParseException{
JSONParser jp = new JSONParser();
FileReader reader = new FileReader(".\\jsonfiles\\SearchCustomer.json");
Object obj = jp.parse(reader);
JSONObject  LogOR = (JSONObject)obj;
String Search = (String)LogOR.get("Search");
return Search;

}
public static String SearchCustomer_DOB() throws ParseException, IOException, org.json.simple.parser.ParseException{
JSONParser jp = new JSONParser();
FileReader reader = new FileReader(".\\jsonfiles\\SearchCustomer.json");
Object obj = jp.parse(reader);
JSONObject  LogOR = (JSONObject)obj;
String DOB = (String)LogOR.get("DOB");
return DOB;

}

public static String SearchCustomer_CreateCustomer() throws ParseException, IOException, org.json.simple.parser.ParseException{
JSONParser jp = new JSONParser();
FileReader reader = new FileReader(".\\jsonfiles\\SearchCustomer.json");
Object obj = jp.parse(reader);
JSONObject  LogOR = (JSONObject)obj;
String CreateCustomer = (String)LogOR.get("CreateCustomer");
return CreateCustomer;
}   

public static String SearchCustomer_SelectMale() throws ParseException, IOException, org.json.simple.parser.ParseException{
JSONParser jp = new JSONParser();
FileReader reader = new FileReader(".\\jsonfiles\\SearchCustomer.json");
Object obj = jp.parse(reader);
JSONObject  LogOR = (JSONObject)obj;
String SelectMale = (String)LogOR.get("SelectMale");
return SelectMale;

}

public static String SearchCustomer_Salutation() throws ParseException, IOException, org.json.simple.parser.ParseException{
JSONParser jp = new JSONParser();
FileReader reader = new FileReader(".\\jsonfiles\\SearchCustomer.json");
Object obj = jp.parse(reader);
JSONObject  LogOR = (JSONObject)obj;
String Salutation = (String)LogOR.get("Salutation");
return Salutation;

}

public static String SearchCustomer_Continue() throws ParseException, IOException, org.json.simple.parser.ParseException{
JSONParser jp = new JSONParser();
FileReader reader = new FileReader(".\\jsonfiles\\SearchCustomer.json");
Object obj = jp.parse(reader);
JSONObject  LogOR = (JSONObject)obj;
String Continue = (String)LogOR.get("Continue");
return Continue;

}

}
