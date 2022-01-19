

package ObjectAndClasses;

class Student
{
    private String Sname;
    private int TotalQuizScore;
    int NoOfQuizzes;

    Student(String n)   //Constructor
    {
        Sname=n;
        TotalQuizScore =0;
        NoOfQuizzes=0;
    }

    public String getSname()
    {
        return Sname;
    }

    public void addQuiz(int Score)
    {
        TotalQuizScore =TotalQuizScore+Score;
        NoOfQuizzes=NoOfQuizzes+1;
    }

    public int getTotalScore()
    {
        return TotalQuizScore;
    }

    public float getAverageScore()
    {
        return (TotalQuizScore/NoOfQuizzes);
    }
}

public class Example2_StudentScore_OAC {
    public static void main(String[] args) {

        Student obj=new Student("Viren");

        System.out.println("Name of Student:"+obj.getSname());
        int Score[]={50,60,20,30,40};
        for (int i=0;i<Score.length;i++)
            obj.addQuiz(Score[i]);
        System.out.println("Total Score of Quiz: "+obj.getTotalScore());
        System.out.println("Total number of Quiz: "+obj.NoOfQuizzes);
        System.out.println("Average Score: "+obj.getAverageScore());
    }
}
