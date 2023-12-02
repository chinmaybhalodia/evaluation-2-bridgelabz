public class App {
    public static void main(String[] args) throws Exception {

        // creating Integer linked list
        LinkedList<Integer> list1 = new LinkedList<>();

        // adding nodes
        list1.add(12);
        list1.add(15);
        list1.add(16);
        list1.add(10);
        list1.add(11);
        list1.add(13);
        list1.add(6);
        list1.add(2);
        list1.add(3);

        // displaying list
        System.out.println(list1);

        list1.remove();
        System.out.println(list1);

        // Test Case 2
        LinkedList<Integer> list2 = new LinkedList<>();

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);

        System.out.println(list2);

        list2.remove();
        System.out.println(list2);

        // finding middle elements
        System.out.println("Middle element of list1: " + list1.getMiddleNode());
        System.out.println("Middle element of list2: " + list2.getMiddleNode());
    }
}