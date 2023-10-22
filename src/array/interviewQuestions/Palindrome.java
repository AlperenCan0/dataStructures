package array.interviewQuestions;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(solve("radar"));
    }
    public static boolean solve(String s) {
        int forward = 0;
        int backward = s.length() - 1;

        while (forward < backward) {
            if(s.charAt(forward) != s.charAt(backward)) {
                return false;
            }
            forward++;
            backward--;
        }

        return true;
    }
}
