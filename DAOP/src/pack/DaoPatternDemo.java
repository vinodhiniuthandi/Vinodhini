package pack;
public class DaoPatternDemo {
	public static void main(String args[])
	{
		studentDao studentDao=new studentDaoImpl();
		//print all students
		for(student student:studentDao.getAllstudents())
		{
			System.out.println("student:[RollNo:"+student.getRollNo()+",name:"+student.getName()+"]");
		}
		//update student
		student student=studentDao.getAllstudents().get(0);
		student.setName("mani");
		studentDao.updatestudent(student);
		//get the student
		studentDao.getstudent(0);
		System.out.println("student:[RollNo:"+student.getRollNo()+",Name:"+student.getName()+"]");
	}

}


