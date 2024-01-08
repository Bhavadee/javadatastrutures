// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LL {
    Node head;
     static class Node
     {
         int data;
         Node next;
         Node(int d)
         {
             data = d;
             next = null;
         }
     }
     // *************************************insert*******************************************************************
     public static LL insert(LL li,int data)
     {
         Node new_node = new Node(data);
         
         if(li.head == null)
         {
            li.head = new_node;
         }
         else
         {
                new_node.next = li.head;
                li.head = new_node;
         }
         return li;
     }
     public static LL inserte(LL li,int data)
     {
         Node new_node = new Node(data);
         if(li.head == null)
         {
            li.head = new_node;
         }
         else
         {
             Node temp = li.head;
         while(temp.next != null)
         {
             
             temp = temp.next;
         }
         temp.next = new_node;
         }
         return li;
     }
     public static LL insertm(LL li,int data,int pos)
     {
         Node new_node = new Node(data);
         if(li.head == null)
         {
            li.head = new_node;
         }
         else
         {
             Node temp = li.head;
             int i=0;
         while(i < pos)
         {
             
             temp = temp.next;
             i++;
         }
         new_node.next = temp.next;
         temp.next = new_node;
         }
         return li;
     }
        //********************* delte******************************************
     
      public static LL dele(LL li)
     {
         li.head = li.head.next;
         return li;
     }
     public static LL delee(LL li)
     { 
         Node temp = li.head;
         while(temp.next.next != null)
         {
           temp = temp.next;
         }
         temp.next = null;
         return li;
    }
     public static LL delem(LL li,int pos)
     {
        
             Node temp = li.head;
             int i=0;
         while(i < pos)
         {
             temp = temp.next;
             i++;
         }
         temp.next = temp.next.next;
         
         
         return li;
     }
     
         public static void print(LL li)
         {
         Node temp = li.head;
         while(temp != null)
         {
             System.out.print(temp.data+" "); 
             temp = temp.next;
         }
             
         
     }
    public static void main(String[] args) {
       LL list = new LL();
       list = insert(list,22);
       list = insert(list,72);
       list = insert(list,82);
       print(list);
        System.out.println("");
       list = inserte(list,12);
         print(list);
          System.out.println("");
         list = insertm(list,13,1);
         print(list);
    }
}