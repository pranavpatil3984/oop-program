 class calculator {

int add(int a,int b){
   return a+b;
}
int add(int a, int b,int c){
    return a + b + c;
}
double add(double a,double b){
    return a+b;
}
}
class Student {
    String name;
    int age;
    Student(){
        name="Pranav";
        age=20;
    }
    Student(String n,int a){
        name = n;
        age = a;
    }
    Student(Student s){
        this.name=s.name;
        this.age=s.age;
    }
    void display(){
        System.out.println("Name:"+name+",age:"+age);
     }
     Student getsStudent(){
        return this;
     }
}
public class FunctionDemo{
    public static void main(String[] args){
        calculator calc =new  calculator();
        System.out.println("Add two intergers:"+calc.add(7,13));
        System.out.println("Add three intergers:"+calc.add(10,12,18));
        System.out.println("add two doubles:" + calc.add(9.9,4.9));


        Student s1 = new Student();
        Student s2 = new Student("Kartik",18);
        Student s3 = new Student(s2);

        s1.display();
        s2.display();
        s3.display();

        Student s4 = s2.getsStudent();
        System.out.println("Student s4 details(reference to s2):");
        s4.display();
        }
    }

 
    

