import java.util.Random;

/**
 * Created by Agata Rychter on 29.05.2017.
 */
public class Test {
    public static void main(String [] args){
        B_Tree b_tree = new B_Tree(2,new ComparatorInt());
       b_tree.insert(1);
        b_tree.print();
        System.out.println("*******");
        b_tree.insert(5);
        b_tree.print();
        System.out.println("*******");
        b_tree.insert(6);
        b_tree.print();
        System.out.println("*******");
        b_tree.insert(2);
        b_tree.print();
        System.out.println("*******");
        b_tree.insert(7);
        b_tree.print();
        System.out.println("*******");
        b_tree.insert(8);
        b_tree.print();
        System.out.println("*******");
        b_tree.insert(3);
        b_tree.print();
        System.out.println("*******");
        b_tree.insert(4);
        b_tree.print();
        System.out.println("*******");
        b_tree.insert(9);
        b_tree.print();
        System.out.println("*******");
        b_tree.insert(10);
        b_tree.print();
        System.out.println("*******");
        b_tree.insert(11);
        b_tree.print();
        System.out.println("*******");
        b_tree.insert(12);
        b_tree.print();
        System.out.println("*******");
        b_tree.insert(13);
        b_tree.print();
        System.out.println("*******");
        b_tree.insert(14);
        b_tree.print();
        System.out.println("*******");

        System.out.println(b_tree.search(5));
        System.out.println(b_tree.search(15));



    }
}
