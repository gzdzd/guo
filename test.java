package solution;

import lost.Lost;

  public class test extends Solution {
    String location;
    public void acquire(String location) {
        this.location = location;
    }
    public static void main(String[] args) {
        Lost result[] = new Lost[1];
        Lost lostArray[]=new Lost[2];
        lostArray[0].get("牙刷", "中心食堂", 9);
        lostArray[1].get("手套","樱花庄",8);
        lostArray[2].get("手表","菜鸟驿站",10);
        test a=new test();
        a.sortLost(lostArray);
        a.acquire("菜鸟驿站");
        result=a.selectByKeyword(lostArray,a.location);
//result数组内就是得到的结果
    }
}
