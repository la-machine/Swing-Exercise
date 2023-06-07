
package tp2_promotion;

import java.util.ArrayList;


public class Promotion {
    
    private ArrayList<Student> studentList;
    
    public Promotion(){
        studentList = new ArrayList<>();
    }
    
    public int newId(){
    int studentCount = 0;
    studentCount= studentList.size();
    if (studentCount == 0){
        
        return 0;}
    int largeId = studentList.get(0).getId();
    for (int i=0; i<studentCount; i++){
        int id = studentList.get(i).getId();
        if (id> largeId){
        largeId = id;}
    }
    return largeId + 1;
    }
    
    public int addStudent(String name, String surname, int age){
         int id = newId();
        studentList.add(new Student(id, name, surname, age));
        return id;
    }
    public void displayStudent(){
        for (Student student : studentList){
        System.out.println(student.getId()+ " " + student.getName()+ " " + student.getSurname()+ " " + student.getStudAge()+ " ");
        } 
    }
    public ArrayList<Student> getStudentList(){
    return studentList;}
    // function to swap student
   public void swap(int i, int j){
    Student tmp = studentList.get(i);
    studentList.set(i,studentList.get(j));
    studentList.set(j, tmp);
   }
   // function to sort
   public void insertionsort(){
    int n = studentList.size(); //taille
    for(int i=0; i<n-1; i++){
        int smallindex = i;
        Student min = studentList.get(i);
        for (int j = i+1; j <n; j++){
            Student sj = studentList.get(j);
            if (sj.getName().compareTo(min.getName())<0){
                smallindex =j;
                min = sj;
            }
        }
        swap(i,smallindex);
    }
   }
}
