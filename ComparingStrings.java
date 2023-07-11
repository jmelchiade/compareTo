public class ComparingStrings {
    public static void main(String[] arg) {
        String s1 = "Admanne";
        String s2 = "Henry";
        System.out.println("__________________________________ \n");
        System.out.println(s1 + "compare to" + s2 + "\t\t" + s1.compareTo(s2));
        System.out.println(s1 + "compare to" + s1 + "\t" + s1.compareTo(s1));
        System.out.println(s2 + "compare to" + s1 + "\t\t" + s1.compareTo(s1));

        System.out.println("__________________________________ \n");

        if (s1.compareTo(s2) < 0)
            System.out.println(s1 + " comes before " + s2);
        else if (s1.compareTo(s2) > 0)
            System.out.println(s1 + " comes after " + s2);
        else
            System.out.println(s1 + " = " + s2);
        System.out.println();
    }
}