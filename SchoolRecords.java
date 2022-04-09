public class SchoolRecords {
	String schoolName;
	int schoolId;
	String schoolAddress;
	void ddRecords() {
		schoolName="Maharishi Vidya Mandir";
		schoolId=1;
		schoolAddress="Chetput,Chennai";
	}
	void dispRecords() {
		System.out.println("schoolName:"+schoolName);
		System.out.println("schoolId:"+schoolId);
		System.out.println("schoolAddress:"+schoolAddress);
	}
}
public class TesterSchoolRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolRecords sr=new SchoolRecords();
		sr.ddRecords();
		sr.dispRecords();
		System.out.println("completed");
	}

}