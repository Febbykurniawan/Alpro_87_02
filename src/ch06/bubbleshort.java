package ch06;

public class bubbleshort {
    public static void main(String[] args) {
        int[]data ={82,12,41,39,19,26,9,48,20,55,8,32,3};
        for (int outer = data.length -1; outer > 0; outer--){
            for (int inter = 0; inter < outer; inter++){
                if (data[inter] > data[inter + 1]){
                    int temp = data[inter];
                    data[inter]=data[inter+1];
                    data [inter+1]=temp;
                }
            }
        }
        for (int i = 0; i < data.length; i++)
            System.out.print(data[i]+",");
    }
}