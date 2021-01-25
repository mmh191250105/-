package emotionanalysis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class analysis {
    public static int firstperiod=1908;
    public static int secondperiod=2203;
    public static int thirdperiod=2405;
    public static int fourthperiod=2613;
    public static int fifthperiod=2869;
    public static ArrayList<String> lowadverb=new ArrayList<String>();//修饰程度
    public static ArrayList<String> highadverb=new ArrayList<String>();
    public static float low= (float) 0.5;
    public static float high= (float) 1;
    public String posadverb;
    public String posadjective;
    public String negadverb;
    public String negadjective;
    public float postime=0;//积极词的权重，倍数
    public float pos=1;//积极的基数
    public float neg=-1;
    public float negtime=0;
    public analysis(){
        lowadverb.add("有点");
        lowadverb.add("有一点");
        lowadverb.add("小");
        lowadverb.add("小小");
        lowadverb.add("小小的");
        lowadverb.add("稍显");
        lowadverb.add("略显");
        lowadverb.add("略微");
        lowadverb.add("稍微");
        lowadverb.add("稍");
        lowadverb.add("稍显");
        lowadverb.add("稍稍");
        lowadverb.add("略");
        lowadverb.add("微");//权重乘0.5
        highadverb.add("好");
        highadverb.add("太过");
        highadverb.add("过分");
        highadverb.add("过于");
        highadverb.add("大");
        highadverb.add("十分");
        highadverb.add("非常");
        highadverb.add("很");
        highadverb.add("超级");
        highadverb.add("巨大");
        highadverb.add("太");//*2
    }
    public float[] caculate(String[] example){
        float[] result=new float[6];
        angry A=new angry();
        sad S=new sad();
        disapointed D=new disapointed();
        happy H=new happy();
        hopeful Ho=new hopeful();
        thankful T=new thankful();

        float a=0;//angry
        float s=0;//sad
        float d=0;//disappointed
        float h=0;//happy
        float ho=0;//hopeful
        float t=0;//thank
        analysis an=new analysis();
        for(int i=0;i<example.length;i++){//先看有没有情感词
            if(angry.adjective.contains(example[i])){
                a+=1;
            }
            else if(sad.adjective.contains(example[i])){
                s+=1;
            }
            else if(disapointed.adjective.contains(example[i])){
                d+=1;
            }
            else if(happy.adjective.contains(example[i])){
                h+=1;
            }
            else if(hopeful.adjective.contains(example[i])){
                ho+=1;
            }
            else if(thankful.adjective.contains(example[i])){
                t+=1;
            }
        }

        for(int i=0;i<example.length-1;i++){//再判断有没有程度词

            if(lowadverb.contains(example[i])){//小程度词先出现
                if(angry.adjective.contains(example[i+1])){
                    a-=low*1;
                }
                else if(sad.adjective.contains(example[i+1])){
                    s-=low*1;
                }
                else if(disapointed.adjective.contains(example[i+1])){
                    d-=low*1;
                }
                else if(happy.adjective.contains(example[i+1])){
                    h-=low*1;
                }
                else if(hopeful.adjective.contains(example[i+1])){
                    ho-=low*1;
                }
                else if(thankful.adjective.contains(example[i+1])){
                    t-=low*1;
                }
            }
            else if(highadverb.contains(example[i])){//大程度词先出现
                if(angry.adjective.contains(example[i+1])){
                    a+=high*1;
                }
                else if(sad.adjective.contains(example[i+1])){
                    s+=high*1;
                }
                else if(disapointed.adjective.contains(example[i+1])){
                    d+=high*1;
                }
                else if(happy.adjective.contains(example[i+1])){
                    h+=high*1;
                }
                else if(hopeful.adjective.contains(example[i+1])){
                    ho+=high*1;
                }
                else if(thankful.adjective.contains(example[i+1])){
                    t+=high*1;
                }
            }
        }
        result[0]=a;
        result[1]=d;
        result[2]=s;
        result[3]=h;
        result[4]=ho;
        result[5]=t;
        //System.out.print("愤怒指数是："+a+"\n失望指数是："+d+"\n伤心指数是："+s+"\n开心指数是："+h+"\n希望指数是："+ho+"\n感动指数是："+t);
        //result=;
        return result;
    }
    public static void main(String[] args) throws IOException {
        analysis a=new analysis();
        String[] example=new String[5];
        //example[0]="很";
        //example[1]="开心";
        //example[2]="蛋炒饭";
        //example[3]="22";
        //example[4]="担心";

        //要对一个阶段的各个情绪值求和
        float an=0;//angry
        float s=0;//sad
        float d=0;//disappointed
        float h=0;//happy
        float ho=0;//hopeful
        float t=0;//thank


        int temp=1258;
        for(int i=1258;i<2870;i++){//一个阶段的所有关键词组合
            StringBuilder ii=new StringBuilder();//ii表示第i个文件，前面补0
            ii.append(String.valueOf(i));
            ii.reverse();
            for(int j=ii.length();j<6;j++){
                ii.append("0");
            }
            ii.reverse().toString();
            String keyword[] =new String[20];
            String fileName ="C:\\Users\\mmh123\\Desktop\\重点新闻 总\\"+ii+".txt";//读文件
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line =bufferedReader.readLine();
            StringBuilder allcontent=new StringBuilder();
            allcontent.append(line);
            while (line!=null){
                line = bufferedReader.readLine();
                allcontent.append(line);
            }
            keyword=allcontent.toString().split(" ",20);

            float[] result=new float[6];//用来储存caculate中的计算结果
            result=a.caculate(keyword);

            an+=result[0];
            s+=result[1];
            d+=result[2];
            h+=result[3];
            ho+=result[4];
            t+=result[5];


            if(i==firstperiod||i==secondperiod||i==thirdperiod||i==fourthperiod||i==fifthperiod){
                int numbers=i-temp;
                System.out.println("愤怒指数是："+an/numbers+"\n失望指数是："+d/numbers+"\n伤心指数是："+s/numbers+"\n开心指数是："+h/numbers+"\n期待指数是："+ho/numbers+"\n感动指数是："+t/numbers);
                System.out.print("\n");
                an=s=d=h=ho=t=0;
                temp=i;
            }
        }

    }

}
