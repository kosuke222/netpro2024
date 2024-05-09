public class XmasTree {

    public static void main(String[] args) {
        // ツリーの高さ
        int height = 19;

        for (int i = 0; i < height; i++) {
            for(int j = 0; j<height-1-i; j++){
             if(i%3==0){
                if(j%3==1||j%3==2){
                System.out.print(" ");
                }else{
                System.out.print("+");  
                }
            }else if(i%3==1){
                if(j%3==0||j%3==1){
                    System.out.print(" ");
                }else{
                    System.out.print("+");  
                }   
            }else{
                if(j%3==0||j%3==2){
                    System.out.print(" ");
                }else{
                    System.out.print("+");  
                } 
            }
            }         
            for (int k = 0; k < (2 * i ); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // ツリーの幹
        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < height - 3; j++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }
    }
}