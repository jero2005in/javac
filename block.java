import java.util.Scanner;
class block{
    public static void main(string[]args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[]X = s.nextInt();
    for(i=0;i<n;i++){
        X[i] = s.nextInt();
    }
    int m = s.nextInt();
    int[]Y=s.nextInt();
    for(i=0;i<n;i++){
        Y[i] = s.nextInt();
    }

    int i = 0
    int y = 0
    while(i<n && j<m){
        if(X[i]<Y[j]){
            System.out.print(X[i]+" ");
            i++;   
        }
        else{
            System.out.print(Y[i]+" ");
            j++;
        }
    }
    while(i<n){
        System.out.print(X[i]+" ");
        i++;
    }
    while(j<m){
        system.out.print(Y[j]);
        j++;
    }


  }
}