package pack;
import java.util.ArrayList;
import java.util.List;
public class studentDaoImpl implements studentDao {
//list is working as a database
	List<student>students;
	public studentDaoImpl()
	{
		students=new ArrayList<student>();
		student student1=new student("vino",0);
		student student2=new student("dhini",1);
	students.add(student1);
	students.add(student2);
	}
	public void deletestudent(student student)
	{
		students.remove(student.getRollNo());
		System.out.println("student:rollNo"+student.getRollNo()+",deleted from database");
	}
	//retrieve list of students from the database
	
	public List<student>getAllstudents()
	{
		return students;
	}
	
	public student getstudent(int rollNo)
	{
		return students.get(rollNo);
	}

	public void updatestudent(student student)
	{
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("student:RollNo"+student.getRollNo()+"updated in the database");
	}
}



