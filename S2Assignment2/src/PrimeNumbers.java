public class PrimeNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0;
int num=0;
String print="";
for(i=0;i<=100;i++){
int count=0;
for(num=i;num>=1;num--){
	if(i%num==0){
		count=count+1;
		}
	}
		if(count==2){
			print=print+i+" ";
		}
		}
	System.out.println("The prime numbers between 1 to 100 are \n"+ print);
  	}
}
