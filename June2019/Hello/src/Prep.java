public class Prep {
    public static void main(String[] args) {
        int i = 200;
        float f = i;

        f = 200;
    }
    public boolean isInteger(String s) {
        if(s.isEmpty()){
            return false;
        }
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1){
                    return false;
                } else {
                    continue;
                }
            }

            if(Character.digit(s.charAt(i), 10) < 0){
                return false;
            }
        }

        return true;
    }
    class Person {
        int pid;
        String name;

        public Person(int pid, String name) {
            this.pid = pid;
            this.setPersonName(name);
        }

        public void setPersonName(String name) {
            this.name = name;
        }
    }

}
