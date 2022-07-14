package lost;

public class Booklost extends Lost {
    String name;
    String location;
    long time;
    public void get(String name, String location, long time) {
            this.time=time;
            this.location=location;
            this.name=name;
        }
    }




