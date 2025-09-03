public class Student {
    String name;
    int age;
    int form;

    public void output(){
        System.out.print("Name:\t" + this.name + "\t");
        System.out.print("Age:\t" + this.age + "\t");
        System.out.println("Form:\t" + this.form);
    }

    public Student(String name, int age, int form){
        this.name = name;
        this.age = age;
        this.form = form;
    }
}
