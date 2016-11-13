package hackerrank_cracking_04_linkedlist;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    class Node {
        int data;
        Node next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	boolean hasCycle(Node head) {
	    if(head == null){
	        return false;
	    }
	    HashMap<Node,Boolean> visited = new HashMap<Node,Boolean>();
	    Node current = head;
	    visited.put(current, true);
	    
	    boolean cycle = false;
		while(current != null){
	    	if(visited.containsKey(current.next)){
	    		cycle = true;
	    		break;
	    	}
	    	visited.put(current, true);
	    	current = current.next;
	    }
	    return cycle;
	}
}
