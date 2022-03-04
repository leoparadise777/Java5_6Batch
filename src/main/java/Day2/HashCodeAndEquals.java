package Day2;

import java.util.Objects;

public class HashCodeAndEquals {

    public static void main(String[] args) {
        Node node = new Node(1);
        Node node2 = new Node(1);

        System.out.println(node.equals(node2));
    }

}

class Node{
    int value;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true; //reference
        if (!(this instanceof Node)) return false; // datatype
        Node node = (Node) o;
        return node.value == node.value; // content
    }

    @Override
    public int hashCode(){
        return Objects.hash(value);
    }



    /*
    @Override
    public boolean equals(Object o){
        if (this == o) return true; // reference
        if (!(this instanceof Node)) return false; // data type
        Node node = (Node) o;
        return this.value == node.value;
    }

    @Override
    public int hashCode() {
        return this.value;
    }*/

    /*
    // auto generate by IDE
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return value == node.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
    */
}
