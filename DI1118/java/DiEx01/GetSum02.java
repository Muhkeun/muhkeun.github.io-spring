package DiEx01;

public class GetSum02 {

    GetSum getSum;


    private int a;
    private int b;

    //생성자
    public GetSum02(){
    }

    public void sum(){
        getSum.sum(a, b);
    }


    // setter
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setGetSum(GetSum getSum) {
        this.getSum = getSum;
    }
}
