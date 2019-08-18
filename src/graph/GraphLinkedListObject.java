package graph;


import java.util.ArrayList;
import java.util.List;

public class GraphLinkedListObject {

    public Object data;
    public List<GraphLinkedListObject> adjacentNodes;
    boolean visited=false;

    public GraphLinkedListObject(Object data)
    {
        adjacentNodes=new ArrayList<>();
        this.data=data;
    }
    public void setData(Object data)
    {
        this.data=data;
    }
    public Object getData()
    {
        return this.data;
    }

    public void addEdge(GraphLinkedListObject node)
    {
        this.adjacentNodes.add(node);
        node.adjacentNodes.add(this);
    }


    public List<GraphLinkedListObject> getAdjacentNodeList()
    {
        return this.adjacentNodes;
    }


}
