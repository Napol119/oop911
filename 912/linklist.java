public class LinkedList {
    public static void main(String[] args) {
        LinkList numlist = new LinkList();

        numlist.insertFirst(28);
        numlist.insertFirst(96);
        numlist.insertFirst(75);
        numlist.insertFirst(162);

        numlist.printlst(); // Print initial list
        numlist.removeMax(); // Remove max and print messages
        numlist.printlst(); // Print list after removal
    }
}
