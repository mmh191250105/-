package emotionanalysis;

import java.util.ArrayList;

public class sad extends negative {
    public static ArrayList<String> adjective=new ArrayList<String>();
    public sad(){
        adjective.add("不好");
        adjective.add("糟糕");
        adjective.add("难过");
        adjective.add("焦虑");
        adjective.add("紧张");
        adjective.add("愤怒");
        adjective.add("沮丧");
        adjective.add("太难");
        adjective.add("悲伤");
        adjective.add("痛苦");
        adjective.add("抱怨");
        adjective.add("悔恨");
        adjective.add("担忧");
        adjective.add("担心");
        adjective.add("不安");
        adjective.add("郁闷");
        adjective.add("伤心");
        adjective.add("堕落");
        adjective.add("烦躁");
        adjective.add("焦躁");
        adjective.add("恼火");
        adjective.add("气愤");
        adjective.add("哭");
        adjective.add("火灾");
        adjective.add("山火");
        adjective.add("哭泣");
        adjective.add("封城");
        adjective.add("烦");
        adjective.add("烦躁");
        adjective.add("消防");
        adjective.add("隔离");
        adjective.add("烦恼");
        adjective.add("伤心");
        adjective.add("北京");
        adjective.add("心疼");
        adjective.add("致命");
        adjective.add("可怕");
        adjective.add("哎");
        adjective.add("唉");
        adjective.add("难受");
        adjective.add("没心情");
        adjective.add("不好");
        adjective.add("坏");
        adjective.add("差");
        adjective.add("严峻");
        adjective.add("不想");
        adjective.add("担心");//赋值2
    }
    public static void main(String[] args){
        sad s=new sad();
        System.out.print(adjective);
    }
}
