public class Main {

        public static void main(String[] args) {
        System.out.println(isPalindrome(1882881)); //+
        System.out.println(isPalindrome(1552551)); //+
        System.out.println(isPalindrome(10000)); //-
        System.out.println(isPalindrome(8468556)); //-
        System.out.println(isPalindrome(121)); //+
        }
        public static boolean isPalindrome(int x) {
            String str = String.valueOf(x);
            int left = 0, right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

    }
