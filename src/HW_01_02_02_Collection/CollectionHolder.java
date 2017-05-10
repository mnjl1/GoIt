package HW_01_02_02_Collection;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Dmytro on 09.05.2017.
 */
public class CollectionHolder {
    public ArrayList<Integer> massive;
    int intNumber;
    int index;

    public CollectionHolder() {
        massive = new ArrayList<>();
    }
     Scanner scanner = new Scanner(System.in);



    public void addInteger() {
        boolean isInteger = false;
        while (!isInteger) {
            try { intNumber = Integer.parseInt(scanner.next());
                isInteger = true;
            }catch (Exception e) {
                System.out.println("Not integer, try again.");
            }
        }
    }



    public void addElement() {
            System.out.println("Enter next collection element.");
            addInteger();
            massive.add(intNumber);

    }

    public void setElement(int index, int intNumber) {
        System.out.println("Enter index and new element to replace.");
        addInteger();
        index = intNumber;

        System.out.println("Enter new number for replacing.");
        addInteger();
        massive.set(index, intNumber);
    }

    public void removeElement(int index) {
        System.out.println("Enter index to remove element.");
        addInteger();
        index = intNumber;
        massive.remove(index);



    }

    public void getElement(int index) {
        System.out.println("Enter index to get element.");


        System.out.println(massive.get(index));

    }

}