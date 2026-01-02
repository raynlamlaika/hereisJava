




class Node
{
    int data;
    int number;
    Node next;

    Node(int data) {
        this.data = data;
        this.number = number;
        this.next = null;
    }
}



class Main
{
    private Node head;
    public LinkedList()
    {
        head = null;
    }


    public Node addLinkedList()
    {
        
    }

    public void addLinkedList(int value)
    {
        // check the value if all ready exixt and add just the nuber otherwise new list
        int i = search(value);
        if (i == 1)
        {
            return 0;
        }
        else
        {
            // add new  node
            Node addback = lastElemement();
        }

    }

    static public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("-> ");
        String data = sc.nextLine();
        if (data.empty())
        {
            System.out.print("can't ass in empty input\n");
            exit(1);
        }
 
        // make a list to hold all of the present var or mybe int linked list 
        Node * hoderData = LinkedList();
        for (int i = 0; i < data.length ;i++)
        {
            
            // check for the the aplabit UPERKEYS
            
        }

    }
}