import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to java project");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("PRESS 1 TO ADD STUDENT");
			System.out.println("PRESS 2 TO DELETE STUDENT");
			System.out.println("PRESS 3 TO DISPLAY STUDENT");
			System.out.println("PRESS 4 TO EXIT STUDENT");
			System.out.println("PRESS 5 TO EXIT STUDENT");
			int c = Integer.parseInt(br.readLine());

			if (c == 1) {
				// add student
				System.out.println("Enter user name:");
				String name = br.readLine();

				System.out.println("Enter user phone:");
				String phone = br.readLine();

				System.out.println("Enter user city:");
				String city = br.readLine();

				// create student object to storee student

				Student st = new Student(name, phone, city);
				boolean answer = StudentDao.insertStudentToDB(st);
				if (answer) {
					System.out.println("Studnet added sucessfully");
				} else {
					System.out.println("Something went wrong");
				}

				System.out.println(st);

			} else if (c == 2) {

				System.out.println("Enter student id to delete student");
				int userId = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deleteStudent(userId);
				if (f) {
					System.out.println("deleted.....");

				} else {

					System.out.println("Something is wrong....");
				}

				// delete student
			} else if (c == 3) {
				// display student
				StudentDao.showAllStudent();

			} else if (c == 4)

			{
				// exit
				break;
			} else {

			}

		}
		System.out.println("Thank you for using application....");
		System.out.println("See you soon....by by...");
	}
}
