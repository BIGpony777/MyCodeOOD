import java.util.*;
class Top2Grader extends Grader
{
  public Top2Grader(Integer ary[])
  { super(ary); }
  
  @Override
  public double calculateGrade()
  {
    double ret = 0.0;
    Arrays.sort(getGrades());
    if(getGrades().length<1){
      ret = 0.0;
    }
    if(getGrades().length==1){
      ret = getGrades()[0];
    }
    if(getGrades().length>1){
      ret = (getGrades()[getGrades().length-1]+getGrades()[getGrades().length-2])/2;
    }
    return ret;
  }
  
  @Override
  public String toString()
  { return "Top2Grader"; }
}