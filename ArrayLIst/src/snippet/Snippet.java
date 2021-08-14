package snippet;

public class Snippet {
	ListIterator<String> list1=list.listIterator(list.size());  
	              while(list1.hasPrevious())  
	              {  
	                  String str=list1.previous();  
	                  System.out.println(str);  
	              }  
}

