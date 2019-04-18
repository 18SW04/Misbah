//To calculate the factorial
class Factorial{
public static void main(String[]args){
int i, fact=1;
int num=Integer.parseInt(args[0]);
for(i=num;i>0;i--){
fact*=i;
}//end of for
System.out.println("The Factorial of the given number is "+fact);
}
}