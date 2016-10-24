package ru.larin.OneWayList;

/**
 * Created by mrden on 24.10.2016.
 */
/*Элемент односвязного списка*/
public class Node {
    private Object data;
    private Node nextElementLink; //ссылка на следующий элемент в листе

    public Node(Object data) {
        this.data = data;
    }

    public Object getData(){
        return this.data;
    }

    public void setNextElementLink(Node nextElementLink) {
        this.nextElementLink = nextElementLink;
    }

    public Node getNextElementLink() {
        return nextElementLink;
    }
}
