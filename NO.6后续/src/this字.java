public class this字 {
    public static void main(String[] args) {
//        private String name;                //声明成员变量name
//        public void setName (String name){   //声明一个形参（局部变量）name
//            this.name = name;             //将局部变量name的值赋给成员变量name
//        }
//    }
    }

//    只能在构造方法中使用this调用其他的构造方法，不能在成员方法中使用。
//    在构造方法中，使用this调用的构造方法的语句必须位于第一行，且只能出现一次。
//    不能在一个类的两个构造方法中使用this互相调用。

    class Student2 {  //创建学生类Student2，包含方法fetch、read以及speak.

            private void fetch(boolean flag) {
                if (flag == true)
                    System.out.println("调用了fetch方法，拿了本Java书。");
                else
                    System.out.println("调用了fetch方法，只拿了笔。");
            }

            private void read() {
                System.out.println("调用了read方法，读了三本Java编程书。");
            }

            public void speak() {
                System.out.println("调用了speak方法，自我介绍学习情况：");
                this.read();
                this.fetch(true);
            }

            public Student2() {                      //声明无参构造方法
                System.out.println("无参的构造方法被调用了");
            }

            public Student2(String name) {            //声明含一个形参的参构造方法
                this();                            //调用无参的构造方法
                System.out.println("有参的构造方法被调用了");
            }
        }


}