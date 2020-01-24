package readingnotes.chpt5;

public static class Person {
        String firstName;
        String lastName;
        int age;

        private String getFirstName(){
            return this.firstName;
        }
        private String getLastName(){
            return this.lastName;
        }
        private int getAge(){
            return this.age;
        }
        private void setFirstName(String firstName){
            this.firstName = firstName;
        }
        private void setLastName(String lastName){
            this.lastName = lastName;
        }
        private void setAge(int age){
            this.age = age;
            if (age < 0 || age > 100){
                this.age = 0;
            }
        }
        public boolean isTeen(){
            if (age > 12 && age < 20){
            }
            return false;
        }
        public String getFullName(){
            String fullName = new String();
            if (firstName.isEmpty() && lastName.isEmpty()){
                fullName= "";
            }else if (firstName.isEmpty()){
                fullName= lastName;
            }else if (lastName.isEmpty()){
                fullName= firstName;
            }
            return fullName;
        }
    }

