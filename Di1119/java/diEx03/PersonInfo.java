package diEx03;

public class PersonInfo {
    private Person person;

    //기본 생성자
    public PersonInfo(){

    }
    //인자 생성자
    public PersonInfo(Person person){
        this.person = person;
    }

    //메소드
    public void getPersonInfo(){
        if(person != null){
            System.out.println("이름: " + person.getName());
            System.out.println("성별: " + person.getGender());
            System.out.println("나이: " + person.getAge());
            System.out.println("주민등록번호: " + person.getIdNo());
        }
    }

    public void setPerson(Person person){
        this.person = person;
    }
}
