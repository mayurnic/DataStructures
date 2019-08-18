package graph;

import queue.LinkedQueueObject;
import trees.BinaryTree;
import trees.BinaryTreeObject;

public class BreadthFirstSearch {

    public static void breadthFistSearch(GraphLinkedListObject graphLinkedListObjects )
    {
        LinkedQueueObject queue=new LinkedQueueObject();
        queue.Enqueue(graphLinkedListObjects);
        graphLinkedListObjects.visited=true;

        while(!queue.isEmpty())
        {

            GraphLinkedListObject vertex=(GraphLinkedListObject) queue.Dequeue();
            System.out.println(vertex.data);
            for(GraphLinkedListObject temp:vertex.getAdjacentNodeList())
            {
                if(temp.visited==false) {
                    queue.Enqueue(temp);
                    temp.visited = true;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Graph graph=new Graph(5);
        // System.out.println(graph.linkedListObjects.length);
        graph.linkedListObjects[0].addEdge(graph.linkedListObjects[1]);
        graph.linkedListObjects[0].addEdge(graph.linkedListObjects[4]);
        graph.linkedListObjects[0].addEdge(graph.linkedListObjects[3]);
        graph.linkedListObjects[1].addEdge(graph.linkedListObjects[4]);
        graph.linkedListObjects[1].addEdge(graph.linkedListObjects[4]);
        graph.linkedListObjects[3].addEdge(graph.linkedListObjects[2]);
        breadthFistSearch(graph.linkedListObjects[1]);
    }


}
