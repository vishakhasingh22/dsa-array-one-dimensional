//insert in array

class sdarray {
    int arr[] = null; // arr naam ka array, each ele is null

    public sdarray(int sizeOfArray)// constructor banaya
    {
        arr = new int[sizeOfArray]; // instantiation kia
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE; // saare ele ko min val dia
        }
    }

    void insert(int location, int valueToPut) {
        // yaha exception handling, try insert karne mei help karega
        // catch tab ayega jab index is bigger than given index
        try {
            if (arr[location] == Integer.MIN_VALUE)// agar min val hai toh replace kardo
            {
                arr[location] = valueToPut;
                System.out.println("Inserted successfully");
            } else {
                System.out.println("Occupied");// agar same jageh vapis koshish ki
            }
        } catch (ArrayIndexOutOfBoundsException e)// name of exception and uska obj is e
        {
            System.out.println("Invalid array index");
        }
    }

    // array traversal
    void traversal() { // time com O(N), space O(1)
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            System.out.println("Array doesn't exist");
        }
    }

    // search an element in array
    void search(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Element found at " + i);
                return;
            }
        }
        System.out.println("Not found!");
    }

    // delete value from array

    void delete(int valueToDeleteIndex){
        //write everything inside try and catch in case val exist nhi kia
        try{
            arr[valueToDeleteIndex]= Integer.MIN_VALUE;
            System.out.println("Successfully deleted value!");
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Val doesnt exist");
        }
    }
}

public class arr {
    public static void main(String[] args) {
        sdarray sda = new sdarray(10); // yaha array ka size bataya hai uper nhi
        sda.insert(1, 20);
        sda.insert(2, 88);
        sda.insert(0, 81);
        // sda.insert(12, 78);

        // accessing array elements
        /*
         * var first_element = sda.arr[0];
         * System.out.println(first_element);
         * 
         * // array traversal
         * System.out.println("array traversal");
         * sda.traversal();
         */
        // the -2147483648 is the min val of int in java which occupies rem blocks arr
        sda.search(88);
        sda.search(5);
        sda.delete(0); 
        //now the 0th element is -2 raise to something something
    }
}
