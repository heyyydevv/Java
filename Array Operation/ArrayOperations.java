import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = null;
        int size = 0;

        while (true) {
            System.out.println("\nChoose an operation to perform:");
            System.out.println("1. Create/Input Array");
            System.out.println("2. Traverse Array");
            System.out.println("3. Insert Element");
            System.out.println("4. Delete Element");
            System.out.println("5. Update Element");
            System.out.println("6. Search Element");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the size of the array: ");
                    size = scanner.nextInt();
                    array = new int[size];
                    System.out.println("Enter the elements of the array:");
                    for (int i = 0; i < size; i++) {
                        array[i] = scanner.nextInt();
                    }
                    System.out.println("Array created successfully!");
                    break;

                case 2:
                    if (array == null) {
                        System.out.println("Array is not created yet. Please create an array first.");
                    } else {
                        System.out.println("Array elements are:");
                        for (int i = 0; i < size; i++) {
                            System.out.print(array[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (array == null) {
                        System.out.println("Array is not created yet. Please create an array first.");
                    } else {
                        System.out.print("Enter the index where you want to insert the element: ");
                        int insertIndex = scanner.nextInt();
                        System.out.print("Enter the element to insert: ");
                        int insertElement = scanner.nextInt();

                        if (insertIndex < 0 || insertIndex > size) {
                            System.out.println("Invalid index!");
                        } else {
                            int[] newArray = new int[size + 1];
                            for (int i = 0; i < insertIndex; i++) {
                                newArray[i] = array[i];
                            }
                            newArray[insertIndex] = insertElement;
                            for (int i = insertIndex; i < size; i++) {
                                newArray[i + 1] = array[i];
                            }
                            array = newArray;
                            size++;
                            System.out.println("Element inserted successfully!");
                        }
                    }
                    break;

                case 4:
                    if (array == null) {
                        System.out.println("Array is not created yet. Please create an array first.");
                    } else {
                        System.out.print("Enter the index of the element to delete: ");
                        int deleteIndex = scanner.nextInt();

                        if (deleteIndex < 0 || deleteIndex >= size) {
                            System.out.println("Invalid index!");
                        } else {
                            int[] newArray = new int[size - 1];
                            for (int i = 0; i < deleteIndex; i++) {
                                newArray[i] = array[i];
                            }
                            for (int i = deleteIndex + 1; i < size; i++) {
                                newArray[i - 1] = array[i];
                            }
                            array = newArray;
                            size--;
                            System.out.println("Element deleted successfully!");
                        }
                    }
                    break;

                case 5:
                    if (array == null) {
                        System.out.println("Array is not created yet. Please create an array first.");
                    } else {
                        System.out.print("Enter the index of the element to update: ");
                        int updateIndex = scanner.nextInt();
                        System.out.print("Enter the new value: ");
                        int newValue = scanner.nextInt();

                        if (updateIndex < 0 || updateIndex >= size) {
                            System.out.println("Invalid index!");
                        } else {
                            array[updateIndex] = newValue;
                            System.out.println("Element updated successfully!");
                        }
                    }
                    break;

                case 6:
                    if (array == null) {
                        System.out.println("Array is not created yet. Please create an array first.");
                    } else {
                        System.out.print("Enter the element to search: ");
                        int searchElement = scanner.nextInt();
                        boolean found = false;
                        for (int i = 0; i < size; i++) {
                            if (array[i] == searchElement) {
                                System.out.println("Element found at index: " + i);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Element not found in the array.");
                        }
                    }
                    break;

                case 7:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            if (array != null) {
                System.out.println("Updated Array:");
                for (int i = 0; i < size; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();
            }
        }
    }
}