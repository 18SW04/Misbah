//To Display even and odd no using for and while loops
class EvenOdd{
public static void main(String[]args){
int i;
System.out.println("Even");
for(i=2;i<=50;i+=2){
System.out.print(" " +i);
} //end of for
System.out.println("odd");
int j=1;
while(j<=50){
j+=2;
System.out.print(" "+j);
} //end of while
}
}