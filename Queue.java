public class Queue{
    public LinkedList queue;
    public int size;
    public int maxSize;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;

    public Queue(){
        this(DEFAULT_MAX_SIZE);
    }

    public Queue(int maxSize){
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean hasSpace(){
        return this.size < this.maxSize;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void enqueue(String data){
        if(hasSpace()){
            this.queue.addToTail(data);
            this.size++;
        }else{
            throw new Error("Queue is full!");
        }
    }

    public String dequeue(){
        if(!this.isEmpty()){
            String data = this.queue.removeHead();
            this.size--;
            return data;
        }else{
            throw new Error("Queue is empty!");
        }
    }

    public String peek(){
        if(this.isEmpty()){
            return null;
        }else{
            return this.queue.head.data;
        }
    }
}