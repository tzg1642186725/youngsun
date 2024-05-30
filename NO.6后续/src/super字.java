class Point { //创建父类：Point
    private float x,y;                    // x轴坐标和y轴坐标
    public Point(float mX, float mY) {      // 父类构造方法
        x = mX;	y = mY;	}
    public float getX(){
        return x;	}
    public float getY(){
        return y;	}	}
class Circle extends Point { // 创建子类：Circle，继承于父类Point
    private float radius;                  // 半径
    public Circle(float x,float y, float r) {    // 构造方法
        super(x, y);               // 显式调用父类构造方法，必须是第一条语句
        radius = r;	}
    public float getRadius(){
        return radius;	}	}


//父类与子类有同名成员变量，则子类中默认访问是属于自己的成员变量
class SuperClass {//创建父类
    public int num=20;              //声明成员变量num
}

//，若要子类中成员变量能够隐藏父类中的同名成员变量，则父类中的该成员变量不能是private型。
class SubClass extends SuperClass {// 创建子类，继承于父类
    public int num=10;             // 声明成员变量，与父类成员变量num同名
    public void show(){
        System.out.println("默认调用子类num的值："+num); //默认输出之子类成员变量num的值
        System.out.println("使用super关键字，指定调用父类num的值："+super.num);//指定输出父类的成员变量num的值
    }
}
//父类和子类中有同名方法，则在子类中默认访问是属于自己的成员方法
class father{
    public void print(){ //声明成员方法print
        System.out.println("father 的point方法");
    }
}
class son extends father{    //创建子类，继承于父类
    public void print() {                //声明成员方法print
        System.out.println("son的print方法");	}
        public void show(){
            print();                    // 默认调用的是子类自己的成员方法print
            super.print();               // 通过super关键字，指定访问父类的成员方法print
        }
}




public class super字 {
    public static void main(String[] args) {
        Circle circle = new Circle(10,11, 12);    //创建Circle类实例对象circle
        System.out.println("圆心坐标： ("+circle.getX()+"，"+circle.getY()+")");
        System.out.println("圆的半径为："+circle.getRadius());
        SubClass subClass = new SubClass();
        subClass.show();
        son subClass3 = new son();  //创建子类SubClass实例对象
        subClass3.show();
    }
}

