import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String str[] = read.readLine().trim().split(" ");
            Node head = null, tail = null;
            for(int i = 0; i < n; i++)
            {
                int data = Integer.parseInt(str[i]);
                if (head == null) 
                {
                    head = new Node(data);
                    tail = head;
                }
                else
                {
                    tail.next = new Node(data);
                    tail.next.prev=tail;
                    tail = tail.next;
                }
            }
            head=reverseDLL(head);
            if(verify(head))
    	    displayList(head);
    	    else
    	    System.out.print("Your pointers are not correctly connected");
            System.out.println();
                
        }
    }
    
    
    
public static void displayList(Node head)
{
    //Head to Tail
    while(head.next != null)
    {
        System.out.print(head.data+" ");
        head = head.next;
    }
    System.out.print(head.data);
   
}


// } Driver Code Ends
/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

*/
public static Node reverseDLL(Node  head)
{
     Node current = head;
        Node temp = null;

        while (current != null) {
    
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }


        if (temp != null) {
            head = temp.prev;
        }

        return head;
    //Your code here
}

