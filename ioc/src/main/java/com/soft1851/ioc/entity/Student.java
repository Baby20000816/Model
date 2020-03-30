package com.soft1851.ioc.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author jh_wu
 * @ClassName Student
 * @Description TODO
 * @Date 2020/3/17:9:48
 * @Version 1.0
 **/
public class Student {
    private Integer id;
    private String name;
    private List<String> hobbies;
    private Set<Phone> phones;
    private Map<String, Phone> phoneMap;

    public Student(Integer id, String name, List<String> hobbies, Set<Phone> phones, Map<String, Phone> phoneMap) {
        this.id = id;
        this.name = name;
        this.hobbies = hobbies;
        this.phones = phones;
        this.phoneMap = phoneMap;
    }
    public Student() {
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getHobbies() {
        return hobbies;
    }
    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
    public Set<Phone> getPhones() {
        return phones;
    }
    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }
    public Map<String, Phone> getPhoneMap() {
        return phoneMap;
    }
    public void setPhoneMap(Map<String, Phone> phoneMap) {
        this.phoneMap = phoneMap;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                ", phones=" + phones +
                ", phoneMap=" + phoneMap +
                '}';
    }
}
