package com.exception.demo01;

public class Test {
    public static void main(String[] args) {

        int a = 1;
        int b = 0;

        //假设要捕获多个异常。从小到大

        try {
            new Test().test(1,0);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }

//        try { //try监控区域
//
//            if (b==0){//主动的抛出异常 throw throws
//                throw new ArithmeticException()
//
//            }
//        }catch (Error e) { //catch(想要捕获的异常类型)
//            System.out.println("ERROR");
//        }catch (Exception e){
//            System.out.println("Exception");
//        }catch (Throwable e){
//            System.out.println("Throw");
//        }finally {
//            System.out.println("finally");
//        }

        //finally可以不要，一般用于IO，资源的关闭，进行善后工作

    }

    //假设这方法中，处理不了这个异常，方法上抛出异常
    public void test(int a, int b)throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException();//主动抛出异常，一般在方法中使用
        }
        System.out.println(a/b);
    }


//    public void a(){
//        b();
//    }
//
//    public void b(){
//        a();
//    }
}


//try { //try监控区域
//        System.out.println(a/b);
//        }catch (ArithmeticException e){
//        System.out.println("程序出现异常，变量不能为0");
//        }finally {
//        System.out.println("finally");
//        }