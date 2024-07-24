public class Student
{
    private int studentID;
    private String name;
    private int age;
   private char grade;
     public Student(int studentID,String name,int age,char grade)
     {
         this.studentID=studentID;
         this.name=name;
         this.age=age;
         this.grade=grade;
     }
     public int getstudentID()
     {
         return studentID;
     }
     public void setstudentID()
     {
         this.studentID=studentID;
     }
    public String getname()
    {
        return name;
    }
    public void setname()
    {
        this.name=name;
    }
    public int getage()
    {
        return age;
    }
    public void setage()
    {
        this.age=age;
    }
    public char getgrade()
    {
        return grade;
    }
    public void setgrade()
    {
        this.grade=grade;
    }
    public void display()
    {
        System.out.print("name :"+name+" "+"studentID :"+studentID+" "+"age :"+ age+" "+" grade :"+ grade);
    }


}
