package AbstractionsExample;

    abstract  class Boy {
        private String boyName;

        public abstract void Student();

        String BoyName(String name) {
            return name;
        }
    }
    class Student extends Boy{

        @Override
        public void Student() {
            System.out.println("he is a student of a Student class ");
        }
         public void StudentClass(){
             System.out.println("Student class is 12th ");
         }
        }

//    public class Student {
//        public static void main(String[] args) {
//
//        }
//
//    }



