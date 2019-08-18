package graph;

import queue.LinkedQueueObject;

public class Graph {

    int vertices;
    GraphLinkedListObject[]linkedListObjects;

    Graph(int vertices)
    {
        this.vertices=vertices;
        linkedListObjects=new GraphLinkedListObject[vertices];
        for(int i=0; i<vertices;i++)
        {
            linkedListObjects[i]=new GraphLinkedListObject(i);
        }
    }


}
