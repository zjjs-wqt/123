package test.test02;


public class test02 implements Runnable{
    @Override
    public void run(){
        if(Thread.currentThread().getName().equals("A")){
            Thread.yield();
        }
        else {
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main (String[] args ) throws InterruptedException{
        test02 yield = new test02();
        Thread thread = new Thread(yield,"A");
        Thread thread2 = new Thread(yield,"B");

        thread.start();
        thread.join();

        thread2.start();

    }
    //Deamon 的使用
//    public  void run(){
//        for(int i = 1 ; i < 100 ; i++ ){
//            System.out.println("面馆准备了"+ i + "份材料");
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }
//
//    public static void main (String[] args){
//        test02  eatNoodleInMall = new test02();
//        Thread thread = new Thread(eatNoodleInMall,"");
//        thread.setDaemon(true);
//        thread.start();
//        for (int i = 0; i < 10; i++) {
//            if(i == 9)
//                System.out.println("小明吃完了面");
//        }
//    }

//    join sleep 的使用
//    public void run(){
//        try{
//            System.out.println(Thread.currentThread().getName());
//            Thread.sleep(500);
//        }catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//    public static void main(String[] args) throws InterruptedException {
//        test02 eatNoodle = new test02();
//        Thread thread = new Thread(eatNoodle,"放水");
//        Thread thread2 = new Thread(eatNoodle,"下面");
//        Thread thread3 = new Thread(eatNoodle,"吃面");
//        Thread thread4 = new Thread(eatNoodle,"洗碗");
//
////        thread.join();
//        thread.start();
//        thread.join();
//
////        thread2.join();
//        thread2.start();
//        thread2.join();
//
//
////        thread3.join();
//        thread3.start();
//        thread3.join();
//
////        thread4.join();
//        thread4.start();
//    }
}
