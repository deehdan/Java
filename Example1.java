public class Example1 {
      
        public static int square(int num){
            return num * num;
        }

        public static boolean isEven(int num){
            return num % 2 == 0;
        }

        public static int getMax(int a, int b){
            if(a > b){
                return a;
            } else{
                return b;
            }
        }

        public static void main(String[] args) {
            int result = square (6);
            System.out.println("Sqaure is: " + result);

            int num = 8;
            if(isEven(num)){
                System.out.println(num +" is EVEN");
            } else{
                System.out.println(num +" is ODD");
            }

            int x = 5;
            int y = 9;
            int max = getMax(x, y);
            System.out.println(max +" is Greator");
        }
    
}