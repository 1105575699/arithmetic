import java.lang.reflect.Method;

public class Test {

    private int value;
    private Test next;

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Test next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Test{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }

    public static void main(String[] args) {

        Test t = new Test();
        t.value = 1;
        t.next=new Test();
        t.next.value=2;
        t.next.next=new Test();
        t.next.next.value=3;
        t.next.next.next=new Test();
        t.next.next.next.value=4;
        t.next.next.next.next=new Test();
        t.next.next.next.next.value=5;
        t.next.next.next.next.next=null;
        Test head = new Test();
        head.next=t;

        Test c =Method(head);
        System.out.println(c.toString());


    }

    public static Test Method(Test head){

        Test a = head.next;
        Test b= a.next;
        Test c = null;
        a.next=null;
        while(b.next!=null){
            c=b;
            b=b.next;
            c.next=a;
            a=c;
        }
        b.next=a;
        return b;


    }



}