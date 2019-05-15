import java.util.Scanner;
public class solanxuathien {
    public static void main(String[] args) {
        String str;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi ky tu :");
        str = input.nextLine();
        char value;
        System.out.println("Nhap vao ki tu can kiem tra:");
        value = input.nextLine().charAt(0);
        int count = 0;
        for(int i = 0; i < str.length();i ++) {
            if(value == str.charAt(i)) {
                count ++;
            }
        }
        System.out.println(value + " xuat hien " + count + " lan");
    }
}
