class Override{
    int Add(int a, int b){
        return a+b;
    }
}

class A extends Override{
    public int Add(int a, int b){
        return a-b;
    }
}
public class Pr4 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.Add(10,20));
    }
}
