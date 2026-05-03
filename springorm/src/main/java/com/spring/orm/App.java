package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//
//        Student student = new Student(2324, "Rushi Rasal", "Pune");
//
//        int i = studentDao.insert(student);
//
//        System.out.println("Done " + i);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go=true;
		while (true) {
			System.out.println("Press 1 For Add New Student");
			System.out.println("Press 2 for Display All Student");
			System.out.println("Press 3 For Single Student");
			System.out.println("Press 4 For delete Student");
			System.out.println("Press 5 For Update Student");
			System.out.println("Press 6 For Exit ");

			try {
				int input = Integer.parseInt(br.readLine());
//        		if(input==1) {
//        			
//        		}
				switch (input) {
				case 1: {
					//Taking Input from User
					System.out.println("Enter USer Id");
					int uid=Integer.parseInt(br.readLine());
					
					System.out.println("Enter USer Name");
					String uName=br.readLine();
					
					System.out.println("Enter USer City");
					String uCity=br.readLine();
					
					//Creating student object and setting values
					Student s=new Student();
					s.setStudentId(uid);
					s.setName(uName);
					s.setCity(uCity);
					
					//saving student object to database by calling insert of student dao
					int r = studentDao.insert(s);
					System.out.println(r+"Student Added");
					System.out.println("***********************************************");
					System.out.println();
					break;
				}
				case 2: {
					List<Student> allStudent = studentDao.getAllStudent();
					for(Student st:allStudent) {
						System.out.println("Id"+st.getStudentId());
						System.out.println("Name:"+st.getName());
						System.out.println("City:"+st.getCity());
					}
					break;
				}
				case 3: {
					System.out.println("Enter USer Id");
					int userId=Integer.parseInt(br.readLine());
						Student student = studentDao.getStudent(userId);
						System.out.println("Id"+student.getStudentId());
						System.out.println("Name:"+student.getName());
						System.out.println("City:"+student.getCity());
						
					break;
				}
				case 4: {
					System.out.println("Enter USer Id");
					int userId=Integer.parseInt(br.readLine());
						studentDao.deleteStudent(userId);
						System.out.println("Student Deleted Successfully");
					break;
				}
				case 5: {
					
					studentDao.updtaeStudent(null);
					break;
				}
				case 6: {
						
					go=false;
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + input);
				}
			} catch (Exception e) {
				System.out.println("Invaild try Anather Number");
				System.out.println(e.getMessage());
			}
			System.out.println("Thank For Using Thi Application");
		}
		
	
	}
}