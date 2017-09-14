import java.util.*;

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
 class IllegalArgumentException extends Exception{  
 IllegalArgumentException(String s){  
  super(s);  
 }  
}  
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	 int l;
	public StudentGroup(int length) {
		this.students = new Student[length];
		
		l=length;
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if (student == null){
		throw new IllegalArgumentException("IllegalArgumentException");}
		else{
		this.students=students;}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index <0 || index >=students.length){
		throw new IllegalArgumentException("IllegalArgumentException");}
		else{
		return students[index];}
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if (student == null)
			throw new IllegalArgumentException("IllegalArgumentException");
		if(index <0 || index >=students.length){
		throw new IllegalArgumentException("IllegalArgumentException");}
      else{
	  this.students[index]=student; 
	  }
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if (student == null)
			throw new IllegalArgumentException("IllegalArgumentException");
		if(index <0 || index >=students.length){
		throw new IllegalArgumentException("IllegalArgumentException");}
		else{
		
		students[0]=student;
		}
		
		}
		
		
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if (student == null)
			throw new IllegalArgumentException("IllegalArgumentException");
		else{
		students[l-1]=student;
		}
		
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if (student == null)
			throw new IllegalArgumentException("IllegalArgumentException");
		if(index <0 || index >=students.length){
		throw new IllegalArgumentException("IllegalArgumentException");}
		else{
		students[index]=student;	
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index <0 || index >=students.length){
		throw new IllegalArgumentException("IllegalArgumentException");}
		else{
		students[index]=null;
		}
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if (student == null)
			throw new IllegalArgumentException("IllegalArgumentException");
		int flag=0;
		for(int i=0;i<l;i++)
		{
			if(students[i].id==student.id&&students[i].fullName==student.fullName){
				{
					flag=1;
					students[i].id=null;
					break;
				}
				if(flag==0)
				{
					throw new IllegalArgumentException("Student not exist");
				}
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index <0 || index >=students.length){
		throw new IllegalArgumentException("IllegalArgumentException");}
		else{
		for(int i=index+1;i<l;i++)
		{
			students[i]=null;
		}
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		
		if (student == null){
		throw new IllegalArgumentException("IllegalArgumentException");}
		else{
		int flag=0,i;
		for( i=0;i<l;i++)
		{
			if(students[i].id==student.id&&students[i].fullName==student.fullName){
				{
					flag=1;
					students[i].id=null;
					break;
				}
		
		}
		
		}
		if(i!=l)
		{
		for(int j=i+1;j<l;j++)
		{
			students[j]=null;
		}
		}
		
		}
		
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index <0 || index >=students.length){
		throw new IllegalArgumentException("IllegalArgumentException");}
		else{
			for(int i=0;i<=index;i++)
			{
			students[i]=null;
			}
			
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if (student == null){
		throw new IllegalArgumentException("IllegalArgumentException");}
		else{
			int flag=0,i;
		for( i=0;i<l;i++)
		{
			if(students[i].id!=student.id&&students[i].fullName!=student.fullName){
				{
					students[i]=null;
				}
		}
		}
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int n=this.students.length;
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-i-1;j++)
				if((this.students[j]).isGreaterThan(this.students[j+1]))
				{
                                   Student student= new Student();
				    student=this.students[i];
				    this.students[i]=this.students[j];
		    		    this.students[j]=student;	
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		if(date==null){
			throw new IllegalArgumentException("IllegalArgumentException");}
		int i;
		for( i=0;i<l;i++)
		{
			if((students[i].date).compareTO(date))
				break;
		}
		return students[i];
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		if(firstDate==null ||lastDate==null)
		{
			throw new IllegalArgumentException("IllegalArgumentException");}
			for(int i=0;i<l;i++){
			for(Date d=firstDate;d<=lastDate;d++)
			{
				if(students[i].date==d)
					return students[i];
			}
			}
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		if(date==null ||days==0)
		{
			throw new IllegalArgumentException("IllegalArgumentException");}
			
			for(int i=0;i<l;i++)
		{
			if(students[i].date==date)
				return students[i];
		}
		
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		if(indexOfStudent <0 || indexOfStudent >=students.length){
		throw new IllegalArgumentException("IllegalArgumentException");}
		for(int i=0;i<l;i++)
		{
			return java.util.Date()-students[i].getBirthDate;
			
		}
		
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		if(age<0)
			{
			throw new IllegalArgumentException("IllegalArgumentException");}
		for(int i=0;i<l;i++)
		{
			if(students[i].age==age)
				return students[i];
		}
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		for(int i=0;i<l;i++)
		{
			for(j=i+1;j<l;j++)
			{
			if(students[i].avgMark>students[i].avgMark)
				return students[i];
		}
	}
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		 int i=this.students.length;
		int index1=0;
             for(int j=0;j<i;j++)
		if((this.students[j]).equals(student))
		{index1=j;
		break;
                }
        	return this.students[index1+1];
		
	}
}
