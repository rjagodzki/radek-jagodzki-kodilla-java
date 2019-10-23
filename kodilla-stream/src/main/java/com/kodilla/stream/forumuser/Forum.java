package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();
    private  LocalDate localDate;
    public Forum() {
        userList.add(new ForumUser(1,"CzerwonyDywan98",'M',localDate.of(2010, 2,10), 10));
        userList.add(new ForumUser(2,"Madzia96", 'M',localDate.of(1996,10,10), 1));
        userList.add(new ForumUser(3,"Laskoracz95", 'M',localDate.of(2019,10,22),10));
        userList.add(new ForumUser(4,"Twardy69", 'M',localDate.of(2010,10,1),12));
        userList.add(new ForumUser(5,"MiekkaSciana", 'F', localDate.of(2010,11,14),5));
        userList.add(new ForumUser(6,"NieDostajePrezentowNaGwiazdke", 'M',localDate.of(1999,12,23),100));
        userList.add(new ForumUser(7, "ChoryNaWszystko",'M',localDate.of(2002,1,1),15));
        userList.add(new ForumUser(8,"kurczak",'F',localDate.of(2000, 2,10), 1));
        userList.add(new ForumUser(9,"EricCartman",'M',localDate.of(1990, 2,10), 12));
        userList.add(new ForumUser(10,"PeterGriffin",'M',localDate.of(2010, 2,10), 0));
    }


    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
