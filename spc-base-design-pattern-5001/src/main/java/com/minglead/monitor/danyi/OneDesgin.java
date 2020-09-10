package com.minglead.monitor.danyi;

import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * All rights Reserved, Designed By www.minglead.com
 *
 * @Title: OneDesgin
 * @Package com.minglead.monitor.danyi
 * @Description: 设计模式-7种设计原则
 * 1、单一职责原则：一个类，一个方法，一个jar包，只完成一件事。
 * 2、开闭原则：对方法(在原来的方法上扩展)开放，对修改（不允许修改原来的代码）关闭
 * 3、接口隔离原则：一个接口只定义对应的业务逻辑。（比如dao接口，既定义了用户方法，又定义了订单，支付, 这违背的接口隔离原则。用户实现类，不需要订单、支付）
 * 4、依赖倒置原则：上层不直接依赖于下层，而是依赖于抽象。下层也不直接依赖于上层，而是通过定义一个共性接口，下层可以实现共享接口，上层直接调用对应的业务类即可，从而可以达到依赖倒置原则。
 * @author: luo.gl
 * @date: 2020-09-05 15:11
 * @Copyright: www.minglead.com Inc. All rights reserved.
 * 注意：本内容仅限于广州市明领信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class OneDesgin{

    class A {

    }

    // 继承
    class B extends A{

    }

    // 实现
    class F implements E{

    }
    interface E{

    }

    // 关联又分： 组合关系（强关系，必须要有， 鸟 -> 翅膀） 和 聚合关系（虚关联，非必须，鸟群 -> 鸟 ）

    // 关联
    class C{
        A a = new A();
    }

    // 依赖
    class D{
        public void methods(){
            A a = new A();
        }
    }

    /**
     * @Author luo.gl
     * @Description // 通过fileInputStream 流读取文件
     * 这里读取文件会读取unicon码表，一个中文两个字节，一个英文一个字节
     * @Date 10:37 2020/9/10
     * @Param []
     * @return void
     **/
    public static void fileInputStreamData(){
        FileInputStream in = null;
        try {
            in = new FileInputStream("F:\\1.txt");
            int n;
            byte[] b = new byte[in.available()];
            while ((n=in.read(b))!=-1){
                System.out.write(b, 0, n);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @Author luo.gl
     * @Description // 读文本
     * @Date 10:38 2020/9/10
     * @Param []
     * @return void
     **/
    public static void fileReaderData(){
        FileReader fileReader = null ;
        BufferedReader bf = null;
        try {
            fileReader = new FileReader("F:\\1.txt");
            bf = new BufferedReader(fileReader);
            StringBuilder sb = new StringBuilder();
//        int num;
//        while ((num=bf.read())!=-1){
//           sb.append((char) num);
//        }
            String str;
            while ((str=bf.readLine())!=null){
                sb.append(str);
                sb.append("\n");
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args ){


    }


    public void twoThead(){



    }
}
