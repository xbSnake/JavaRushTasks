package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Глубокое клонирование карты
*/
public class Solution implements  Cloneable {

    @Override
    protected Solution clone() throws CloneNotSupportedException {
        Solution sol = new Solution();
        sol.users = new LinkedHashMap<>();
        for(Map. Entry<String, User> pair : this.users.entrySet()){
            sol.users.put(pair.getKey(), pair.getValue().clone());
        }

        return sol;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements  Cloneable{
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }
        public boolean equals(Object o){
            if (o == this) return  true;
            if (o == null) return  false;
            if ( !(o instanceof  User ))return false;
            User user = (User)o;

            if (age != user.age ) return false;
            if (name != user.name) return  false;
            return  true;

        }
        public int hashCode(){
            int result = age;
            result = 31 * result + (name == null ? 0 : name.hashCode());
            return result;
        }

        @Override
        protected User clone() throws CloneNotSupportedException {


            User us = new User(this.age, this.name);

            return us;
        }
    }
}
