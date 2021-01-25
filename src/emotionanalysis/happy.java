package emotionanalysis;

import java.util.ArrayList;

public class happy extends positive {
    public static ArrayList<String> adjective=new ArrayList<String>();
    public happy(){
        adjective.add("喜欢");
        adjective.add("减轻");
        adjective.add("发达");
        adjective.add("可靠");
        adjective.add("解封");
        adjective.add("解除");

        adjective.add("一定");
        adjective.add("积极");
        adjective.add("温暖");
        adjective.add("好看");
        adjective.add("保护");
        adjective.add("恭喜");
        adjective.add("保护");
        adjective.add("支持");
        adjective.add("高兴");
        adjective.add("开心");
        adjective.add("感动");
        adjective.add("致敬");
        adjective.add("太好了");
        adjective.add("赞");
        adjective.add("硬核");
        adjective.add("真好");
        adjective.add("敬礼");
        adjective.add("兴奋");
        adjective.add("不错");
    }
    public static void main(String[] args){
        happy h=new happy();
        System.out.print(adjective);
    }
}
