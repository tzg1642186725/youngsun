
    //    硬件接口：指的是两个硬件设备之间的连接方式，硬件接口既包括物理上的接口，还包括逻辑上的数据传输协议。
//    软件接口：指的是程序模块(或者类)对其外部提供的统一行为规范，是一些方法特征的集合。
//    父接口列表：java中，一个类只能extends一个父类，但可以implements多个接口。
    interface Shout { //声明接口Shout
        void shout();  //公用抽象方法，省略关键字abstract public
    }

    interface Eat {    //声明接口Eat
        void eat();   //公用抽象方法，省略关键字 abstract public
    }
    class Animal implements Shout,Eat {  //声明公共接口Animal，继承父接口Shout和Eat
        public void shout() {    //具体实现接口Shout中的抽象方法shout
            System.out.println("所有动物都会叫。");
        }

//        public interface Animal extends Shout,Eat{//声明接口Animal，继承父接口Shout和Eat
//            int COUNT = 1;  //公用静态常量，省略关键字 pubic static final
//        }

    public void eat() {      //具体实现接口Eat中的抽象方法eat
        System.out.println("所有动物都会进食。");
    }
}
public class 接口{   //创建测试类AnimalDemo
    public static void main(String []args){
        Animal animal = new Animal();  //声明并创建animal对象
        animal.shout();                //调用shout方法
        animal.eat();                  //调用eat方法
    }
}

