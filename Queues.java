import java.util.Arrays;
import java.util.PriorityQueue;

public class Queues 
{
	public static void main(String[] args) 
	{
		
		PriorityQueue<String> queue1 = new PriorityQueue<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
		System.out.println("Queue 1 is: " + queue1);
		
		PriorityQueue<String> queue2 = new PriorityQueue<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));
		System.out.println("Queue 2 is: " + queue2);
		
		// Display the union, difference, and intersection
		
				PriorityQueue<String> Union1 = union(queue1, queue2);
				PriorityQueue<String> Difference1 = difference(queue1, queue2);
				PriorityQueue<String> Intersection1 = intersection(queue1, queue2);

				System.out.println("The union is: " + Union1);
				System.out.println("The difference (in queue 1 but not queue 2) is: " + Difference1);
				System.out.println("The intersection of sets is: " + Intersection1);
			}
	
		//Method for the union 
		private static <E> PriorityQueue <E> union(PriorityQueue <E> set1, PriorityQueue <E> set2) 
			{
			PriorityQueue<E> union = new PriorityQueue<>(set1);
			union.addAll(set2); 
			
			return union;
			} 

		// Method for the difference 
		private static <E> PriorityQueue<E> difference(PriorityQueue<E> set1, PriorityQueue<E> set2) 
			{
			PriorityQueue<E> difference = new PriorityQueue<>(set1);
			difference.removeAll(set2);
			
			return difference;
			}

		//Method for the intersection 
		private static <E> PriorityQueue<E> intersection(PriorityQueue<E> set1, PriorityQueue<E> set2) 
			{
			PriorityQueue<E> intersection = new PriorityQueue<>(set1);
			intersection.retainAll(set2);
			
			return intersection;
			}
}
