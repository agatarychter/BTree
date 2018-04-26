import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Node {
    public int SIZE;//2*row of the tree -1
    private int itemsNumber;//the amount of keys
    private ArrayList itemArray;
    private ArrayList<Node> childArray;
    private Node parent;
    private boolean leaf;


     public Node(int size){
        SIZE = size;
        itemsNumber = 0;
        itemArray = new ArrayList<>(size);
        childArray = new ArrayList<>(size+1);
        parent = null;
        leaf = true;
    }

    public int getItemsNumber(){
        return itemsNumber;
    }

    public ArrayList getItemArray(){
        return itemArray;
    }

    public ArrayList<Node> getChildArray() {
        return childArray;
    }

    public Node getParent(){
        return  parent;
    }

    public boolean isFull(){
        return itemsNumber==SIZE;
    }

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(");
        for(int i=0;i<itemsNumber;i++){
            stringBuffer.append(itemArray.get(i));
            stringBuffer.append(", ");
        }
        stringBuffer.append(printParent());
        return stringBuffer.toString();
    }

    public boolean isLeaf(){
        return leaf;
    }

    public void setLeaf(boolean isLeaf){
        leaf = isLeaf;
    }

    public boolean isOversized(){
        return itemsNumber>SIZE;
    }

    public String printParent(){
        if(parent!=null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("P: (");
            for (int i = 0; i < parent.getItemsNumber(); i++)
                stringBuffer.append(parent.getItemArray().get(i) + " ");
            stringBuffer.append("))");
            return stringBuffer.toString();
        }
        return  "P " + null + ")";
    }


    public void setItemsNumber(int i){
        itemsNumber = i;
    }

    public void setItemArray(ArrayList array){
        itemArray = (ArrayList)array;
    }

    public void setChildArray(ArrayList array){
        childArray =(ArrayList<Node>) array;
    }

    public void setParent(Node node){
        parent = node;
    }
}
