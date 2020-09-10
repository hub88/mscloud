package com.minglead.monitor.thream;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * All rights Reserved, Designed By www.minglead.com
 *
 * @Title: One
 * @Package com.minglead.monitor.thream
 * @Description:
 * @author: luo.gl
 * @date: 2020-09-10 10:31
 * @Copyright: www.minglead.com Inc. All rights reserved.
 * 注意：本内容仅限于广州市明领信息科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class One {

    public static void main(String[] args) {
        threadOneMethod();
    }

    public static void threadOneMethod(){
        // 12a34b....
        Object obj = new Object();
        AtomicInteger num = new AtomicInteger(1);
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                synchronized (obj){
                    if(num.get()==3){
                        System.out.print(i);
                    }else{
                        if(num.get()!=1){
                            try {
                                obj.notify();
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.print(i);
                        if(i%2==0){
                            try {
                                num.set(2);
                                obj.notify();
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        },"t1");
        t1.start();
        for(int i=65;i<91;i++){
            synchronized (obj){
                if(num.get()!=2){
                    try {
                        obj.notify();
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print((char)i);
                if(i!=90) {
                    try {
                        num.set(1);
                        obj.notify();
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    num.set(3);
                    obj.notifyAll();
                }
            }
        }
    }

}
