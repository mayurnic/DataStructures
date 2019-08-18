package graph;

import queue.LinkedQueueObject;
import stack.StackUsingLinkedList;

public class DepthFirstSearch {

    public static void depthFistSearch(GraphLinkedListObject graphLinkedListObjects )
    {
        StackUsingLinkedList stack=new StackUsingLinkedList();
        stack.push(graphLinkedListObjects);
        graphLinkedListObjects.visited=true;

        while(!stack.isEmpty())
        {
            GraphLinkedListObject vertex=(GraphLinkedListObject) (stack.pop().getData());
            System.out.println(vertex.data);
            for(GraphLinkedListObject temp:vertex.getAdjacentNodeList())
            {
                if(temp.visited==false) {
                    stack.push(temp);
                    temp.visited = true;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Graph graph=new Graph(10);
        // System.out.println(graph.linkedListObjects.length);
        graph.linkedListObjects[0].addEdge(graph.linkedListObjects[1]);
        graph.linkedListObjects[0].addEdge(graph.linkedListObjects[4]);
        graph.linkedListObjects[0].addEdge(graph.linkedListObjects[3]);
        graph.linkedListObjects[1].addEdge(graph.linkedListObjects[4]);
        graph.linkedListObjects[1].addEdge(graph.linkedListObjects[5]);
        graph.linkedListObjects[2].addEdge(graph.linkedListObjects[3]);
        graph.linkedListObjects[6].addEdge(graph.linkedListObjects[7]);
        graph.linkedListObjects[6].addEdge(graph.linkedListObjects[8]);
        graph.linkedListObjects[6].addEdge(graph.linkedListObjects[9]);
        graph.linkedListObjects[5].addEdge(graph.linkedListObjects[9]);
        depthFistSearch(graph.linkedListObjects[1]);
    }


}
