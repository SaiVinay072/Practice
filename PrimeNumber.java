package com.lang;

public class PrimeNumber {

	public static void main(String[] args) {
	int count=0;
	String output=" ";
	for(int i=2;i<=100;i++)
	{
	for(int j=1;j<=i;j++)
	{
	if(i%j==0)
	{
	count=count+1;
	}}
if(count==2)
{
	output=output+i+" ";

	}
	count=0;
	}
	System.out.println("the prime numbers of 1 to 100 are");
	System.out.println(output);
	}}
