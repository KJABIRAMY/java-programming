import java.io.*;
import java.util.*;

class AddAmount {
    int amount = 50;
    AddAmount() {
        System.out.println("No amount is added to piggie bank. Current amount: " + amount);
    }
    AddAmount(int added) {
        amount += added;
        System.out.println("Final amount: " + amount);
    }
}
class PiggieBank {
    public static void main(String[] args) {
        AddAmount p1 = new AddAmount();
        AddAmount p2 = new AddAmount(50);
    }
}


