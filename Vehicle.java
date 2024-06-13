public interface Vehicle {
    float speed();
}
class bike implements Vehicle{
    @Override
    public float speed() {
        return 0;
    }
}
class Student implements Comparable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}