package day33exceptionsenumsiterator;

public class ExceptionRunner {


    /*
    Garbage Collector memory i temiz tutmak icin surekli memory i tarar ve silinmesi gerekkenleri siler
    Garbage Collector silmeden once silecegi datalari filanize eder ve sonra siler.
     */
    public static void main(String[] args) throws InvalidStudentGradeException{
          getStudentGrade(50);
          getStudentGrade(150);
          getStudentGrade(-50);
          getTheNumberOfStudents(15);
          getTheNumberOfStudents(-34);
    }
    public static void getStudentGrade(int grade)throws InvalidStudentGradeException{
        if(grade<0||grade>100){
           try{ throw new InvalidStudentGradeException("Student's grades cannot be less than zero or greater than 100");
           }catch(InvalidStudentGradeException e){
               System.out.println(e.getMessage());
           }

        }else{
            System.out.println(grade);
        }
    }
    public static void getTheNumberOfStudents(int numOfStudents){
        if(numOfStudents<0){
           try{ throw new InvalidNumberException("Student number cannot be negative");
           }catch(InvalidNumberException e){
               System.out.println(e.getMessage());
           }
        }else{
            System.out.println(numOfStudents);
        }
    }
}
