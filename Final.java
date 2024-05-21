package Java_practice2.MultiLevel_inheritance;

public class Final {
    public static void main(String[] args) {
        child child1 = new child();
        child1.home();
        grandfather g1 = new father(); // *************Dynamic Dispatch****************//
        g1.home();

    }
}
// if child doesn't have then child class will get info from parents(father) and if parent class doesn't
// have any info then it will get from grandparents(grandfather)
// we can access the child class with object of parents class.