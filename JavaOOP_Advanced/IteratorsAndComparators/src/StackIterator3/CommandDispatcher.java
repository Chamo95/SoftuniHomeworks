package StackIterator3;

import java.util.List;

public class CommandDispatcher {
	private MyStack<Integer> stack;
	
	public CommandDispatcher() {
		this.stack =new LinkedStack<>();
	}

	public void dispatch(String command,List<Integer> toPush) {
		switch(command) {
		case "Push" : {
			toPush.forEach(e->stack.push(e));
			break;
		}
		case "Pop" :{
			 try {
                 this.stack.pop();
             } catch (MyStackEmptyException ex) {
                 System.out.println(ex.getMessage());
             }
		}
             break;
         case "END":
             for (Integer number : this.stack) {
                 System.out.println(number);
             }
             while (!this.stack.isEmpty()) {
                 System.out.println(this.stack.peek());
                 this.stack.pop();
             }
             break;
		}
		
	
}
}