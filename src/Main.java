public class Main {

    public static void main(String[] args) {
        LinkedStringListImpl list = new LinkedStringListImpl();

        System.out.println(list.size());

        list.add("First");
        System.out.println(list);
        System.out.println(list.size());

        list.add ("Second");
        System.out.println(list);
        System.out.println(list.size());

        list.add ("Third");
        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.get (0));
        System.out.println(list.get (1));
        System.out.println(list.get (2));
        System.out.println(list.get (10));

    }
}
