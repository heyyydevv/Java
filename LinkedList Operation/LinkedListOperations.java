import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an operation to perform:");
            System.out.println("1. Add element at the end");
            System.out.println("2. Add element at the beginning");
            System.out.println("3. Add element at a specific index");
            System.out.println("4. Remove element from the end");
            System.out.println("5. Remove element from the beginning");
            System.out.println("6. Remove element at a specific index");
            System.out.println("7. Check if an element exists");
            System.out.println("8. Get the size of the LinkedList");
            System.out.println("9. Display the LinkedList");
            System.out.println("10. Clear the LinkedList");
            System.out.println("11. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add at the end: ");
                    int elementEnd = scanner.nextInt();
                    linkedList.addLast(elementEnd);
                    break;

                case 2:
                    System.out.print("Enter the element to add at the beginning: ");
                    int elementStart = scanner.nextInt();
                    linkedList.addFirst(elementStart);
                    break;

                case 3:
                    System.out.print("Enter the index to add the element: ");
                    int index = scanner.nextInt();
                    System.out.print("Enter the element to add: ");
                    int element = scanner.nextInt();
                    if (index >= 0 && index <= linkedList.size()) {
                        linkedList.add(index, element);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 4:
                    if (!linkedList.isEmpty()) {
                        linkedList.removeLast();
                        System.out.println("Last element removed.");
                    } else {
                        System.out.println("LinkedList is empty!");
                    }
                    break;

                case 5:
                    if (!linkedList.isEmpty()) {
                        linkedList.removeFirst();
                        System.out.println("First element removed.");
                    } else {
                        System.out.println("LinkedList is empty!");
                    }
                    break;

                case 6:
                    System.out.print("Enter the index to remove the element: ");
                    int removeIndex = scanner.nextInt();
                    if (removeIndex >= 0 && removeIndex < linkedList.size()) {
                        linkedList.remove(removeIndex);
                        System.out.println("Element removed.");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 7:
                    System.out.print("Enter the element to check: ");
                    int checkElement = scanner.nextInt();
                    if (linkedList.contains(checkElement)) {
                        System.out.println("Element exists in the LinkedList.");
                    } else {
                        System.out.println("Element does not exist in the LinkedList.");
                    }
                    break;

                case 8:
                    System.out.println("Size of the LinkedList: " + linkedList.size());
                    break;

                case 9:
                    System.out.println("LinkedList: " + linkedList);
                    break;

                case 10:
                    linkedList.clear();
                    System.out.println("LinkedList cleared.");
                    break;

                case 11:
                    running = false;
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            // Display the updated LinkedList after each operation
            System.out.println("Updated LinkedList: " + linkedList);
        }

        scanner.close();
    }
}