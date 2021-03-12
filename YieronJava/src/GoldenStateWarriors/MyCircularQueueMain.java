package GoldenStateWarriors;

public class MyCircularQueueMain {
    public static void MyCircularQueueMain(){

        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
        if (circularQueue.isEmpty()){
            System.out.print("Front:");
            System.out.println(circularQueue.Front());
            System.out.print("Rear:");
            System.out.println(circularQueue.Rear());
            System.out.print("isEmpty:");
            System.out.println(circularQueue.isEmpty());
            System.out.print("isFull:");
            System.out.println(circularQueue.isFull());
        }
        circularQueue.enQueue(1); // 返回 true
        if (!circularQueue.isEmpty()){
            System.out.print("Front:");
            System.out.println(circularQueue.Front());
            System.out.print("Rear:");
            System.out.println(circularQueue.Rear());
            System.out.print("isEmpty:");
            System.out.println(circularQueue.isEmpty());
            System.out.print("isFull:");
            System.out.println(circularQueue.isFull());
        }
        circularQueue.enQueue(2); // 返回 true
        if (!circularQueue.isEmpty()){
            System.out.print("Front:");
            System.out.println(circularQueue.Front());
            System.out.print("Rear:");
            System.out.println(circularQueue.Rear());
            System.out.print("isEmpty:");
            System.out.println(circularQueue.isEmpty());
            System.out.print("isFull:");
            System.out.println(circularQueue.isFull());
        }
        circularQueue.enQueue(3); // 返回 true
        if (!circularQueue.isEmpty()){
            System.out.print("Front:");
            System.out.println(circularQueue.Front());
            System.out.print("Rear:");
            System.out.println(circularQueue.Rear());
            System.out.print("isEmpty:");
            System.out.println(circularQueue.isEmpty());
            System.out.print("isFull:");
            System.out.println(circularQueue.isFull());
        }
        circularQueue.enQueue(4); // 返回 false，队列已满
        if (!circularQueue.isEmpty()){
            System.out.print("Front:");
            System.out.println(circularQueue.Front());
            System.out.print("Rear:");
            System.out.println(circularQueue.Rear());
            System.out.print("isEmpty:");
            System.out.println(circularQueue.isEmpty());
            System.out.print("isFull:");
            System.out.println(circularQueue.isFull());
        }
        circularQueue.deQueue(); // 返回 true
        if (!circularQueue.isEmpty()){
            System.out.print("Front:");
            System.out.println(circularQueue.Front());
            System.out.print("Rear:");
            System.out.println(circularQueue.Rear());
            System.out.print("isEmpty:");
            System.out.println(circularQueue.isEmpty());
            System.out.print("isFull:");
            System.out.println(circularQueue.isFull());
        }
        circularQueue.enQueue(4); // 返回 true
        if (!circularQueue.isEmpty()){
            System.out.print("Front:");
            System.out.println(circularQueue.Front());
            System.out.print("Rear:");
            System.out.println(circularQueue.Rear());
            System.out.print("isEmpty:");
            System.out.println(circularQueue.isEmpty());
            System.out.print("isFull:");
            System.out.println(circularQueue.isFull());
        }
        circularQueue.Rear(); // 返回 4
        if (!circularQueue.isEmpty()){
            System.out.print("Front:");
            System.out.println(circularQueue.Front());
            System.out.print("Rear:");
            System.out.println(circularQueue.Rear());
            System.out.print("isEmpty:");
            System.out.println(circularQueue.isEmpty());
            System.out.print("isFull:");
            System.out.println(circularQueue.isFull());
        }

    }
}
