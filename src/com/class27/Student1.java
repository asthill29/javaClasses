package com.class27;

public class Student1 {
	public void studyy() {
	System.out.println("Student needs  to study");
}

private void doHomework() {
	System.out.println("Student needs  to do homework");
}

protected void research() {
	System.out.println("Student needs  to do research");
}

void attendClasses() {
	System.out.println("Student needs  to do attend classes");
}
}

class SyntaxStudent1 extends Student1 {
//@Override -- we are not overriding, 
//child class having it is own method doHomework();
private void doHomework() {
	System.out.println("Student needs  to do homework");
}

@Override
public void studyy() {
	System.out.println("Syntax Student need to study a lot");
}
@Override
public void research() {
	System.out.println("Syntax Student needs  to do a lot of research");
}
@Override
protected void attendClasses() {
	System.out.println("Syntax Student needs  to do ALL attend classes");
}	

}