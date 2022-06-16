
abstract class language {
    abstract void display();
    public void java(){
        System.out.println("Programming language");
    }
}
class python extends language {
    void display() {
        System.out.println("Py is also a programming language");
    }
}
class c extends language{
    void display() {
        System.out.println("Prog lang c");
    }
}
class abst1{
    public static void main(String[] args) {
        python obj1 = new python();
        obj1.display();
        obj1.java();
        c obj2=new c();
        obj2.display();
        obj2.java();
    }
}