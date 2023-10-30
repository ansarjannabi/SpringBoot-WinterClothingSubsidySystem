
    /**
     * 泛型的使用
     * （1）定义和使用含有泛型的类
     * 格式:修饰符class 类名<代表泛型的变量>{}
     * (2)含有泛型的方法
     * 格式:修饰符<代表泛型的变量>返回值类型 方法名（）{}
     */
    //例如
    class Person <T>{//定义泛型类
        private T t;

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }
        public <K> K hello(K k){
            return k;
        }
        public <K> void hello1(K k){
            System.out.println("泛型方法");
        }
    }
    public class Main {
        public static void main(String[] args) {
            Person <String> p = new Person<>();
            p.setT("hello");
            System.out.println(p.getT());
            p.hello("hello");
            p.hello(11);
        }

}