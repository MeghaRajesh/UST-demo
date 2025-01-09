public class MyArrayListDemo {
    public static void main(String[] args) {
        MyArrayList array=new MyArrayList();
        array.addItems(6);
        array.print();
        array.addItems(5);
        array.print();
        array.addItems(4);
        array.print();
        array.addItems(3);
        array.print();
        array.addItems(2);
        array.print();
        array.addItems(1);
        array.print();
        array.addItems(1);
        array.print();
        array.addItems(1);
        array.print();
        array.addItems(1);
        array.print();
        System.out.println("---------");
        System.out.println(array.deleteItems(4));
        array.print();
        System.out.println("---------");
        System.out.println(array.deleteItems(40));
        array.print();

    }
    
}
