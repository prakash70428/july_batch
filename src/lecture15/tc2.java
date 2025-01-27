package lecture15;

public class tc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13242;
        int i = 0;
        while(i < n) {
        	System.out.println("* ");
        	//O(n)
        	i++;
        }
        
        while(i <= n) {
        	System.out.println("* ");
        	//log n base 2
        	i *= 2;
        }
        
        while(n > 0) {
        	System.out.println("Hey");
        	n = n / 2;
        }
        
        while(i <= n) {
        	System.out.println("Hey");
        	//0(n)
        	i += 2;
        	i += 3;
        }
        
        while(i <= n) {
        	System.out.println("Hey");
        	//log(n) base 6
        	i *= 2;
        	i *= 3;
        }
        
        while(n > 0) {
        	System.out.println("Hey");
        	//log(n) base 6
        	n /= 2;
        	n /= 3;
        }
        
//        while(i <= n) {
//        	System.out.println("Hey");
//        	//0(n/k)
//        	i += k;
//        }
//        
//        while(i <= n) {
//        	System.out.println("Hey");
//        	//log(n) base k
//        	i *= k;
//        }
//        
//        while(n > 0) {
//        	System.out.println("Hey");
//        	//0(n)
//        	n = n - 2;
//        	n = n - 3;
//        }
//        
//        while(n > 0) {
//        	n = n - k;
//        	//0(n/k)
//        }
//        
//        for(int i=1;i <= n;i++) {
//        	for(int j=1;j <= n;j++) {
//        		//o(n^2)
//        		System.out.println("hey");
//        	}
//        }
//        
//        for(int i=1;i * i <= n;i++) {
//    		//sqrt(n)
//    		System.out.println("hey");
//    	}
//        
//        for(int i=1;i <= n;i++) {
//        	for(int j=1;j <= i;j++) {
//        	   for(int k=1;k <= n;k++) {
//        		   //0(n^3)
//        	   }
//        	}
//        }
//        
//        for(int i=1;i <= n;i++) {
//        	for(int j=1;j <= i * i;j++) {
//        	   for(int k=1;k <= n/2;k++) {
//        		   System.out.println("hey");
//        		   //0(n^4)
//        	   }
//        	}
//        }
//        
//        for(int i=1;i <= n;i++) {
//        	for(int j=1;j <= n;j += i) {
//        		//o(n^2)
//        		System.out.println("hey");
//        	}
//        }
//        
//        while(n > 1) {
//        	n /= 2;
//        }
        
	}

}
