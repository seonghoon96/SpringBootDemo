package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class Member
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //DB가 알아서 ID 생성
    private Long id;

    private String name;

    public Long getId(){
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
