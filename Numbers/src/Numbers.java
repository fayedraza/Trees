
public class Numbers {

	Node root;
	 public void preorderTraverseTree(Node focus) {
		 
		  
	
		         if (focus != null) {
		
		  
		 
		             System.out.println(focus);
		
		  
		
		             preorderTraverseTree(focus.leftNumber);
		
		             preorderTraverseTree(focus.rightNumber);
		
		  
	
		        }
	 }
	 public void inorderTraverseTree(Node focus) {
		 
		  
			
         if (focus != null) {

  
 
            

  

             inorderTraverseTree(focus.leftNumber);
             System.out.println(focus);
             inorderTraverseTree(focus.rightNumber);

  

        }
}
	 
	 public void postorderTraverseTree(Node focus) {
		 
		  
			
         if (focus != null) {

  
 
            

  

             postorderTraverseTree(focus.leftNumber);
  
             postorderTraverseTree(focus.rightNumber);
             System.out.println(focus);
  

        }
}
	 
	 public Node findNode(int key) {
		
		         // Start at the top of the tree
	
		         Node focus = root;
	
		  
		 
		         while (focus.number != key) {
		 
		             // If we should search to the left
		
		             if (key < focus.number) {
		
		                 // Shift the focus Node to the left child
		
		  

		                 focus = focus.leftNumber;
	
		  
		
		             } else {
	
		  
		
		                 // Shift the focus Node to the right child
		
		                 focus = focus.leftNumber;

		             }
		
		  
	
		             if (focus == null)

		                 return null;
		
		  
	
		         }
		
		  
		
		         return focus;
		 
		  
		 
		     }



	public void addNumber(int number) {
		Node numbers = new Node(number);
		
		if(root == null) {
			root=numbers;
		}else {
			Node focus = root;
			
			Node parent;
			
			while(true) {
				parent=focus;
				if(number < focus.number) {
					focus=focus.leftNumber;
					if(focus == null) {
						parent.leftNumber = numbers;
						return;
					}
				}else {
					focus=focus.rightNumber;
					if(focus==null) {
						
						parent.rightNumber = numbers;
						return;
					}
				}
			}
			
			
			
		}
		
		
		
	}
	
	
	
	public static void main (String[]args) {
		Numbers num = new Numbers();
		num.addNumber(34);
		num.addNumber(39);
		num.addNumber(340);
		num.addNumber(304);
		num.postorderTraverseTree(num.root);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

class Node{
	int number;
	
	
	Node leftNumber;
	Node rightNumber;
	
	
	public Node(int number) {
		this.number=number;
	}
	
	public String toString() {
		return "Number is " + number;
				
	}
}