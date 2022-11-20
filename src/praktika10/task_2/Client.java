package praktika10.task_2;

import praktika10.task_2.Chair;

public class Client {
    public Chair chair;
    public void sit(){
        System.out.println("Вы сели на стул");
    }
    public void setChair(Chair chair){this.chair=chair;}
}
