//To calcutate sum and average
class Average{

public static void main(String[]args){
float[] arr = {19.1f, 12.8f, 6.5f, 20.0f, 3.7f};
double total = 0;
for(int i=0; i<arr.length; i++){
total = total + arr[i];
}
double average = total / arr.length;
System.out.println("The sum is: "+total);
System.out.println("The average is: " +average);
}
}