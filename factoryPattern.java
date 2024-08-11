// Factory Pattern 

// Question: We have to build a course website, an platorm could have multiple online course based on type(recorded, interactive) every course could have multiple modules.

// Course class
public abstract class Course{
  
  String id,name;
  String type;
  List<Module> modules = new ArrayList<>();
  int likes, peopleEnrolled;

  public abstract void createCouse();
}

public abstract class Module{
    string videoLink;
    List<String> assignments; 
    List<List<Question>> tests
}

class introModule extends Module{
}

class summaryModule extends Module{
}

class videoModule extends Module{
  
}

// creation of recordedCourse
class recordedCourse extends Course{
  @Override
  public void createCourse(){
    type = "RECORDED";
    modules.add(new introModule());
    modules.add(new summaryModule());
  }
}

// creation of interactiveCourse
class interactiveCourse extends Course{
  @Override
  public void createCourse(){
    type = "INTERACTIVE";
    modules.add(new introModule());
    modules.add(new videoModuel());
  }
}


// factoryInterface.java
// factory Interface
public class courseFactory {
  public static Course getCourse(String type){
    if(type == "RECORDED"){
      return recordedCourse();
    }else if(type == "INTERACTIVE"){
      return interactiveCourse();
    }
    return null;
  }
}


// Driver code: 
public static void main(){
  Course rec = courseFactory.getCourse("RECORDED");
  Course interactive = courseFactory.getCourse("INTERACTIVE");
  assert rec != null;
  System.out.println(rec);
  assert interactive != null;
  System.out.prinln(interactive);
  
}

