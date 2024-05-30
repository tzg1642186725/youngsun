public class jicheng2 {
    public static void main(String []args){ //声明并创建老虎实例tiger
        System.out.println("【声明、创建老虎实例tiger，然后访问成员变量及成员方法】");
        Tiger tiger = new Tiger(); //对私有成员变量ID和Name赋值
        tiger.setID(101);	 tiger.setName("东北虎妞妞");
        //成员方法调用
        tiger.eat();	 tiger.sleep();	 tiger.run();
        System.out.println("【声明、创建鸟儿实例bird，然后访问成员变量及成员方法】");
        //声明并创建鸟儿实例bird
        Bird bird = new Bird();
//对私有成员变量ID和Name赋值
        bird.setID(201);
        bird.setName("蓝孔雀妍妍");
//成员方法调用
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
class Animal {//声明公共父类Animal
    private int ID;     //老虎和鸟儿都具有的私有属性：ID和name
    private String name;
    public int getID() { //声明setter()和getter()方法，给私有属性赋值取值
        return this.ID;}
    public void setID(int ID) {
        this.ID = ID;}
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void eat(){ //老虎和鸟儿都具有的行为：吃，睡
        System.out.println("午饭时间，"+this.getName()+"正在吃食物。");
    }
    public void sleep(){
        System.out.println("半夜三更，"+this.getName()+"正在睡觉。");
    }
}
class Tiger extends Animal{//声明Tiger类，并继承父类Animal
    public void run(){//新增老虎具有的行为：奔跑
        System.out.println("我是"+this.getID()+"号"+this.getName()+"，我正想迈开四方步，到草原奔跑一番。");
    }	}
class Bird extends Animal{//声明Bird类，并继承父类Animal
    public void fly(){ //新增鸟儿具有的行为：飞翔
        System.out.println("我是"+this.getID()+"号"+this.getName()+"，我正在张开双翼，准备展翅飞翔。");
    }	}



