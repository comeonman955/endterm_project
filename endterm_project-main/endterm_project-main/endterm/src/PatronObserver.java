public class PatronObserver implements Observer {
    private String name;

    public PatronObserver(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}
