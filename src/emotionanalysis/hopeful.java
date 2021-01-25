package emotionanalysis;

import java.util.ArrayList;

public class hopeful extends positive {
    public static ArrayList<String> adjective=new ArrayList<String>();
    public hopeful(){
        adjective.add("会");
        adjective.add("一定会");
        adjective.add("祝");
        adjective.add("繁荣昌盛");
        adjective.add("国泰民安");
        adjective.add("想");
        adjective.add("结束");
        adjective.add("痊愈");
        adjective.add("清零");
        adjective.add("未来");
        adjective.add("正轨");
        adjective.add("繁华");
        adjective.add("前程似锦");
        adjective.add("重要");
        adjective.add("健康");
        adjective.add("望");
        adjective.add("才");
        adjective.add("小心");
        adjective.add("一起");
        adjective.add("加油");
        adjective.add("只要");
        adjective.add("愿");
        adjective.add("但愿");
        adjective.add("早日");
        adjective.add("恢复");
        adjective.add("生命");
        adjective.add("平安");
        adjective.add("健康");
        adjective.add("要");
        adjective.add("一定要");

        adjective.add("希望");
        adjective.add("祈祷");
        adjective.add("想");
        adjective.add("计划");



    }
    public static void main(String[] args){
        hopeful h=new hopeful();
        System.out.print(adjective);
    }
}
