package common;
//상속관계 클래스
public class person {
	public String name;
	public int age;
	
	public person() {
	}
	
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//객체의 정보 반환용 메소드, 기능을 나눌수 있음
	public String getInfo() {
		return String.format("이름: %s, 나이:%d,",name, age);
	}
	//객체의 정보 출력용 메소드
	public void showInfo() {
		System.out.println(getInfo());
		
//		System.out.println("이름:"+ name); : 기존 출력방식
	}
	
	/*
	 Set컬렉션에서 객체 저장시 동일한 객체인지 확인하기 위해
	 아래 2개의  메소드를 자동으로 호출하여 확인한다.
	 따라서 개발자가 정의한 객체인 경우 중복제거를 위해 반드시
	 오버라이딩 해야한다.
	 */
	@Override
	public int hashCode() { //hashCode=객체가가진 주소값 참조값
		//해쉬코드값은 동일한 문자를 치더라도 다 다르게 나온다.
		return (name.hashCode()+age) % 3; //둘다 비교. 나누니 중복제거,,?
//		return name.hashCode() % 3; //이름만 비교
//		return (age) % 3; //나이만 비교
	}
	
	@Override
	public boolean equals(Object obj) {
		person comparePerson = (person)obj;
		System.out.println("오버라이딩한 equals()메소드 호출됨");
		
		if(comparePerson.age==this.age && comparePerson.name.equals(this.name))//둘다비교
//		if(comparePerson.name.equals(this.name))//이름만비교
//		if(comparePerson.age==this.age)//나이만비교
		{
			return true; //똑같으면 true, 기존 오버라이딩?과 반대 
		}
		else {
			return false;
		}
	}
}
