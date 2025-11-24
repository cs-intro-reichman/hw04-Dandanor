public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[n+1];
        arr[0]=false;
        arr[1]=false;
        for (int i=2;i<n;i++){ //assign true to every array spot
            arr[i]=true;
        } 
        for (int i=2; i<n;i++){
            for(int j=i+1;j<n;j++){
                if (j%i==0){
                    arr[j]=false;
                }
            }
        }
        int count=0;
        System.out.println("Prime numbers up to 30:");
        for (int i=2;i<=n;i++){
            if(arr[i]==true){
                System.out.println(i);
                count++;
            }
        }
            double precent = Math.floor(((double)count/n)*100);
            System.out.print("There are "+count+" primes between 2 and " +n);
            System.out.print(" ("+(int)precent+"% are primes)");
    }
}