//metodo recursivo 
public class MergeTwoSortedLists {

    static class Node{
        int data;
        Node next;
    }
    
    static Node newNode(int key){
        Node temp=new Node();
        temp.data=key;
        temp.next=null;
        return temp;
    }

    static void printList (Node node){
        while (node!= null){
            System.out.println("%d" + node.data);
            node=node.next;
        }
    }

    static Node merge(Node h1,Node h2){
        if (h1==null)
            return h2;
        if (h2==null)
            return h1;
        
        if (h1.data<h2.data){
            h1.next = merge(h1.next, h2);
            return h1;}
        else{
            h2.next = merge (h1, h2.next);
            return h2;}
    }
}
