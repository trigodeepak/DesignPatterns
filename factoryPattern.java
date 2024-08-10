// Factory Pattern 

// Question: We have to build a course website, an platorm could have multiple online course based on type(recorded, interactive) every course could have multiple modules.


// factoryInterface.java
// factory Interface
interface courseFactory {
  public Course createCourse(){}
  
}

// Course class
class Course{
  class Module{
    string videoLink;
    List<String> assignments; 
    List<List<Question>> tests
  }
  String id,name;
  String type;
  List<Module> modules;
  int likes, peopleEnrolled;
}

// creation of recordedCourse
class recordedCourse implements coursefactory{
  public Course createCourse(){
    Course c = new Course();
    c.type = "RECORDED";
    return c;
  }
}

// creation of interactiveCourse
class interactiveCourse implements coursefactory{
  public Course createCourse(){
    Course c = new Course();
    c.type = "INTERACTIVE";
    return c;
  }
}
