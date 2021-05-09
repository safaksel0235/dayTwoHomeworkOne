package dayTwoHomeworkOne;
public class Main {
	public static void main(String[] args) {
//referans nesneleri olusturuldu
		Account line1 = new Account("profiliDuzenle");
		Account line2 = new Account("uyelikleriYonet");
		Account line3 = new Account("kartBilgisiEkleVeyaDegistir");
		Account line4 = new Account("adress");
		Account line5 = new Account("iletisim");
		Account line6 = new Account("cikis");
		
		Account[] lines = {line1,line2,line3,line4,line5,line6};//dizi olusturuldu
		for(Account line:lines) {
			System.out.println(line.name);
		}
//referans nesneleri olusturuldu
		Course myCourse1 = new Course(1,"c#","Engin","Demirog");
		Course myCourse2 = new Course(2,"Java","Engin","Demirog");
		Course allCourses1 = new Course(1,"c#","Engin","Demirog"); 
		Course allCourses2 = new Course(2,"Java","Engin","Demirog");	
		Course allCourses3 = new Course(3,"progIntro","Engin","Demirog");

		Course[] myCourses = {myCourse1,myCourse2};//dizi olusturuldu
		for(Course myCourse:myCourses) {
			System.out.println(myCourse.courseName +" "+ myCourse.authorName +" "+ myCourse.authorSurName);
		}
		
		Course[] allCourses = {allCourses1,allCourses2,allCourses3};//dizi olusturuldu
		for(Course allCourse:allCourses) {
			System.out.println(allCourse.courseName +" "+ allCourse.authorName +" "+ allCourse.authorSurName);
		}	
// Coursemanager classi icinde start ve start2 metodlari cagirildi.		
		CourseManager courseManager = new CourseManager();
		courseManager.start(myCourse1);
		courseManager.start(myCourse2);
		courseManager.start2(allCourses1);
		courseManager.start2(allCourses2);
		courseManager.start2(allCourses3);			
	}	
}
