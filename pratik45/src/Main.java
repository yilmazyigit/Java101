import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int A[] = {10,20,20,10,10,20,5,20};
        int count=0;

        Arrays.sort(A);

        for(int i=0; i<A.length; i++) {
            count=0;
            for (int j=0; j<A.length; j++) {
                if(A[i]==A[j]) {
                    count++;
                }
            }

            if(i==0 && A[i+1]==A[i]) {
                System.out.println(String.format("%d 'den %d tane var.", A[i], count));
            }

            if(i==0 && A[i+1]!=A[i]) {
                System.out.println(String.format("%d 'den %d tane var.", A[i], count));
            }

            if(i!=0 && A[i-1]!=A[i]) {
                System.out.println(String.format("%d 'den %d tane var.", A[i], count));
            }
        }
    }
}