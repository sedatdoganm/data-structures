public class StackClass {
    int[] array;
    int size;
    int index;

    public StackClass(int size) {
        this.size = size;
        array = new int[size];
        index--;
    }

    // Ekleme
    public void push(int data) {
        if(isFull()){
            System.out.println("Stack is full!");
        }
        else{
            index++;
            array[index] = data;
            System.out.println("push(): "+array[index]);
        }
    }

    // Silme
    public int pop() {
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        else{
            return array[index--];
        }
    }

    // Dizi dolu mu?
    public boolean isFull() {
        return (index == size-1);
    }

    // Dizi bos mu?
    public boolean isEmpty() {
        return (index == -1);
    }
}
