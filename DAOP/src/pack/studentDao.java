package pack;
import java.util.List;
public interface studentDao {
	public List<student>getAllstudents();
	public student getstudent(int rollNo);
	public void updatestudent(student student);
	public void deletestudent(student student);
}


