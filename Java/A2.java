package Java;

class A2 {
    public static void main(String[] args) {

        String s = "abba";
        int i = 0, j = 0;
        boolean a = true;
        System.out.println(s.length());

        while (i <= s.length() ) {
                s%10=1;
            }

            if (a == true) {
                System.out.println("yes");
            } else {
                System.out.println("false");
            }
        }

        // **using double for loop**//

        // String s = "abba";
        // boolean a=true;
        // int max = 0;

        // for (int i = 1; i <= s.length() / 2; i++) {
        // for (int j = s.length() / 2; j == 1; j--) {
        // if (s.charAt(i) == s.charAt(j)) {
        // a=true;
        // } else {
        // a=false;
        // System.out.println("Not palidrom");
        // }
        // }
        // }

        // if (a==true) {
        // System.out.println("yes");
        // }
        // else{
        // System.out.println("false");
        // }

    }
}
