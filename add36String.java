/**
 * @author zzyuan
 * @create 2022-04-21 10:42
 */
public class add36 {
    public static void main(String[] args) {
        String num1 = "1b";
        String num2 = "2x";
        String res = add36String(num1, num2);
        System.out.println(res);
    }

    private static String add36String(String num1 , String num2){
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder res = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0){
            int x = i >= 0 ? getInt(num1.charAt(i)) : 0;
            int y = j >= 0 ? getInt(num2.charAt(j)) : 0;
            int sum = x + y + carry;
            res.append(getChar(sum % 36));
            carry = sum / 36;
            i--;
            j--;
        }
        return res.reverse().toString();
    }


    private static char getChar(int n){
        if(n <= '9'){
            return (char)(n + '0');
        }else{
            return (char)(n - 10 + 'a');
        }
    }

    private static int getInt(char ch){
        if(ch >= '0' && ch <= '9'){
            return ch - '0';
        }else {
            return ch - 'a' + 10;
        }
    }

}
