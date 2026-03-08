package Module4;

public class String_immutable_p3 {
    static void main(String[] args) {
            String s1 = "car";
            // String s2 = s1+" is BMW";     //using + operator
            String s2 = s1.concat(" is BMW"); //using concate operator
            System.out.println(s1);
            System.out.println(s2);
        }

    }


