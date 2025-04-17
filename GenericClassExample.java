class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        // Integer Box
        Box<Integer> intBox = new Box<>();
        intBox.setContent(10);
        System.out.println("Integer content: " + intBox.getContent());

        // String Box
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello Generics!");
        System.out.println("String content: " + stringBox.getContent());
    }
}
