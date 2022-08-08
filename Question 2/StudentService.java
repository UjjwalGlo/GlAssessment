package Assessment;

import com.college.dao.StudentDao;

import com.college.model.Student;

public class StudentService {

	public String Insert(Student s)

	{

		StudentDao sdao = new StudentDao();
		sdao.Insert(s);
		return sdao;

	}

}