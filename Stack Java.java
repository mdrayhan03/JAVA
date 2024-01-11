/******************************************************************************
This is a 5 element Stack. Stack does last in first out like an array of book
standing one upon another.In Stack we can do isFull(All element occupied or 
not checker), isEmpty(Is any element left there checker), they are boolian 
function. Push(add new element in last), peek(take last element to use) , pop
(delete the last element), display(show the whole Stack in a line).
*******************************************************************************/
public class Main   //class Main
{
    int[] arr = {0, 0, 0, 0, 0} ;   //5 element Stack
    int index = 0 ;
    int size = 5 ;
    
    public int isEmpty(){   //Stack is empty or not
        if (index < size){
            return 1 ;
        }
        return 0 ;
    }
    
    public void push(int k){    //Add a new element in most right
        if (isEmpty() == 0){
            System.out.println("Stack is full. Can't add.") ;
            return ;
        }
        arr[index] = k ;
        index ++ ;
    }
    
    public int peek(){      //Return the last element
        System.out.println("Peek : " + arr[index - 1]);
        return arr[index - 1] ;
    }
    
    public void pop(){      //Remove the last element
        if (index == 0){
            System.out.println("Stack is empty. Nothing to delete.") ;
        }
        index -- ;
    }
    
    public void display(){  //Show the whole Stack in a line
        if (index == 0){
            System.out.println("Stack is empty. Nothing to display.") ;
            return ;
        }
        System.out.print("Stack is : ") ;
        for (int i = 0 ; i < index ; i++){
            System.out.print(arr[i] + ", ") ;
        }
        System.out.print("\b\b \n") ;
    }
    
	public static void main(String[] args) {
		Main Stack = new Main() ;       //Calling Stack class
		Stack.push(5) ;
		Stack.push(6) ;
		Stack.push(7) ;
		Stack.display() ;
		Stack.peek() ;
		Stack.push(0) ;
		Stack.push(3) ;
		Stack.display() ;
		Stack.push(2) ;
		Stack.pop() ;
		Stack.pop() ;
		Stack.pop() ;
		Stack.pop() ;
		Stack.display() ;
		Stack.pop() ;
		Stack.display() ;
		Stack.pop() ;
	}
}
