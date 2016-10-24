package ru.larin.OneWayList;

/**
 * Created by mrden on 24.10.2016.
 */
public class OneWayList {
    private Node first; //ссылка на первый элемент листа
    /*в конструкторе первый элемент = null = пустому списку*/
    public OneWayList(){
        this.first = null;
    }

    private void initObjNull(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            objects[i] = null;
        }
    }

    /*добавлене элемента*/
    public void add(Object data){
        Node node = new Node(data); //создаем новый элемент списка и кидаем туда данные
        node.setNextElementLink(first);//ссылка только что созданного элемента ссылается first
        first = node; //текущий элемент - первый в списке
    }
    /*удаление элемента*/
    public Node remove(){
        Node node = first; //элемент содержит первый элемент из списка
        first = first.getNextElementLink();//первая нода содержит ссылку на следующую
        return node;
    }
    /*очистка списка*/
    public void clean(){
        while (!isEmpty()){
            remove();
        }
    }
    public void printList(){
        Node node = first;
        while (node!=null){
            System.out.println(node.getData().toString());
            node = node.getNextElementLink();
        }
    }
    /*проверка на пустоту*/
    public boolean isEmpty(){
        if(first == null){
            return true;
        }
        return false;
    }
}
