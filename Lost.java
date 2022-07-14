package lost;
import solution.Solution;
public abstract class Lost{
    public String name;
    public String location;
    public long time;
   //丢失时间 单位：小时
    public void get(String name,String location,long time){
        this.location=location;
        this.name=name;
        this.time=time;//获得时间，地点，名字
    }
    public String getname(){//返回名字
        return name;
    }
    public String getlocation(){
        return location;
        //返回位置
    }
    public long gettime(){
        return time;
        //返回时间
    }



    }





