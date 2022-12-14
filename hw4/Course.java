/**
 @author: Justin Yamamoto
 @date: 10/20/2022
 This is the Course class for hw4 of cs151 with professor newton
*/

public class Course 
{
  private String name;
  private String description;
  private String department;
  private String startTime;
  private String day;

  /**
   Constructor for a Course 
   @param name The name of the course
   @param description The description of the course
   @param department the department of the course
   @param startTime the time the course starts
   @param day The day the course is held
 */
 public Course(String name, String description, String department, String startTime, String day)
 {
    this.name = name;
    this.description = description;
    this.department = department;
    this.startTime = startTime;
    this.day = day;
 }

 /**
  set the name of the course
  @param name the name of the course
 */
 public void setName(String name){this.name = name;}

 /**
  get the name of the course
  @return the name of the course
 */
 public String getName(){return this.name;}

 /**
  set the description of the course
  @param description the description of the course
 */
 public void setDescription(String description){this.description = description;}

 /**
  get the description of the course
  @return the description of the course
 */
 public String getDescription(){return this.description;}

 /**
  sets the department of the course
  @param department the department of the course
 */
 public void setDepartment(String department){this.department = department;}

 /**
  get the department of the course
  @return the department of the course
 */
 public String getDepartment(){return this.department;}

 /**
  set the start time of the course
  @param startTime the start time
 */
 public void setTime(String startTime){this.startTime = startTime;}

 /**
  get the start time of the course
  @return the start time of the course
 */
 public String getTime(){return this.startTime;}

 /**
  set the day of the course
  @param day the day of the course
 */
 public void setDay(String day){this.day = day;}

 /**
  get the day of the course
  @return the day of the course
 */
 public String getDay(){return this.day;}
}
