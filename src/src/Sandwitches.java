import java.util.*;
public class Sandwitches {
   //->intialize queue, int count
    //->traverse the student arr and push the elements in queue
    //end of loop
    //->while q.size is greater then zero and count is not equal to queue size check if q.front ==sandwiches[i] if yes then count=0 q.pop and i++
    //else place the q front in variable x and pop the element then again push in the queue(so that it can go to queue back ) and increment count
    //->return q size

    public int countStudents(int[] students, int[] sandwiches) {
        int len = students.length;
        Queue<Integer> studentQueue = new LinkedList<>();
        for (int student : students)
            studentQueue.add(student);
        Stack<Integer> sandwichStack = new Stack<>();
        for (int i = len - 1; i >= 0; i--)
            sandwichStack.push(sandwiches[i]);
        int served = 0;
        while (!studentQueue.isEmpty() && served < studentQueue.size()) {
            if (sandwichStack.peek().equals(studentQueue.peek())) {
                sandwichStack.pop();
                studentQueue.poll();
                served = 0;
            } else {
                studentQueue.add(studentQueue.peek());
                studentQueue.poll();
                served++;
            }
        }
        return studentQueue.size();
    }
}
