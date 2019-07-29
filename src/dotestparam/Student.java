package dotestparam;

/**
 * @ClassName: Student
 * @description:
 * @author: doujl
 * @create: 2019-07-11 14:28
 **/

import java.io.Serializable;

/**
 * @Description
 * @Author wanghongtao
 * @Date 2019/4/19
 */
public class Student implements Serializable{
    //**************成员方法***************//  
    public void show1(String s){
        System.out.println("调用了：公有的，String参数的show1(): s = " + s);
    }
    protected void show2(){
        System.out.println("调用了：受保护的，无参的show2()");
    }
    void show3(){
        System.out.println("调用了：默认的，无参的show3()");
    }
    private String show4(int age){
        System.out.println("调用了，私有的，并且有返回值的，int参数的show4(): age = " + age);
        return "asd";
    }
}
