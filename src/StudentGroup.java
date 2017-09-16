import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	public int len;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		this.len=length;
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(len<1)
			return null;
		else
			return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 || index>len-1)
			return null;
		else
			return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		Student s[]=new Student[len+1];
		int i;
		len++;
		for(i=1;i<len;i++)
			s[i]=students[i-1];
		s[0]=student;
		students=s;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		Student s[]=new Student[len+1];
		len++;
		s[len-1]=student;
		students=s;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		Student s[]=new Student[len+1];
		len++;
		int i;
		for(i=0;i<index;i++)
			s[i]=students[i];
		s[index]=student;
		for(i=index;i<len-1;i++)
			s[i+1]=students[i];
		students=s;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		int i;
		for(i=index;i<len-1;i++)
			students[i]=students[i+1];
		len--;
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int i;
		for(i=0;i<len;i++)
		{
			if(students[i]==student && i!=len-1)
			{
				students[i]=students[i+1];
				len--;
			}
			if(students[i]==student && i==len-1)
				len--;
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		len=index;
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		int i;
		for(i=0;i<len;i++)
		{
			if(students[i]==student)
			{
				len=i+1;
			}
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		int i,j=0;
		for(i=index+1;i<len;i++)
			students[j++]=students[i];
		len=j;
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		int i;
		for(i=0;i<len;i++)
		{
			if(students[i]==student&& i<len-1)
				return students[i+1];
		}
		return null;
	}
}
