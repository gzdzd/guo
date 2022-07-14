package haha;

import java.util.Scanner;

class Cardlost extends Lost {
    public void get(String name,String location,long time){
        this.time=time;
        this.location=location;
        this.name=name;
    }

}
class Booklost extends Lost {
    public void get(String name,String location,long time){
        this.time=time;
        this.location=location;
        this.name=name;
    }

}
 class Lost{
    String name;
    String location;
    long time;//丢失时间 单位：小时
    public void get(String name,String location,long time){
        this.time=time;
        this.location=location;
        this.name=name;
    }
    }
    public class test extends Solution{
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
        test a=new test;
        a.sortLost(lostArray);
        a.acquire("菜鸟驿站");
        result=a.selectByKeyword(lostArray,a.location);

    }


}

   class Solution {

        public void sortLost(Lost[] lostArray) {
            for (int i = 0; i <= lostArray.length-1; i++) {
                for (int j = i; j <= lostArray.length-1; j++) {
                    if (lostArray[j].time <= lostArray[j + 1].time) {
                        Lost temp = lostArray[j];
                        lostArray[j] = lostArray[j + 1];
                        lostArray[j + 1] = temp;
                    }
                }
            }
                }
                public Lost[] selectByKeyword(Lost[] lostArray,String keyword )
                {
                    Lost found[] = new Lost[1];
                    int j=0;
                    for(int i=0;i<=lostArray.length-1;i++)
                    {
                     if(lostArray[i].location==keyword)
                     {
                         j++;
                        break;
                     }
                    }
                    return found;
                }
    }


