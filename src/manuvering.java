public class manuvering {
    public static int paths(int m, int n){
        if(m==1 || n==1)
            return 1;
        return paths(m-1,n)+paths(n-1,m)+paths(m-1,n-1);
    }
    public static void main(String[] args){
        System.out.println(paths(2,2));
    }
}
