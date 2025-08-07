public class Example {

    private int code;
    private long biggerCode = 12135131;
    private float decimalNumber = 10.1f;
    private double biggerDecimalNumber;
    private String text;
    private boolean status = false;
    private short smallNumber;
    private byte smallerNumber;

    public Example(int value){
        this.code = value;
    }


    public String returnText(){
        this.code = 0;
        return "jaslkjlkasd";
    }

    public int returnInt(){
        int value = 10;
        String text = "Text";
        this.text = null;
        return value;
    }

    public long returnLong(long num){
        this.text = "ldjsalkjslk";
        return num;
    }
}
