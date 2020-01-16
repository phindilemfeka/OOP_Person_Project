public class Person {
        private String name;
        private int Age;
        private String gender;
        private String[] interests;

        public Person(String name, int Age, String gender, String[] interests) {
            this.name=name;
            this.Age=Age;
            this.gender=gender;
            this.interests=interests;
        }

        public String Hello(){
            String something="";


            for (int i=0;i<interests.length;i++){
                something+=interests[i];
                if (i<interests.length-2){
                    something+=", ";
                }
                else if (i==interests.length-2){
                    something+=" and ";

                    for (int j=0;j==name.length();j++){
                        something+=name;
                        if (j==name.length()+1){
                            something+=" is";
                        }

                    }
                }


            }

            System.out.print( "Hello my name is "+ name +" and I am "+ Age +"years old."+"My interests are ");


            return something;
        }
    }



