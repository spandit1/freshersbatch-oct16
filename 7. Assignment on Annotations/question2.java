package assignment7;

@interface info {
	
}


@info
class Details {
	int AuthorId;
	String Author;
	String Date;
	String Time;
	float Version;
	
	public Details(int authorId, String author, String date, String time, double d) {
		AuthorId = authorId;
		Author = author;
		Date = date;
		Time = time;
		Version = (float) d;
	}	
	
}

public class question2 {

	public static void main(String[] args) {
		Details author1= new Details(1, " Soumyadeep ", " 02/11/2017", " 12:54pm ", 0.1);
		Details author2= new Details(2, " Arijeet ", " 03/08/2017", " 5:30pm ", 1.1);
		Details author3= new Details(3, " Subham ", " 17/12/2018", " 8:30am ", 1.2);
		Details author4= new Details(3, " Prasanjit ", " 01/05/2021", " 2.15pm ", 1.3);
		
		System.out.println(author1.AuthorId  +author1.Author  +author1.Date +author1.Time +author1.Version);
		System.out.println(author2.AuthorId  +author2.Author  +author2.Date +author2.Time +author2.Version);
		System.out.println(author3.AuthorId  +author3.Author  +author3.Date +author3.Time +author3.Version);
		System.out.println(author4.AuthorId  +author4.Author  +author4.Date +author4.Time +author4.Version);
	}

}