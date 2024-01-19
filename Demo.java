class Human 
{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
 
}

class Demo 
{
        public static void main(String a[]) 
    {   
       
        //Encapsulation
        // Human obj1 = new Human();

        // obj1.setAge(29);
        // obj1.setName("Mann");

        // System.out.println(obj1.getName() + " Your Age is " + obj1.getAge());


        // Inheritance

        // 2. From Parent Class 
        Calculator cal = new Calculator();
        
        int addition = cal.add(5, 3);
        int subtraction = cal.subtract(10, 5);
        
        System.out.println("Output from Parent class " + addition + " " + subtraction);

        // 1. From Child Class 
        AdvanceCalculator advCal = new AdvanceCalculator();
        int add = advCal.add(5,5);
        int sub = advCal.subtract(5, 5);
        int multiplication = advCal.multiplication(5, 5);
        int division = advCal.division(5, 5);

        System.out.println("Output from inheritence class "+ add + " "+ sub + " "+multiplication + " "+division );


    }
}




