class Student{//声明学生类Student，声明并赋初始值final String collegeName = "清华大学";
    final String collegeName = "清华大学";    //初始化final型成员变量collegeName
    public void introduce(){                 //打印输出成员变量collegeName的值
        System.out.println("我读书的学校是："+collegeName);
    }
}
//        final修饰的类不能被继承；
//        final修饰的方法不能被子类重写；
//final修饰的变量称为常量，它只能在声明时赋初始值，且只能赋值一次
public class final字 {//创建测试类StudentDemo
    public static void main(String []args){
        Student stu = new Student();    //创建Student类的实例对象stu
        stu.introduce();               //通过对象stu调用成员方法introduce()
    }
}
//①被隐藏的属性，在子类对象被强制转换成父类对象后(此时父类对象叫上转型对象)，默认访问的是父类对象的属性；在无强制转换时，子类对象若要访问父类对象的属性，则需要在子类中使用super关键字来访问。
//        ②被覆盖的方法，在子类对象被强制转换成父类对象后，默认调用的还是子类对象自身的方法；子类对象若要访问父类对象的方法，则需要的子类中使用super关键字来访问