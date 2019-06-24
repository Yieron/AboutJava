public class MySingleTon {
    private static MySingleTon ourInstance = new MySingleTon();

    public static MySingleTon getInstance() {
        return ourInstance;
    }

    private MySingleTon() {
    }
}
