import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph {
    int numberOfNodes;
    Map<String, ArrayList<String>> adjacentList;
    public Graph(){
        numberOfNodes = 0;
        adjacentList = new HashMap<>();
    }

    private void addVertex(String node){
        this.adjacentList.put(node, new ArrayList<>());
        this.numberOfNodes++;
    }

    private void addEdge(String node1, String node2){
        ArrayList<String> list1 = this.adjacentList.get(node1);
        list1.add(node2);
        this.adjacentList.put(node1, list1);

        ArrayList<String> list2 = this.adjacentList.get(node2);
        list2.add(node1);
        this.adjacentList.put(node2, list2);
    }

    private void showConnections(){
        for(Map.Entry<String, ArrayList<String>> map : adjacentList.entrySet()){
            System.out.println(map.getKey() + "---->" + map.getValue());
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("0");
        graph.addVertex("1");
        graph.addVertex("2");
        graph.addVertex("3");
        graph.addVertex("4");
        graph.addVertex("5");
        graph.addVertex("6");
        graph.addEdge("3", "1");
        graph.addEdge("3", "4");
        graph.addEdge("4", "2");
        graph.addEdge("4", "5");
        graph.addEdge("1", "2");
        graph.addEdge("1", "0");
        graph.addEdge("6", "5");
        graph.addEdge("2", "0");


        graph.showConnections();
    }
}
