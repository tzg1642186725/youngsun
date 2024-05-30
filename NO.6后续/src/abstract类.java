public class abstract类 {
//    不能直接用new方法对其实例化
public static void main(String[] args) {
abstract class Student {//声明抽象类Student
    private String name;//抽象类中，声明成员变量和成员方法
    public void study(){
        System.out.println("我是学生，我爱学习。");
    }//抽象类中，也可以声明抽象方法
}
}

}
