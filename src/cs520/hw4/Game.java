package cs520.hw4;

import java.util.ArrayList;

public class Game {

	//defining private variables
	private int month,day,year;
	private String teamName,opponentName;
	private ArrayList<Player> players=new ArrayList<Player>();
	//defining getters ans setters
	public void set_month(int month)
	{
	this.month=month;
	}
	public int get_month()
	{
	return this.month;
	}
	public void set_day(int day)
	{
	this.day=day;
	}
	public int get_day()
	{
	return this.day;
	}
	public void set_yaer(int year)
	{
	this.year=year;
	}
	public int get_year()
	{
	return this.year;
	}
	public void set_teamName(String teamName)
	{
	this.teamName=teamName;
	}
	public String get_teamName()
	{
	return this.teamName;
	}
	public void set_opponentName(String opponentName)
	{
	this.opponentName=opponentName;
	}
	public String get_opponentName()
	{
	return this.opponentName;
	}
	public void set_players(ArrayList players)
	{
	this.players=players;
	}
	public ArrayList get_players()
	{
	return this.players;
	}
	//creating function setDate
	public void setDate(int month,int day,int year)
	{
	this.month=month;
	this.day=day;
	this.year=year;
	}
	//creating function simulateGame
	public void simulateGame()
	{
	//printing the statement
	System.out.println("Game played on "+this.month+"/"+this.day+"/"+this.year+" vs. "+this.opponentName);
	//creating local variable teamPoints
	int teamPoints=0;
	//looping through the list of players
	for(int i=0;i<this.players.size();i++)
	{
	//creating local variable points
	int points=(int)Math.random()%11;
	if(points==0)
	points++;
	System.out.println(players.get(i)+" scored "+points+" points");
	//adding the points in teamPoints
	teamPoints=teamPoints+points;
	}
	//creating local variable opponentPoints
	int opponentPoints=(int)Math.random()%101;
	if(opponentPoints==0)
	opponentPoints++;
	//printing the statement
	System.out.print("Final score: "+this.teamName+" "+teamPoints+", "+this.opponentName+" "+opponentPoints);
	System.out.println();
	}
	}
