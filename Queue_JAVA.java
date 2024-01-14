/******************************************************************************
This is a 5 element Queue. Queue does first in first out like an array of ticket
line one after another.In Queue we can do isEmpty(Is any element left there 
checker), this is boolian function. Push(add new element in last), peek(take
first element to use) , pop(delete the first element), display(show the whole
Queue in a line).
*******************************************************************************/
public class Main   //Class Main
{
    int[] arr = {0, 0, 0, 0, 0} ;   //5 element Queue
    int index = 0 ;     
    int start = 0 ;
    int size = 5 ;      //Size of Queue
    
    public int isEmpty(){   //Queue is empty or not
        if ((index - start) < size){    //If differenc of index and start less then Queue size then true
            return 1 ;
        }
        return 0 ;
    }
    
    public void enqueue(int k){     //Add new element in most right
        if (isEmpty() == 0){
            System.out.println("Queue is full. Can't add.") ;
            return ;
        }
        arr[index] = k ;
        index ++ ;
    }
    
    public int peek(){      //Return the first element of Queue
        System.out.println("Peek : " + arr[0]);
        return arr[0] ;
    }
    
    public void dequeue(){      //Remove the first element of Queue
        if ((index - start) == 0){
            System.out.println("Queue is empty. Nothing to delete.") ;
            index = 0 ;
            start = 0 ;
            return ;
        }
        start ++ ;
    }
    
    public void display(){      //Show the whole Queue in a line
        if ((index - start) == 0){
            System.out.println("Queue is empty. Nothing to display.") ;
            return ;
        }
        System.out.print("Queue is : ") ;
        for (int i = start ; i < index ; i++){
            System.out.print(arr[i] + ", ") ;
        }
        System.out.print("\b\b \n") ;
    }
    
	public static void main(String[] args) {
		Main Queue = new Main() ;       //Calling Queue class 
		Queue.display() ;
		Queue.enqueue(1) ;
		Queue.enqueue(2) ;
		Queue.enqueue(3) ;
		Queue.enqueue(4) ;
		Queue.enqueue(5) ;
		Queue.display() ;
		Queue.enqueue(6) ;
		Queue.dequeue() ;
		Queue.dequeue() ;
		Queue.dequeue() ;
		Queue.display() ;
		Queue.dequeue() ;
		Queue.dequeue() ;
		Queue.display() ;
		Queue.dequeue() ;
		Queue.enqueue(7) ;
		Queue.display() ;
	}
}
